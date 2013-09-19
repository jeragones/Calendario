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
public class Clase extends Aula implements Interface {
    
    private boolean acondicionado;
    private List<String> multimedia;
    
    public Clase(String _nombre, int _numero, String _ubicacion, int _capacidad, boolean _acondicionado) {
        super(_nombre, _numero, _ubicacion, _capacidad);
        acondicionado = _acondicionado;
    }
    
    @Override
    public void agregar(String _multimedia) {
        multimedia.add(_multimedia);
    }
}
