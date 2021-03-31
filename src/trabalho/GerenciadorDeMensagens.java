/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class GerenciadorDeMensagens extends Usuario {

    public GerenciadorDeMensagens() {
        
    }
    
    public void enviarMensagens(Dados dados) {
        ArrayList<Consulta> listaConsultasDiaSeguinte = dados.getPacientesDiaSeguinte();
        if(!listaConsultasDiaSeguinte.isEmpty()) {
            for(Consulta i : listaConsultasDiaSeguinte) {
                if(i.getPaciente().getContato().equals("Telefone")) {
                    System.out.println("SMS enviado");
                } else {
                    System.out.println("Email enviado");
                }
            }
        }
        
    }
}
