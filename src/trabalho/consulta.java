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
public class Consulta {
    private String data;
    private String horario;
    private String medico;
    private String paciente;
    private String tipo;
    private Prontuario prontuario;

    public Consulta(String data, String horario, String medico, String paciente, String tipo) {
        this.data = data;
        this.horario = horario;
        this.medico = medico;
        this.paciente = paciente;
        this.tipo = tipo;
    }
    
}
