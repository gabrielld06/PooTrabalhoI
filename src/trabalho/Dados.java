/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class Dados {
    private ArrayList<Paciente> listaPacientes = new ArrayList();
    private ArrayList<Consulta> listaConsultas = new ArrayList();
        
    public void adicionaPaciente(Paciente paciente) {
        listaPacientes.add(paciente);
    }
    
    public void adicionaConsulta(Consulta consulta) {
        listaConsultas.add(consulta);
    }
    
    public boolean removePaciente(int i) {
        return listaPacientes.remove(listaPacientes.get(i));
    }
    
    public boolean removeConsulta(int i) {
        return listaConsultas.remove(listaConsultas.get(i));
    }
    
    public int encontraPaciente(String nomePaciente) {
        for(int i = 0; i < listaPacientes.size(); i++) {
            if(listaPacientes.get(i).getNome().equals(nomePaciente)) {
                return i;
            }
        }
        return -1;
    }
    
    public int encontraConsulta(int id) {
        for(int i = 0; i < listaPacientes.size(); i++) {
            if(listaConsultas.get(i).getIdConsulta() == id) {
                return i;
            }
        }
        return -1;
    }
    
    public void atualizaPaciente(int i, String novoNome, String dataNascimento, String endereco, String contato, String convenio) {
        if(!novoNome.equals("")){
            listaPacientes.get(i).setNome(novoNome);
        }
        if(!dataNascimento.equals("")){
            listaPacientes.get(i).setDataNascimento(dataNascimento);
        }
        if(!endereco.equals("")){
            listaPacientes.get(i).setEndereco(endereco);
        }
        if(!contato.equals("")){
            listaPacientes.get(i).setContato(contato);
        }
        if(!convenio.equals("")){
            listaPacientes.get(i).setConvenio(convenio);
        }    
    }
    
    public void atualizaConsulta(int i, String data, String horario, String medico, Paciente paciente, String tipo) {
        if(!data.equals("")){
            listaConsultas.get(i).setData(data);
        }
        if(!horario.equals("")){
            listaConsultas.get(i).setHorario(horario);
        }
        if(!medico.equals("")){
            listaConsultas.get(i).setMedico(medico);
        }
        if(paciente != null){
            listaConsultas.get(i).setPaciente(paciente);
        }
        if(!tipo.equals("")){
            listaConsultas.get(i).setTipo(tipo);
        }
    }
    
    public void listaPacientes() {
        if(!listaPacientes.isEmpty()){
            System.out.println("===========PACIENTES===========");
            for(int i = 0; i < listaPacientes.size(); i++) {
                System.out.println((i+1) + " - " + listaPacientes.get(i).getNome());
                System.out.println("    " + listaPacientes.get(i).getDataNascimento());
                System.out.println("    " + listaPacientes.get(i).getEndereco());
                System.out.println("    " + listaPacientes.get(i).getContato());
                System.out.println("    " + listaPacientes.get(i).getConvenio());
                System.out.println("-------------------------------");
            }
            System.out.println("===============================");
        }
    }
    
    public void listaConsultas() {
        if(!listaConsultas.isEmpty()){
            System.out.println("===========CONSULTAS===========");
            for(int i = 0; i < listaConsultas.size(); i++) {
                System.out.println((i+1) + " - " + listaConsultas.get(i).getIdConsulta());
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
    
    public Paciente getPaciente(int i) {
        return listaPacientes.get(i);
    }
    
}
