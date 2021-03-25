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
        
        dados.adiciona(novoPaciente);
    }
    
    public void atualizaPaciente() {
        
    }
    
    public void removePaciente() {
        
    }
    
    public void cadastraConsulta() {
        
    }
    
    public void atualizaConsulta() {
        
    }
    
    public void removeConsulta() {
        
    }
    
    public void gerarRelatorio() {
        
    }
    
}
