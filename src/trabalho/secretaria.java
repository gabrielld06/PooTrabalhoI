package trabalho;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Secretaria extends Usuario {

    public Secretaria() {
        
    }
    
    // Imprime em tela o menu de opções do usuario Secretaria 
    // e gerencia a interação com o sistema
    public boolean menu(Dados dados) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("\n======== MENU ========");
        System.out.println("1 - Cadastrar Paciente");
        System.out.println("2 - Atualizar Paciente");
        System.out.println("3 - Remover Paciente");
        System.out.println("4 - Cadastrar Consulta");
        System.out.println("5 - Atualizar Consulta");
        System.out.println("6 - Remover Consulta");
        System.out.println("7 - Gerar Relatorio de Consulta");
        System.out.println("8 - Sair");
        System.out.print("Insira a opcao: ");
        String opcaoMenu = leitura.nextLine();
        switch(opcaoMenu) {
            case "1":
                cadastraPaciente(dados);
                break;
            case "2":
                atualizaPaciente(dados);
                break;
            case "3":
                removePaciente(dados);
                break;
            case "4":
                cadastraConsulta(dados);
               break;
            case "5":
                atualizaConsulta(dados);
                break;
            case "6":
                removeConsulta(dados);
                break;
            case "7":
                gerarRelatorio(dados);
                break;
            case "8":
                System.out.println("Finalizando sessão");
                return false;
            case "0":
                dados.listaPacientes();
                dados.listaConsultas();
                break;
            default:
                System.out.println("Opcao invalida");
            }
        return true;
    }
    
    // Recebe as informações do usuario para realizar o cadastro de um novo paciente nos dados
    public void cadastraPaciente(Dados dados) {
        Scanner leitura = new Scanner(System.in);
        Paciente novoPaciente = new Paciente();
        System.out.print("\nDigite o nome do paciente: ");
        String nome = leitura.nextLine();
        System.out.print("\nDigite a data de nascimento do paciente: ");
        String dataNascimento = leitura.nextLine();
        System.out.print("\nDigite o endereco do paciente: ");
        String endereco = leitura.nextLine();
        System.out.print("\nDigite o contato do paciente:");
        System.out.print("\nPrecione \"Enter\", caso nao queira inserir um dos metodos");
        System.out.print("\nTe↕efone: ");
        String contatoTelefone = leitura.nextLine();
        System.out.print("\nEmail: ");
        String contatoEmail = leitura.nextLine();
        Contato contato = new Contato(contatoTelefone, contatoEmail);
        System.out.print("\nDigite o convenio do paciente: ");
        String convenio = leitura.nextLine();
        
        novoPaciente.setNome(nome);
        novoPaciente.setDataNascimento(dataNascimento);
        novoPaciente.setEndereco(endereco);
        novoPaciente.setContato(contato);
        novoPaciente.setConvenio(convenio);
        
        dados.adicionaPaciente(novoPaciente);
        
        System.out.println("\nPaciente cadastrado com sucesso");
    }
    
    // Recebe as informações do usuario para atualizar um paciente nos dados
    public void atualizaPaciente(Dados dados) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("\nDigite o nome do paciente a ser atualizado: ");
        String nome = leitura.nextLine();
        int indice = dados.encontraPaciente(nome);
        if(indice != -1) {
            System.out.print("\nDigite as informações a serem atualizadas");
            System.out.print("\nPrecione \"Enter\", caso nao queira alterar uma informação");
            System.out.print("\nDigite o novo nome do paciente: ");
            String novoNome = leitura.nextLine();
            System.out.print("\nDigite a nova data de nascimento do paciente: ");
            String dataNascimento = leitura.nextLine();
            System.out.print("\nDigite o novo endereco do paciente: ");
            String endereco = leitura.nextLine();
            System.out.print("\nDigite o novo contato do paciente: ");
            System.out.print("\nTe↕efone: ");
            String contatoTelefone = leitura.nextLine();
            System.out.print("\nEmail: ");
            String contatoEmail = leitura.nextLine();
            Contato contato = new Contato(contatoTelefone, contatoEmail);
            System.out.print("\nDigite o novo convenio do paciente: ");
            String convenio = leitura.nextLine();
            
            dados.atualizaPaciente(indice, novoNome, dataNascimento, endereco, contato, convenio);
            
            System.out.println("\nPaciente atualizado com sucesso");
        } else {
            System.out.println("\nPaciente não encontrado");
        }
    }
    
    // Recebe uma string do usuario e remove um paciente com esse nome dos dados
    // caso exista um, caso contrario, apenas imprime "Paciente não encontrado"
    public void removePaciente(Dados dados) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("\nDigite o nome do paciente a ser removido: ");
        String nome = leitura.nextLine();
        int indice = dados.encontraPaciente(nome);
        if(indice != -1) {
            dados.removePaciente(indice);
            System.out.println("\nPaciente removido com sucesso");
        } else {
            System.out.println("\nPaciente não encontrado");
        }
    }
    
    // Recebe as informações do usuario para realizar o cadastro de uma nova consulta nos dados
    public void cadastraConsulta(Dados dados) {
        Scanner leitura = new Scanner(System.in);
        Consulta novaConsulta = new Consulta();
        System.out.print("\nDigite a data da consulta no formato \"aaaa-mm-dd\":");
        LocalDate data = LocalDate.of(0001,01,01);
        try {
            data = LocalDate.parse(leitura.nextLine());
        } catch(Exception ex) {
            System.out.println("Formato invalido");
        }
        System.out.print("\nDigite o horario da consulta: ");
        String horario = leitura.nextLine();
        System.out.print("\nDigite o nome do medico: ");
        String nomeMedico = leitura.nextLine();
        System.out.print("\nDigite o nome do paciente: ");
        String nomePaciente = leitura.nextLine();
        int indice = dados.encontraPaciente(nomePaciente);
        if(indice != -1) {
            System.out.print("\nDigite o tipo da consulta: ");
            String tipo = leitura.nextLine();

            novaConsulta.setData(data);
            novaConsulta.setHorario(horario);
            novaConsulta.setMedico(nomeMedico);
            novaConsulta.setPaciente(dados.getPaciente(indice));
            novaConsulta.setTipo(tipo);

            dados.adicionaConsulta(novaConsulta);

            System.out.println("\nConsulta cadastrada com sucesso");
            System.out.println("ID da consulta: " + (dados.getIdConsulta()-1));
        } else {
            System.out.println("\nPaciente não encontrado");
        }
    }
    
    // Recebe as informações do usuario para atualizar uma consulta nos dados
    public void atualizaConsulta(Dados dados) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("\nDigite o Id da consulta a ser atualizada: ");
        int id = leitura.nextInt();
        leitura.nextLine();
        int indice = dados.encontraConsulta(id);
        if(indice != -1) {
            System.out.print("\nDigite as informações a serem atualizadas");
            System.out.print("\nPrecione \"Enter\", caso nao queira alterar uma informação");
            System.out.print("\nDigite a data da consulta no formato \"aaaa-mm-dd\":");
            String dataNova = leitura.nextLine();
            LocalDate data = LocalDate.of(0001,01,01);
            if(!dataNova.equals("")) {
                try {
                    data = LocalDate.parse(dataNova);
                } catch(Exception ex) {
                    System.out.println("Formato invalido");
                }
            }
            System.out.print("\nDigite o horario da consulta: ");
            String horario = leitura.nextLine();
            System.out.print("\nDigite o tipo da consulta: ");
            String tipo = leitura.nextLine();
            System.out.print("\nDigite o nome do medico: ");
            String nomeMedico = leitura.nextLine();
            System.out.print("\nDigite o nome do paciente: ");
            String nomePaciente = leitura.nextLine();
            if(!nomePaciente.equals("")) {
                int indicePaciente = dados.encontraPaciente(nomePaciente);
                if(indicePaciente != -1) {
                    Paciente paciente = dados.getPaciente(indicePaciente);
                    dados.atualizaConsulta(indice, data, horario, nomeMedico, paciente, tipo);
                    System.out.println("\nConsulta atualizada com sucesso");
                } else {
                    System.out.println("\nPaciente não encontrado");
                }
            } else {
                dados.atualizaConsulta(indice, data, horario, nomeMedico, null, tipo);
                System.out.println("\nConsulta atualizada com sucesso");
            }
        } else {
            System.out.println("\nConsulta não encontrada");
        }
    }
    
    // Recebe um int do usuario e remove uma consulta com esse ID dos dados
    // caso exista um, caso contrario, apenas imprime "Consulta não encontrada"
    public void removeConsulta(Dados dados) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("\nDigite o nome da consulta a ser removida: ");
        int id = leitura.nextInt();
        leitura.nextLine();
        int indice = dados.encontraConsulta(id);
        if(indice != -1) {
            dados.removeConsulta(indice);
            System.out.println("\nConsulta removida com sucesso");
        } else {
            System.out.println("\nConsulta não encontrada");
        }
    }
    
    // Gera o relatorio de consultas relativas ao dia seguinte
    public void gerarRelatorio(Dados dados) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("\nFiltros disponiveis para busca:");
        System.out.println("1 - Email");
        System.out.println("2 - Telefone");
        System.out.println("0 - Nenhum");
        System.out.print("Digite o filtro de busca: ");
        int filtro = leitura.nextInt();
        leitura.nextLine();
        System.out.println("");
        ArrayList<Consulta> consultasDiaSeguinte = dados.getConsultasDiaSeguinte(filtro);
        if(!consultasDiaSeguinte.isEmpty()) {
            System.out.println("Relatorio de consultas marcadas para amanhã");
            System.out.println("-------------------------------------------");
            int i = 1;
            for(Consulta consulta : consultasDiaSeguinte) {
                System.out.println(i + " - " + consulta.getIdConsulta());
                System.out.println("Horario: " + consulta.getHorario());
                System.out.println("Medico: " + consulta.getMedico());
                System.out.println("Paciente: " + consulta.getPaciente().getNome());
                System.out.println("Tipo: " + consulta.getTipo());
                System.out.println("-------------------------------------------");
                i++;
            }
        } else if (filtro >= 0 && filtro <= 2) {
            System.out.println("Nenhuma consulta encontrada com o filtro selecionado");
        }
    }
    
}
