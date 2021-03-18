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
public class secretaria {
    
    public paciente cadastro(String nome, String dataNascimento, String endereco, String contato, String convenio, String dadosAdicionais) {
        return new paciente(nome, dataNascimento, endereco, contato, convenio, dadosAdicionais);
    }
    
    public void atualizaPaciente() {
        
    }
    
    public void removePaciente() {
        
    }
}
