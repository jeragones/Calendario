/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.Horario;

import Datos.Aula.Aula;


/**
 * Clase horario, esta clase implemeta la interface java.io.Serializable para poder guardarla y cargarla del fichero como un objeto 
 * @author Daniel Berrocal
 * @author Jorge Rojas
 */
public class Horario implements java.io.Serializable {
    
    private String horaInicio;
    private String horaFinal;
    private boolean estado;
    
    /**
     * Constructor de la clase horario
     * @param _inicio Hora inicio 
     * @param _final Hora final
     */
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
