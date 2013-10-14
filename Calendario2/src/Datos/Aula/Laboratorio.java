/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.Aula;
import java.util.List;


/**
 * Aula de tipo laboratorio, esta tipo de aula cuenta con una lista de equipos
 * @author Daniel Berrocal
 * @author Jorge Rojas
 */
public class Laboratorio extends Aula {
    
    private List<String> equipo;
    
    /**
     * Constructor de la clase Laboratorio
     * @param _nombre
     * @param _numero
     * @param _ubicacion
     * @param _capacidad 
     */
    public Laboratorio(String _nombre, int _numero, String _ubicacion, int _capacidad) {
        super(_nombre, _numero, _ubicacion, _capacidad);
    }
    
    /**
     * Metodo para consultar la lista de equipos del laboratorio
     * @return Retorna una lista con los equipos
     */
    public List<String> getEquipo() {
        return equipo;
    }
    
    /**
     * Metodo para agregar un nuevo equipo a la lista de equipos
     * @param _equipo Nuevo equipo
     */
    @Override
    public void agregar(String _equipo) {
        equipo.add(_equipo);
    }
}
