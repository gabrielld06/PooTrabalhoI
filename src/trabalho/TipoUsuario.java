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
public class TipoUsuario {
    private Usuario usuario;
    
    public TipoUsuario(Usuario u) {
        this.usuario = u;
    }
    
    public TipoUsuario() {
        
    }
    
    public void menu() {
        usuario.menu();
    }
    
    public void cadastraPaciente(Dados dados) {
        usuario.cadastraPaciente(dados);
    }
    
    public void atualizaPaciente() {
        usuario.atualizaPaciente();
    }
    
    public void removePaciente() {
        usuario.removePaciente();
    }
    
    public void cadastraConsulta() {
        usuario.cadastraConsulta();
    }
    
    public void atualizaConsulta() {
        usuario.atualizaConsulta();
    }
    
    public void removeConsulta() {
        usuario.removeConsulta();
    }
    
    public void gerarRelatorio() {
        usuario.gerarRelatorio();
    }
    
}
