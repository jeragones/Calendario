/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.Horario;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Daniel Berrocal
 * @author Jorge Rojas
 */
public class Dia implements java.io.Serializable {
    
    private String dia;
    private ArrayList<Horario> horario = new ArrayList<>();
    
    public Dia(String _dia) {
        dia = _dia;
    }

    public String getDia() {
        return dia;
    }

    public ArrayList<Horario> getHorario() {
        return horario;
    }
    
    public void agregar(Horario _horario) {
        horario.add(_horario);
    }
}
