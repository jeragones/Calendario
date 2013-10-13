/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.Aula;

import Datos.Horario.Dia;
import java.util.ArrayList;

/**
 *
 * @author Daniel Berrocal
 * @author Jorge Rojas
 */
public abstract class Aula implements java.io.Serializable {
    
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
    
    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public ArrayList<Dia> getHorario() {
        return horario;
    }
    
    public void agregar(Dia _horario) {
        horario.add(_horario);
    }
    
    public abstract void agregar(String objeto);
}
