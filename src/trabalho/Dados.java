/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class Dados {

    private ArrayList<Paciente> listaPacientes = new ArrayList();
    private ArrayList<Consulta> listaConsultas = new ArrayList();
    private int idConsulta = 1;

    public void cadastraProntuario(int i, Prontuario prontuario) {
        listaPacientes.get(i).setProntuario(prontuario);
    }

    public void atualizaProntuario(int i, String sintomas, String diagnosticoDoenca, String prescricaoTratamento) {
        if (!sintomas.equals("")) {
            listaPacientes.get(i).getProntuario().setSintomas(sintomas);
        }
        if (!diagnosticoDoenca.equals("")) {
            listaPacientes.get(i).getProntuario().setDiagnosticoDoenca(diagnosticoDoenca);
        }
        if (!prescricaoTratamento.equals("")) {
            listaPacientes.get(i).getProntuario().setPrescricaoTratamento(prescricaoTratamento);
        }
    }

    public void removeProntuario(int i) {
        listaPacientes.get(i).setProntuario(null);
    }

    public void cadastraDadosAdicionais(int i, DadosAdicionais dadosAdicionais) {
        listaPacientes.get(i).setDadosAdicionais(dadosAdicionais);
    }

    public void atualizaDadosAdicionais(int i, String fuma, String bebe, String colesterol, String diabete, String doençaCardiaca, String cirurgias, String alergias) {
        if (!fuma.equals("")) {
            listaPacientes.get(i).getDadosAdicionais().setFuma(fuma);
        }
        if (!bebe.equals("")) {
            listaPacientes.get(i).getDadosAdicionais().setBebe(bebe);
        }
        if (!colesterol.equals("")) {
            listaPacientes.get(i).getDadosAdicionais().setColesterol(colesterol);
        }
        if (!diabete.equals("")) {
            listaPacientes.get(i).getDadosAdicionais().setDiabete(diabete);
        }
        if (!doençaCardiaca.equals("")) {
            listaPacientes.get(i).getDadosAdicionais().setDoençaCardiaca(doençaCardiaca);
        }
        if (!cirurgias.equals("")) {
            listaPacientes.get(i).getDadosAdicionais().setCirurgias(cirurgias);
        }
        if (!alergias.equals("")) {
            listaPacientes.get(i).getDadosAdicionais().setAlergias(alergias);
        }
    }

    public void removeDadosAdicionais(int i) {
        listaPacientes.get(i).setDadosAdicionais(null);
    }

    public void adicionaPaciente(Paciente paciente) {
        listaPacientes.add(paciente);
    }

    public void adicionaConsulta(Consulta consulta) {
        consulta.setIdConsulta(idConsulta);
        idConsulta++;
        listaConsultas.add(consulta);
    }

    public boolean removePaciente(int i) {
        return listaPacientes.remove(listaPacientes.get(i));
    }

    public boolean removeConsulta(int i) {
        return listaConsultas.remove(listaConsultas.get(i));
    }

    public int encontraPaciente(String nomePaciente) {
        for (int i = 0; i < listaPacientes.size(); i++) {
            if (listaPacientes.get(i).getNome().equals(nomePaciente)) {
                return i;
            }
        }
        return -1;
    }

    public int encontraConsulta(int id) {
        for (int i = 0; i < listaConsultas.size(); i++) {
            if (listaConsultas.get(i).getIdConsulta() == id) {
                return i;
            }
        }
        return -1;
    }

    public void atualizaPaciente(int i, String novoNome, String dataNascimento, String endereco, Contato contato, String convenio) {
        Paciente paciente = listaPacientes.get(i);
        if (!novoNome.equals("")) {
            paciente.setNome(novoNome);
        }
        if (!dataNascimento.equals("")) {
            paciente.setDataNascimento(dataNascimento);
        }
        if (!endereco.equals("")) {
            paciente.setEndereco(endereco);
        }
        if (!contato.getEmail().equals("") && contato.getTelefone().equals("")) {
            Contato contatoNovo = new Contato(paciente.getContato().getTelefone(), contato.getEmail());
            paciente.setContato(contatoNovo);
        } else if (!contato.getTelefone().equals("") && contato.getEmail().equals("")) {
            Contato contatoNovo = new Contato(contato.getTelefone(), paciente.getContato().getEmail());
            paciente.setContato(contatoNovo);
        } else if (!contato.getEmail().equals("") && !contato.getTelefone().equals("")) {
            Contato contatoNovo = new Contato(contato.getTelefone(), contato.getEmail());
            paciente.setContato(contatoNovo);
        }
        if (!convenio.equals("")) {
            paciente.setConvenio(convenio);
        }
    }

    public void atualizaConsulta(int i, LocalDate data, String horario, String medico, Paciente paciente, String tipo) {
        if (!(data.toString().equals("0001-01-01"))) {
            listaConsultas.get(i).setData(data);
        }
        if (!horario.equals("")) {
            listaConsultas.get(i).setHorario(horario);
        }
        if (!medico.equals("")) {
            listaConsultas.get(i).setMedico(medico);
        }
        if (paciente != null) {
            listaConsultas.get(i).setPaciente(paciente);
        }
        if (!tipo.equals("")) {
            listaConsultas.get(i).setTipo(tipo);
        }
    }

    public void listaPacientes() {
        if (!listaPacientes.isEmpty()) {
            System.out.println("===========PACIENTES===========");
            for (int i = 0; i < listaPacientes.size(); i++) {
                System.out.println((i + 1) + " - " + listaPacientes.get(i).getNome());
                System.out.println("    " + listaPacientes.get(i).getDataNascimento());
                System.out.println("    " + listaPacientes.get(i).getEndereco());
                System.out.println("    " + listaPacientes.get(i).getContato());
                System.out.println("    " + listaPacientes.get(i).getConvenio());
                if (listaPacientes.get(i).getProntuario() != null) {
                    System.out.println("-=Prontuarios=-");
                    System.out.println("Sintomas: " + listaPacientes.get(i).getProntuario().getSintomas());
                    System.out.println("Diagnostico: " + listaPacientes.get(i).getProntuario().getDiagnosticoDoenca());
                    System.out.println("Prescrição tratamento: " + listaPacientes.get(i).getProntuario().getPrescricaoTratamento());
                }
                if (listaPacientes.get(i).getDadosAdicionais() != null) {
                    System.out.println("-=Dados Adicionais=-");
                    System.out.println("Fuma: " + listaPacientes.get(i).getDadosAdicionais().getFuma());
                    System.out.println("Doença cardiaca: " + listaPacientes.get(i).getDadosAdicionais().getDoençaCardiaca());
                    System.out.println("Colesterol: " + listaPacientes.get(i).getDadosAdicionais().getColesterol());
                    System.out.println("Bebe: " + listaPacientes.get(i).getDadosAdicionais().getBebe());
                    System.out.println("Diabete: " + listaPacientes.get(i).getDadosAdicionais().getDiabete());
                    System.out.println("Cirurgias: " + listaPacientes.get(i).getDadosAdicionais().getCirurgias());
                    System.out.println("Alergias: " + listaPacientes.get(i).getDadosAdicionais().getAlergias());
                }
                System.out.println("-------------------------------");
            }
            System.out.println("===============================");
        }
    }

    public void listaConsultas() {
        if (!listaConsultas.isEmpty()) {
            System.out.println("===========CONSULTAS===========");
            for (int i = 0; i < listaConsultas.size(); i++) {
                System.out.println((i + 1) + " - " + listaConsultas.get(i).getIdConsulta());
                System.out.println("    " + listaConsultas.get(i).getData());
                System.out.println("    " + listaConsultas.get(i).getHorario());
                System.out.println("    " + listaConsultas.get(i).getMedico());
                System.out.println("    " + listaConsultas.get(i).getPaciente().getNome());
                System.out.println("    " + listaConsultas.get(i).getTipo());
                System.out.println("-------------------------------");
            }
            System.out.println("===============================");
        }
    }
    
    public void listaProntuario() {
        if (!listaPacientes.isEmpty()) {
            System.out.println("===========PRONTUARIO===========");
            for (int i = 0; i < listaPacientes.size(); i++) {
                System.out.println((i + 1) + " - " + listaPacientes.get(i).getProntuario().getSintomas());
                System.out.println("    " + listaPacientes.get(i).getProntuario().getDiagnosticoDoenca());
                System.out.println("    " + listaPacientes.get(i).getProntuario().getPrescricaoTratamento());
                System.out.println("-------------------------------");
            }
            System.out.println("===============================");
        }
    }

    public Paciente getPaciente(int i) {
        return listaPacientes.get(i);
    }
    
    public ArrayList<Consulta> getPacientesDiaSeguinte() {
        ArrayList<Consulta> consultas = new ArrayList();
        for(Consulta i : listaConsultas) {
            if(i.getData().equals(LocalDate.now().plusDays(1))) {
                consultas.add(i);
            }
        }
        return consultas;
    }

}
