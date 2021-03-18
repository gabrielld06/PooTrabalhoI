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
public class consulta {
    private String data;
    private String horario;
    private String medico;
    private String paciente;
    private String tipo;
    private String prontuario;

    public consulta(String data, String horario, String medico, String paciente, String tipo, String prontuario) {
        this.data = data;
        this.horario = horario;
        this.medico = medico;
        this.paciente = paciente;
        this.tipo = tipo;
        this.prontuario = prontuario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }
    
}
