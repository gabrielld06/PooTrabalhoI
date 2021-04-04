package trabalho;

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
