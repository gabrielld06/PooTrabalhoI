package trabalho;

import java.util.Scanner;
public class Trabalho {
    
    public static void menuEscolhaUsuario() {
        System.out.println("Selecione o tipo de usuario");
        System.out.println("1 - Secretaria");
        System.out.println("2 - Medico");
        System.out.println("3 - Gerenciador de Mensagens");
        System.out.println("4 - Sair");
    }
    
    public static TipoUsuario configurarUsuario(String opcao) {
        switch(opcao) {
            case "1":
                Secretaria secretaria = new Secretaria();
                return new TipoUsuario(secretaria);
            case "2":
                Medico medico = new Medico();
                return new TipoUsuario(medico);
            case "3":
                GerenciadorDeMensagens gerenciador = new GerenciadorDeMensagens();
                return new TipoUsuario(gerenciador);
            case "4":
                System.out.println("Finalizando programa");
                break;
            default:
                System.out.println("Opcao invalida");
        }
        return null;
    }
    

    public static void main(String[] args) {
        Dados dados = new Dados();
        Scanner leitura = new Scanner(System.in);
        String opcaoUsuario;
        
        do {
            menuEscolhaUsuario();
            opcaoUsuario = leitura.nextLine();
            TipoUsuario usuario = configurarUsuario(opcaoUsuario);
            boolean continua;
            if(usuario != null) {
                do {
                    continua = usuario.menu(dados);
                } while(continua);
            }
        } while(!opcaoUsuario.equals("4"));

        leitura.close();
    }
    
}
