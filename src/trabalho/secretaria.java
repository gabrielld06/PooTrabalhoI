/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.time.LocalDate;
import java.util.Scanner;


/**
 *
 * @author Gabriel
 */
public class Secretaria extends Usuario {

    public Secretaria() {
        
    }
    
    public void menu() {
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
    }
    
    public void cadastraPaciente(Dados dados) {
        Scanner leitura = new Scanner(System.in);
        Paciente novoPaciente = new Paciente();
        System.out.print("\nDigite o nome do paciente: ");
        String nome = leitura.nextLine();
        System.out.print("\nDigite a data de nascimento do paciente: ");
        String dataNascimento = leitura.nextLine();
        System.out.print("\nDigite o endereco do paciente: ");
        String endereco = leitura.nextLine();
        System.out.print("\nDigite o contato do paciente: ");
        String contato = leitura.nextLine();
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
            String contato = leitura.nextLine();
            System.out.print("\nDigite o novo convenio do paciente: ");
            String convenio = leitura.nextLine();
            
            dados.atualizaPaciente(indice, novoNome, dataNascimento, endereco, contato, convenio);
            
            System.out.println("\nPaciente atualizado com sucesso");
        } else {
            System.out.println("\nPaciente não encontrado");
        }
    }
    
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

            System.out.println("\nConsulta cadastrado com sucesso");
        } else {
            System.out.println("\nPaciente não encontrado");
        }
    }
    
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
            if(!dataNova.isBlank()) {
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
            if(!nomePaciente.isBlank()) {
                int indicePaciente = dados.encontraPaciente(nomePaciente);
                if(indicePaciente != -1) {
                    Paciente paciente = dados.getPaciente(indicePaciente);
                    dados.atualizaConsulta(indice, data, horario, nomeMedico, paciente, tipo);
                    System.out.println("\nConsulta atualizado com sucesso");
                } else {
                    System.out.println("\nPaciente não encontrado");
                }
            } else {
                dados.atualizaConsulta(indice, data, horario, nomeMedico, null, tipo);
                System.out.println("\nConsulta atualizado com sucesso");
            }
        } else {
            System.out.println("\nConsulta não encontrado");
        }
    }
    
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
            System.out.println("\nConsutla não encontrada");
        }
    }
    
    public void gerarRelatorio() {
        
    }
    
}
