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
                System.out.println("Opcao invalidada");
        }
        return null;
    }
    

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Dados dados = new Dados();
        int opcaoUsuario, opcaoMenu;
        
        do {
            menuEscolhaUsuario();
            opcaoUsuario = leitura.nextInt();
            TipoUsuario usuario = configurarUsuario(opcaoUsuario);
            if(usuario != null) {
                do {
                    usuario.menu();
                    opcaoMenu = leitura.nextInt();
                    switch(opcaoMenu) {
                        case 1:
                            usuario.cadastraPaciente(dados);
                            break;
                        case 2:
                            usuario.atualizaPaciente(dados);
                            break;
                        case 3:
                            usuario.removePaciente(dados);
                            break;
                        case 4:
                            usuario.cadastraConsulta(dados);
                            break;
                        case 5:
                            usuario.atualizaConsulta(dados);
                            break;
                        case 6:
                            usuario.removeConsulta(dados);
                            break;
                        case 7:
                            usuario.gerarRelatorio();
                            break;
                        case 8:
                            System.out.println("Finalizando sessão");
                            break;
                        case 9:
                            usuario.enviarMensagens(dados);
                            break;
                        case 0:
                            dados.listaPacientes();
                            dados.listaConsultas();
                            break;
                        default:
                            System.out.println("Opcao invalidada");
                    }
                } while(opcaoMenu != 8);
            }
        } while(opcaoUsuario != 4);

        leitura.close();
    }
    
}
