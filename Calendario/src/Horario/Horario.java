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
public class Horario extends Dia{
    
    private String horaInicio;
    private String horaFinal;
    
    public Horario(String _dia, String _inicio, String _final) {
        super(_dia);
        horaInicio = _inicio;
        horaFinal = _final;
    }
}
