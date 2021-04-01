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
    
    public boolean menu(Dados dados) {
        return usuario.menu(dados);
    }
}
