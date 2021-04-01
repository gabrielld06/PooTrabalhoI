/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Trabalho {

    /**
     * @param args the command line arguments
     */
    
    public static void menuEscolhaUsuario() {
        System.out.println("Selecione o tipo de usuario");
        System.out.println("1 - Secretaria");
        System.out.println("2 - Medico");
        System.out.println("3 - Gerenciador de Mensagens");
        System.out.println("4 - Sair");
    }
    
    public static TipoUsuario configurarUsuario(int opcao) {
        switch(opcao) {
            case 1:
                Secretaria secretaria = new Secretaria();
                return new TipoUsuario(secretaria);
            case 2:
                Medico medico = new Medico();
                return new TipoUsuario(medico);
            case 3:
                GerenciadorDeMensagens gerenciador = new GerenciadorDeMensagens();
                return new TipoUsuario(gerenciador);
            case 4:
                System.out.println("Finalizando programa");
                break;
            default:
                System.out.println("Opcao invalida");
        }
        return null;
    }
    

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Dados dados = new Dados();
        int opcaoUsuario;
        
        do {
            menuEscolhaUsuario();
            opcaoUsuario = leitura.nextInt();
            TipoUsuario usuario = configurarUsuario(opcaoUsuario);
            boolean continua;
            if(usuario != null) {
                do {
                    continua = usuario.menu(dados);
                } while(continua);
            }
        } while(opcaoUsuario != 4);

        leitura.close();
    }
    
}
