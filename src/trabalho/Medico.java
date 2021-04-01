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
public class Medico extends Usuario {
    
    public Medico() {
        
    }
    
    // Imprime em tela o menu de opções do usuario Secretaria 
    // e gerencia a interação com o sistema
    public boolean menu(Dados dados) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("\n================== MENU ==================");
        System.out.println("1 - Cadastrar dados adicionais do Paciente");
        System.out.println("2 - Atualizar dados adicionais do Paciente");
        System.out.println("3 - Remover dados adicionais do Paciente");
        System.out.println("4 - Cadastrar prontuario do Paciente");
        System.out.println("5 - Atualizar prontuario do Paciente");
        System.out.println("6 - Remover prontuario do Paciente");
        System.out.println("7 - Gerar Relatorio Medico");
        System.out.println("8 - Sair");
        System.out.print("Insira a opcao: ");
        int opcaoMenu = leitura.nextInt();
        leitura.nextLine();
        switch(opcaoMenu) {
            case 1:
                cadastraPaciente(dados);
                break;
            case 2:
                atualizaPaciente(dados);
                break;
            case 3:
                removePaciente(dados);
                break;
            case 4:
                cadastraConsulta(dados);
               break;
            case 5:
                atualizaConsulta(dados);
                break;
            case 6:
                removeConsulta(dados);
                break;
            case 7:
                gerarRelatorio(dados);
                break;
            case 8:
                System.out.println("Finalizando sessão");
                return false;
            case 0:
                dados.listaPacientes();
                dados.listaConsultas();
                break;
            default:
                System.out.println("Opcao invalida");
            }
        return true;
    }
    
    public void cadastraPaciente(Dados dados) {
        Scanner leitura = new Scanner(System.in);
        DadosAdicionais dadosAdicionais = new DadosAdicionais();
        System.out.print("\nDigite o nome do paciente: ");
        String nome = leitura.nextLine();
        int indice = dados.encontraPaciente(nome);
        if(indice != -1) {
            System.out.print("\nDigite as informações a serem cadastradas");
            System.out.print("\nFumante [S/N]: ");
            String fuma = leitura.nextLine();
            System.out.print("\nComsome álcool [S/N]: ");
            String bebe = leitura.nextLine();
            System.out.print("\nValor do colesterol: ");
            String colesterol = leitura.nextLine();
            System.out.print("\nDiabete: ");
            String diabete = leitura.nextLine();
            System.out.print("\nDoença cardíaca: ");
            String doençaCardiaca = leitura.nextLine();
            System.out.print("\nCirurgias: ");
            String cirurgias = leitura.nextLine();
            System.out.print("\nAlergias: ");
            String alergias = leitura.nextLine();
            
            dadosAdicionais.setFuma(fuma);
            dadosAdicionais.setBebe(bebe);
            dadosAdicionais.setColesterol(colesterol);
            dadosAdicionais.setDiabete(diabete);
            dadosAdicionais.setDoençaCardiaca(doençaCardiaca);
            dadosAdicionais.setCirurgias(cirurgias);
            dadosAdicionais.setAlergias(alergias);
            dados.cadastraDadosAdicionais(indice, dadosAdicionais);
            System.out.println("\nPaciente cadastrado com sucesso");
        } else {
            System.out.println("\nPaciente não encontrado");
        }
    }
    
    public void atualizaPaciente(Dados dados) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("\nDigite o nome do paciente a atualizar os dados adicionais: ");
        String nome = leitura.nextLine();
        int indice = dados.encontraPaciente(nome);
        if(indice != -1) {
            System.out.print("\nDigite as informações a serem atualizadas");
            System.out.print("\nPrecione \"Enter\", caso nao queira alterar uma informação");
            System.out.print("\nFumante [S/N]: ");
            String fuma = leitura.nextLine();
            System.out.print("\nComsome álcool [S/N]: ");
            String bebe = leitura.nextLine();
            System.out.print("\nValor do colesterol: ");
            String colesterol = leitura.nextLine();
            System.out.print("\nDiabete: ");
            String diabete = leitura.nextLine();
            System.out.print("\nDoença cardíaca: ");
            String doençaCardiaca = leitura.nextLine();
            System.out.print("\nCirurgias: ");
            String cirurgias = leitura.nextLine();
            System.out.print("\nAlergias: ");
            String alergias = leitura.nextLine();
            dados.atualizaDadosAdicionais(indice, fuma, bebe, colesterol, diabete, doençaCardiaca, cirurgias, alergias);
            System.out.println("\nProntuário atualizado com sucesso.");
        }else{
            System.out.println("\nPaciente não encontrado");
        }
    }
    
    public void removePaciente(Dados dados) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("\nDigite o nome do paciente a remover os dados adicionais: ");
        String nome = leitura.nextLine();
        int indice = dados.encontraPaciente(nome);
        if(indice != -1) {
            dados.removeDadosAdicionais(indice);
            System.out.println("\nDados adicionais do paciente removidos com sucesso.");
        }else{
            System.out.println("\nPaciente não encontrado");
        }
    }
    
    public void cadastraConsulta(Dados dados) {
        Scanner leitura = new Scanner(System.in);
        Prontuario novoProntuario = new Prontuario();
        System.out.print("\nDigite o nome do paciente a cadastrar o prontuário: ");
        String nome = leitura.nextLine();
        int indice = dados.encontraPaciente(nome);
        if (indice != -1) {
            System.out.print("\nDigite os sintomas: ");
            String sintomas = leitura.nextLine();
            System.out.print("\nDigite a prescrição do tratamento: ");
            String prescricaoTratamento = leitura.nextLine();
            System.out.print("\nDigite o diagnóstico da doença: ");
            String diagnosticoDoenca = leitura.nextLine();

            novoProntuario.setSintomas(sintomas);
            novoProntuario.setPrescricaoTratamento(prescricaoTratamento);
            novoProntuario.setDiagnosticoDoenca(diagnosticoDoenca);
            dados.cadastraProntuario(indice, novoProntuario);
            System.out.println("\nProntuário cadastrado com sucesso");
        }else{
            System.out.println("\nPaciente não encontrado");
        }
    }
    
    public void atualizaConsulta(Dados dados) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("\nDigite o nome do paciente a atualizar o prontuário: ");
        String nome = leitura.nextLine();
        int indice = dados.encontraPaciente(nome);
        if (indice != -1) {
            System.out.print("\nDigite as informações a serem atualizadas");
            System.out.print("\nPrecione \"Enter\", caso nao queira alterar uma informação");
            System.out.print("\ndigite os sintomas: ");
            String sintomas = leitura.nextLine();
            System.out.print("\nDigite a prescrição do tratamento: ");
            String prescricaoTratamento = leitura.nextLine();
            System.out.print("\nigite o diagnóstico da doença: ");
            String diagnosticoDoenca = leitura.nextLine();
            dados.atualizaProntuario(indice, sintomas, diagnosticoDoenca, prescricaoTratamento);
            System.out.println("\nProntuário atualizado com sucesso");
        }else{
            System.out.println("\nPaciente não encontrado");
        }
    }
    
    public void removeConsulta(Dados dados) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("\nDigite o nome do paciente a remover o prontuário: ");
        String nome = leitura.nextLine();
        int indice = dados.encontraPaciente(nome);
        if (indice != -1) {
            dados.removeProntuario(indice);
            System.out.println("\nProntuário removido com sucesso");
        }else{
            System.out.println("\nPaciente não encontrado");
        }
    }
    
    public void gerarRelatorioReceita(Dados dados){
        Scanner leitura = new Scanner(System.in);
        System.out.print("\nDigite o nome do paciente: ");
        String nome = leitura.nextLine();
        int indice = dados.encontraPaciente(nome);
        if (indice != -1) {
            System.out.print("\nDigite a receita do paciente:");
            String receita = leitura.nextLine();
            System.out.print("\nReceita do paciente " + nome + ":");
            System.out.println("\n" + receita);
        }else{
            System.out.println("\nPaciente não encontrado");
        }
    }
    
    public void gerarRelatorioAtestado(Dados dados){
        Scanner leitura = new Scanner(System.in);
        System.out.print("\nDigite o nome do paciente: ");
        String nome = leitura.nextLine();
        int indice = dados.encontraPaciente(nome);
        if (indice != -1) {
            System.out.print("\nDigite o atestado do paciente:");
            String atestado = leitura.nextLine();
            System.out.print("\nAtestado do paciente " + nome + ":");
            System.out.println("\n" + atestado);
        }else{
            System.out.println("\nPaciente não encontrado");
        }
    }
    
    public void gerarRelatorioAcompanhamento(Dados dados){
        Scanner leitura = new Scanner(System.in);
        System.out.print("\nDigite o nome do paciente: ");
        String nome = leitura.nextLine();
        int indice = dados.encontraPaciente(nome);
        if (indice != -1) {
            System.out.print("\nDigite a declaração de acompanhamento:");
            String decAcompanhamento = leitura.nextLine();
            System.out.print("\nDeclaração de acompanhamento do paciente " + nome + ":");
            System.out.println("\n" + decAcompanhamento);
        }else{
            System.out.println("\nPaciente não encontrado");
        }
    }
    
    
    public void gerarRelatorio(Dados dados) {
        Scanner leitura = new Scanner(System.in);
        int opcaoMenu;
        do {
            System.out.println("Selecione o relatório para gerar:");
            System.out.println("1 - Gerar receita");
            System.out.println("2 - Gerar atestado");
            System.out.println("3 - Gerar declaração de acompanhamento");
            System.out.println("4 - Gerar clientes atendidos no mês");
            System.out.println("5 - Sair");
            opcaoMenu = leitura.nextInt();
            switch (opcaoMenu) {
                case 1:
                    gerarRelatorioReceita(dados);
                    break;
                case 2:
                    gerarRelatorioAtestado(dados);
                    break;
                case 3:
                    gerarRelatorioAcompanhamento(dados);
                    break;
                case 4:
                    ArrayList<Consulta> clientesMes = new ArrayList();
                    clientesMes = dados.getClientesMes();
                    if (!clientesMes.isEmpty()) {
                        System.out.println("\nClientes atendidos no mês: ");
                        for (int i = 0; i < clientesMes.size(); i++) {
                            System.out.println((i + 1) + " - " + clientesMes.get(i).getPaciente().getNome());
                        }
                    }else{
                        System.out.println("\nNenhum cliente foi atendido neste mês.");
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcao invalidada");
            }
        } while (opcaoMenu != 5);
    }

}
