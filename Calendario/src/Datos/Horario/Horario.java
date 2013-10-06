/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.Horario;

import Datos.Aula.Aula;

/**
 *
 * @author GeOrge
 */
public class Horario implements java.io.Serializable {
    
    private String horaInicio;
    private String horaFinal;
    private boolean estado;
    
    public Horario(String _inicio, String _final) {
        horaInicio = _inicio;
        horaFinal = _final;
        estado = true;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    public void setEstado(boolean _estado) {
        estado = _estado;
    }
}
