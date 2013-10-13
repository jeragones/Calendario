/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.Aula;

import java.util.ArrayList;


/**
 *
 * @author Daniel Berrocal
 * @author Jorge Rojas
 */
public class Clase extends Aula {
    
    private boolean acondicionado;
    private ArrayList<String> multimedia = new ArrayList<>();
    
    public Clase(String _nombre, int _numero, String _ubicacion, int _capacidad, boolean _acondicionado) {
        super(_nombre, _numero, _ubicacion, _capacidad);
        acondicionado = _acondicionado;
    }

    public boolean isAcondicionado() {
        return acondicionado;
    }

    public ArrayList<String> getMultimedia() {
        return multimedia;
    }
    
    @Override
    public void agregar(String _multimedia) {
        multimedia.add(_multimedia);
    }
}
