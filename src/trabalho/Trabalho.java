/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

/**
 *
 * @author Gabriel
 */
public class Trabalho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        secretaria s = new secretaria();
        paciente novo = s.cadastro("Gabriel", "06/08/2001", "Rua Fon", "449177013", "particular", "");
        System.out.println("Paciente: " + novo.getNome());
        System.out.println("Data Nascimento: " + novo.getDataNascimento());
        System.out.println("Endereco: " + novo.getEndereco());
        System.out.println("Contato: " + novo.getContato());
        System.out.println("Convenio: " + novo.getConvenio());
        System.out.println("Dados adicionais: " + novo.getDadosAdicionais());
    }
    
}
