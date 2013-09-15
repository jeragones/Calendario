/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Horario;

import java.util.List;

/**
 *
 * @author GeOrge
 */
public class Dia {
    
    private String dia;
    private List<Horario> horario;
    
    public Dia(String _dia) {
        dia = _dia;
    }
    
    public void agregar(Horario _horario) {
        horario.add(_horario);
    }
}
