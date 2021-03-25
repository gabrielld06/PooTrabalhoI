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
public class Paciente {
    private String nome;
    private String dataNascimento;
    private String endereco;
    private String contato;
    private String convenio;
    private DadosAdicionais dadosAdicionais;   
    
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

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
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
    
    
    
 }
