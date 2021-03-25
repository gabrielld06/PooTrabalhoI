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
        
    public void adiciona(Paciente paciente) {
        listaPacientes.add(paciente);
    }
    
    public boolean remove(Paciente paciente) {
        return listaPacientes.remove(paciente);
    }
    
    public int encontraPaciente(Paciente paciente) {
        for(int i = 0; i < listaPacientes.size(); i++) {
            if(listaPacientes.get(i).getNome().equals(paciente.getNome())) {
                return i;
            }
        }
        return -1;
    }
    
    public boolean atualiza(Paciente paciente) {
        int index = encontraPaciente(paciente);
        if(index != -1) {
            listaPacientes.set(index, paciente);
            return true;
        }
        return false;
    }
    
    public void listaPacientes() {
        System.out.println("===========PACIENTES===========");
        for(int i = 0; i < listaPacientes.size(); i++) {
            System.out.println((i+1) + " - " + listaPacientes.get(i).getNome());
        }
        System.out.println("===============================");
    }
    
}
