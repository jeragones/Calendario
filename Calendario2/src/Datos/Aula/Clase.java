/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.Aula;

import java.util.ArrayList;


/**
 * Clase Aula de tipo clase
 * @author Daniel Berrocal
 * @author Jorge Rojas
 */
public class Clase extends Aula {
    
    private boolean acondicionado;
    private ArrayList<String> multimedia = new ArrayList<>();
    
    /**
     * Constructor de la clase 
     * @param _nombre Nombre del aula
     * @param _numero Numero del aula
     * @param _ubicacion Ubicacion del aula
     * @param _capacidad Capacidad maxima de alumnos
     * @param _acondicionado Atributo que permite identificar si el aula cuenta con aire acondicionado
     */
    public Clase(String _nombre, int _numero, String _ubicacion, int _capacidad, boolean _acondicionado) {
        super(_nombre, _numero, _ubicacion, _capacidad);
        acondicionado = _acondicionado;
    }

    /**
     * Metodo para consulta si el aula cuent con aire acondicionado
     * @return Retorna true en caso de que posea a/c o false en caso contrario
     */
    public boolean isAcondicionado() {
        return acondicionado;
    }

    /**
     * Metodo para consultar el equipo multimedia con el que cuanta el aula
     * @return Retorna la lista con los equipos
     */
    public ArrayList<String> getMultimedia() {
        return multimedia;
    }
    
    /**
     * Metodo para agregar un equipo multimedia a la lista de equipos
     * @param _multimedia Nuevo equipo
     */
    @Override
    
    public void agregar(String _multimedia) {
        multimedia.add(_multimedia);
    }
}
