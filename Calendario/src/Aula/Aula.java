/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula;

import java.util.List;

/**
 *
 * @author GeOrge
 */
public abstract class Aula {
    
    private String nombre;
    private int numero;
    private String ubicacion;
    private int capacidad;
    //private List<Dia> horario;
    
    public Aula(String _nombre, int _numero, String _ubicacion, int _capacidad) {
        nombre = _nombre;
        numero = _numero;
        ubicacion = _ubicacion;
        capacidad = _capacidad;
    }
    
    public abstract void agregar(String objeto);
}
