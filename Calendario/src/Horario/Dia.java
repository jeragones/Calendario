/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Horario;

import Aula.Aula;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GeOrge
 */
public class Dia {
    
    private String dia;
    private ArrayList<Horario> horario = new ArrayList<>();
    private Aula aula;
    
    public Dia(String _dia) {
        dia = _dia;
    }
    
    public void agregar(Horario _horario) {
        horario.add(_horario);
    }
    
    public void agregar(Aula _aula) {
        aula = _aula;
    }
}
