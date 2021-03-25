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
    
    public void listaPacientes() {
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
