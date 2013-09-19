/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula;

import Horario.Dia;
import java.util.ArrayList;

/**
 *
 * @author GeOrge
 */
public abstract class Aula {
    
    private String nombre;
    private int numero;
    private String ubicacion;
    private int capacidad;
    private ArrayList<Dia> horario = new ArrayList<>();
    
    public Aula(String _nombre, int _numero, String _ubicacion, int _capacidad) {
        nombre = _nombre;
        numero = _numero;
        ubicacion = _ubicacion;
        capacidad = _capacidad;
    }
    
    public void agregar(Dia _horario) {
        horario.add(_horario);
    }
    
    public abstract void agregar(String objeto);
}
