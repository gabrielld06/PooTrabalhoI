package trabalho;

import java.time.LocalDate;
import java.util.ArrayList;

public class Dados {

    private ArrayList<Paciente> listaPacientes = new ArrayList();
    private ArrayList<Consulta> listaConsultas = new ArrayList();
    private int idConsulta = 1;

    // Retorna o ID da proxima consulta ser inserida
    // Utiliza para informar o ID da ultima consulta cadastrada
    public int getIdConsulta() {
        return idConsulta;
    }
    
    // Realiza o cadastro do prontuario do paciente no indice i do ArrayList listaPacientes
    public void cadastraProntuario(int i, Prontuario prontuario) {
        listaPacientes.get(i).setProntuario(prontuario);
    }
    
    // Atualiza o prontuario do paciente no indice i do ArrayList listaPacientes 
    // de acordo com as informações entregues pelo usuario. 
    // Caso uma informação seja vazia o dado não é alterado
    public void atualizaProntuario(int i, String sintomas, String diagnosticoDoenca, String prescricaoTratamento) {
        Paciente paciente = listaPacientes.get(i);
        if (!sintomas.equals("")) {
            paciente.getProntuario().setSintomas(sintomas);
        }
        if (!diagnosticoDoenca.equals("")) {
            paciente.getProntuario().setDiagnosticoDoenca(diagnosticoDoenca);
        }
        if (!prescricaoTratamento.equals("")) {
            paciente.getProntuario().setPrescricaoTratamento(prescricaoTratamento);
        }
    }
    
    // Exclui o prontuario do paciente no indice i do ArrayList listaPacientes
    public void removeProntuario(int i) {
        listaPacientes.get(i).setProntuario(null);
    }
    
    // Realiza o cadastro de dados adicionais do paciente no indice i do ArrayList listaPacientes
    public void cadastraDadosAdicionais(int i, DadosAdicionais dadosAdicionais) {
        listaPacientes.get(i).setDadosAdicionais(dadosAdicionais);
    }
    
    // Atualiza os dados adicionais do paciente no indice i do ArrayList listaPacientes 
    // de acordo com as informações entregues pelo usuario. 
    // Caso uma informação seja vazia o dado não é alterado
    public void atualizaDadosAdicionais(int i, String fuma, String bebe, String colesterol, String diabete, String doençaCardiaca, String cirurgias, String alergias) {
        Paciente paciente = listaPacientes.get(i);
        if (!fuma.equals("")) {
            paciente.getDadosAdicionais().setFuma(fuma);
        }
        if (!bebe.equals("")) {
            paciente.getDadosAdicionais().setBebe(bebe);
        }
        if (!colesterol.equals("")) {
            paciente.getDadosAdicionais().setColesterol(colesterol);
        }
        if (!diabete.equals("")) {
            paciente.getDadosAdicionais().setDiabete(diabete);
        }
        if (!doençaCardiaca.equals("")) {
            paciente.getDadosAdicionais().setDoençaCardiaca(doençaCardiaca);
        }
        if (!cirurgias.equals("")) {
            paciente.getDadosAdicionais().setCirurgias(cirurgias);
        }
        if (!alergias.equals("")) {
            paciente.getDadosAdicionais().setAlergias(alergias);
        }
    }
    
    // Exclui o prontuario do paciente no indice i do ArrayList listaPacientes
    public void removeDadosAdicionais(int i) {
        listaPacientes.get(i).setDadosAdicionais(null);
    }
    
    // Realiza o cadastro de um paciente no ArrayList listaPacientes
    public void adicionaPaciente(Paciente paciente) {
        listaPacientes.add(paciente);
    }
    
    // Realiza o cadastro de uma consulta no ArrayList listaConsultas e incrementa
    // idConsulta para uma proxima consulta
    public void adicionaConsulta(Consulta consulta) {
        consulta.setIdConsulta(idConsulta);
        idConsulta++;
        listaConsultas.add(consulta);
    }
    
    // Remove o paciente no indice i do ArrayList listaPacientes
    public boolean removePaciente(int i) {
        return listaPacientes.remove(listaPacientes.get(i));
    }
    
    // Remove a consulta no indice i do ArrayList listaConsultas
    public boolean removeConsulta(int i) {
        return listaConsultas.remove(listaConsultas.get(i));
    }
    
    // Faz a busca de um paciente com nome nomePaciente no ArrayList listaPacientes
    // e retorna seu indice caso encontrado ou -1 caso contrario.
    public int encontraPaciente(String nomePaciente) {
        for (int i = 0; i < listaPacientes.size(); i++) {
            if (listaPacientes.get(i).getNome().equals(nomePaciente)) {
                return i;
            }
        }
        return -1;
    }
    
    // Faz a busca de uma consulta com ID id no ArrayList listaConsultas
    // e retorna seu indice caso encontrado ou -1 caso contrario.
    public int encontraConsulta(int id) {
        for (int i = 0; i < listaConsultas.size(); i++) {
            if (listaConsultas.get(i).getIdConsulta() == id) {
                return i;
            }
        }
        return -1;
    }
    
    // Atualiza o paciente no indice i do ArrayList listaPacientes 
    // de acordo com as informações entregues pelo usuario. 
    // Caso uma informação seja vazia o dado não é alterado
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
    
