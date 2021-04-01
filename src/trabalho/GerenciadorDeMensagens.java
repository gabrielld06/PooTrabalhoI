/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class GerenciadorDeMensagens extends Usuario {

    public GerenciadorDeMensagens() {
        
    }
    
    // Imprime em tela o menu de opções do Gerenciador de Mensagens 
    // e gerencia a interação com o sistema
    public boolean menu(Dados dados) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("\n======= MENU =======");
        System.out.println("1 - Enviar mensagens");
        System.out.println("2 - Sair");
        System.out.print("Insira a opcao: ");
        int opcaoMenu = leitura.nextInt();
        leitura.nextLine();
        switch(opcaoMenu) {
            case 1:
                enviarMensagens(dados);
                break;
            case 2:
                System.out.println("Finalizando sessão");
                return false;
            default:
                System.out.println("Opcao invalida");
        }
        return true;
    }
    
    // Simula o envio de mensagens para os pacientes com consultas
    // marcadas para o dia seguinte
    public void enviarMensagens(Dados dados) {
        ArrayList<Consulta> listaConsultasDiaSeguinte = dados.getConsultasDiaSeguinte(0);
        String email, telefone;
        Paciente paciente;
        if(!listaConsultasDiaSeguinte.isEmpty()) {
            for(Consulta i : listaConsultasDiaSeguinte) {
                paciente = i.getPaciente();
                email = paciente.getContato().getEmail();
                telefone = paciente.getContato().getTelefone();
                System.out.println();
                if(email.equals("") && !telefone.equals("")) {
                    System.out.println("SMS enviado para " + paciente.getNome());
                    System.out.println("Telefone: " + telefone);
                } else if(!email.equals("") && telefone.equals("")) {
                    System.out.println("Email enviado para " + paciente.getNome());
                    System.out.println("Email: " + email);
                } else if(!email.equals("") && !telefone.equals("")) {
                    System.out.println("SMS e email enviado para " + paciente.getNome());
                    System.out.println("Telefone: " + telefone);
                    System.out.println("Email: " + email);
                }
            }
        } else {
            System.out.println("Nenhuma consulta marcada para amanhã");
        }
        
    }
}
