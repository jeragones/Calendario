/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Horario;

import Aula.Aula;

/**
 *
 * @author GeOrge
 */
public class Horario {
    
    private String horaInicio;
    private String horaFinal;
    private Aula aula;
    
    public Horario(String _inicio, String _final) {
        horaInicio = _inicio;
        horaFinal = _final;
    }
    
    public void agregar(Aula _aula) {
        aula = _aula;
    }
}