    // Atualiza a consulta no indice i do ArrayList listaConsultas 
    // de acordo com as informações entregues pelo usuario. 
    // Caso uma informação seja vazia o dado não é alterado
    public void atualizaConsulta(int i, LocalDate data, String horario, String medico, Paciente paciente, String tipo) {
        Consulta consulta = listaConsultas.get(i);
        if (!(data.toString().equals("0001-01-01"))) {
            consulta.setData(data);
        }
        if (!horario.equals("")) {
            consulta.setHorario(horario);
        }
        if (!medico.equals("")) {
            consulta.setMedico(medico);
        }
        if (paciente != null) {
            consulta.setPaciente(paciente);
        }
        if (!tipo.equals("")) {
            consulta.setTipo(tipo);
        }
    }
    
    // Imprime em tela uma lista com os dados dos pacientes cadastrados no ArrayList
    public void listaPacientes() {
        if (!listaPacientes.isEmpty()) {
            System.out.println("===========PACIENTES===========");
            for (int i = 0; i < listaPacientes.size(); i++) {
                Paciente paciente = listaPacientes.get(i);
                System.out.println((i + 1) + " - " + paciente.getNome());
                System.out.println("    " + paciente.getDataNascimento());
                System.out.println("    " + paciente.getEndereco());
                System.out.println("    " + paciente.getContato());
                System.out.println("    " + paciente.getConvenio());
                Prontuario prontuario = paciente.getProntuario();
                if (prontuario != null) {
                    System.out.println("-=Prontuarios=-");
                    System.out.println("Sintomas: " + prontuario.getSintomas());
                    System.out.println("Diagnostico: " + prontuario.getDiagnosticoDoenca());
                    System.out.println("Prescrição tratamento: " + prontuario.getPrescricaoTratamento());
                }
                DadosAdicionais dadosAdicionais = paciente.getDadosAdicionais();
                if (dadosAdicionais != null) {
                    System.out.println("-=Dados Adicionais=-");
                    System.out.println("Fuma: " + dadosAdicionais.getFuma());
                    System.out.println("Doença cardiaca: " + dadosAdicionais.getDoençaCardiaca());
                    System.out.println("Colesterol: " + dadosAdicionais.getColesterol());
                    System.out.println("Bebe: " + dadosAdicionais.getBebe());
                    System.out.println("Diabete: " + dadosAdicionais.getDiabete());
                    System.out.println("Cirurgias: " + dadosAdicionais.getCirurgias());
                    System.out.println("Alergias: " + dadosAdicionais.getAlergias());
                }
                System.out.println("-------------------------------");
            }
            System.out.println("===============================");
        }
    }

    // Imprime em tela uma lista com os dados das consultas cadastrados no ArrayList
    public void listaConsultas() {
        if (!listaConsultas.isEmpty()) {
            System.out.println("===========CONSULTAS===========");
            for (int i = 0; i < listaConsultas.size(); i++) {
                Consulta consulta = listaConsultas.get(i);
                System.out.println((i + 1) + " - " + consulta.getIdConsulta());
                System.out.println("    " + consulta.getData());
                System.out.println("    " + consulta.getHorario());
                System.out.println("    " + consulta.getMedico());
                System.out.println("    " + consulta.getPaciente().getNome());
                System.out.println("    " + consulta.getTipo());
                System.out.println("-------------------------------");
            }
            System.out.println("===============================");
        }
    }
   
   // Retorna o objeto paciente no indice i do ArrayList listaPacientes
    public Paciente getPaciente(int i) {
        return listaPacientes.get(i);
    }
    
    // Faz a busca no ArrayList consultas de todas as consultas marcadas
    // para o dia seguinte, com ou sem filtro de contato, e retorna um ArrayList contendo elas
    public ArrayList<Consulta> getConsultasDiaSeguinte(int filtro) {
        ArrayList<Consulta> consultas = new ArrayList();
        switch (filtro) {
            case 0:
                //Sem filtro
                for(Consulta i : listaConsultas) {
                    if(i.getData().equals(LocalDate.now().plusDays(1))) {
                        consultas.add(i);
                    }
                }   break;
            case 1:
                //Filtro por email
                for(Consulta i : listaConsultas) {
                    if(i.getData().equals(LocalDate.now().plusDays(1)) &&
                            !i.getPaciente().getContato().getEmail().equals("")) {
                        consultas.add(i);
                    }
                }   break;
            case 2:
                //Filtro por celular
                for(Consulta i : listaConsultas) {
                    if(i.getData().equals(LocalDate.now().plusDays(1)) &&
                            !i.getPaciente().getContato().getTelefone().equals("")) {
                        consultas.add(i);
                    }
                }   break;
            default:
                System.out.println("Opcao invalida");
                break;
        }
        return consultas;
    }
    
    // Faz a busca no ArrayList consultas de todas as consultas marcadas
    // já atendidas e retorna um ArrayList contendo elas
    public ArrayList<Consulta> getClientesMes() {
        ArrayList<Consulta> clientesMes = new ArrayList();
        for(Consulta i : listaConsultas) {
            if((i.getData().getMonth() == LocalDate.now().getMonth()) && 
                    (i.getData().getYear() == LocalDate.now().getYear()) && 
                    (i.getData().getDayOfMonth() < LocalDate.now().getDayOfMonth())){
                clientesMes.add(i);
            }
        }
        return clientesMes;
    }
}
