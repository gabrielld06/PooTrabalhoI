package trabalho;

public class Paciente {
    private String nome;
    private String dataNascimento;
    private String endereco;
    private Contato contato;
    private String convenio;
    private DadosAdicionais dadosAdicionais;
    private Prontuario prontuario;
    
    public Paciente() {
        
    }    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public DadosAdicionais getDadosAdicionais() {
        return dadosAdicionais;
    }

    public void setDadosAdicionais(DadosAdicionais dadosAdicionais) {
        this.dadosAdicionais = dadosAdicionais;
    }
   
    public Prontuario getProntuario(){
        return this.prontuario;
    }
    
    public void setProntuario(Prontuario prontuario){
        this.prontuario = prontuario;
    }
    
 }
