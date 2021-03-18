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
public class paciente {
    private String nome;
    private String dataNascimento;
    private String endereco;
    private String contato;
    private String convenio;
    private String dadosAdicionais;

    public paciente(String nome, String dataNascimento, String endereco, String contato, String convenio, String dadosAdicionais) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.contato = contato;
        this.convenio = convenio;
        this.dadosAdicionais = dadosAdicionais;
    }

    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDataNascimento() {
        return this.dataNascimento;
    }
    
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getContato() {
        return this.contato;
    }
    
    public void setContato(String contato) {
        this.contato = contato;
    }
    
    public String getConvenio() {
        return this.convenio;
    }
    
    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }
    
    public String getDadosAdicionais() {
        return this.dadosAdicionais;
    }
    
    public void setDadosAdicionais(String dadosAdicionais) {
        this.dadosAdicionais = dadosAdicionais;
    }
    
    
 }
