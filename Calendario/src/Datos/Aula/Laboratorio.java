/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.Aula;
import java.util.List;


/**
 *
 * @author Daniel Berrocal
 * @author Jorge Rojas
 */
public class Laboratorio extends Aula {
    
    private List<String> equipo;
    
    public Laboratorio(String _nombre, int _numero, String _ubicacion, int _capacidad) {
        super(_nombre, _numero, _ubicacion, _capacidad);
    }

    public List<String> getEquipo() {
        return equipo;
    }
    
    @Override
    public void agregar(String _equipo) {
        equipo.add(_equipo);
    }
}
