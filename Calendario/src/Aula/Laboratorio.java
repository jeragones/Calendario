/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula;

import calendario.Interface;
import java.util.List;

/**
 *
 * @author GeOrge
 */
public class Laboratorio extends Aula implements Interface {
    
    private List<String> equipo;
    
    public Laboratorio(String _nombre, int _numero, String _ubicacion, int _capacidad) {
        super(_nombre, _numero, _ubicacion, _capacidad);
    }
    
    @Override
    public void agregar(String _equipo) {
        equipo.add(_equipo);
    }
}
