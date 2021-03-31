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
public class GerenciadorDeMensagens extends Usuario {

    public GerenciadorDeMensagens() {
        
    }
    
    public void menu() {
        System.out.println("\n======= MENU =======");
        System.out.println("1 - Enviar mensagens");
        System.out.println("2 - Sair");
        System.out.print("Insira a opcao: ");
    }
    
    public void enviarMensagens(Dados dados) {
        ArrayList<Consulta> listaConsultasDiaSeguinte = dados.getPacientesDiaSeguinte();
        String email;
        String telefone;
        if(!listaConsultasDiaSeguinte.isEmpty()) {
            for(Consulta i : listaConsultasDiaSeguinte) {
                email = i.getPaciente().getContato().getEmail();
                telefone = i.getPaciente().getContato().getTelefone();
                if(email.equals("") && !telefone.equals("")) {
                    System.out.println("SMS enviado para " + telefone);
                } else if(!email.equals("") && telefone.equals("")) {
                    System.out.println("Email enviado " + email);
                } else if(!email.equals("") && !telefone.equals("")) {
                    System.out.println("SMS enviado " + telefone);
                    System.out.println("Email enviado " + email);
                }
            }
        }
        
    }
}
