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
    
    public void atualizaPaciente(Dados dados) {
        usuario.atualizaPaciente(dados);
    }
    
    public void removePaciente(Dados dados) {
        usuario.removePaciente(dados);
    }
    
    public void cadastraConsulta(Dados dados) {
        usuario.cadastraConsulta(dados);
    }
    
    public void atualizaConsulta(Dados dados) {
        usuario.atualizaConsulta(dados);
    }
    
    public void removeConsulta(Dados dados) {
        usuario.removeConsulta(dados);
    }
    
    public void gerarRelatorio() {
        usuario.gerarRelatorio();
    }
    
    public void enviarMensagens(Dados dados) {
        usuario.enviarMensagens(dados);
    }
    
}
