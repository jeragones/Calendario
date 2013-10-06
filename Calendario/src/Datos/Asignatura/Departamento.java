/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.Asignatura;

import Datos.Usuario.Profesor;
import java.util.ArrayList;

/**
 *
 * @author GeOrge
 */
public class Departamento implements java.io.Serializable {

    private String departamento;
    private ArrayList<Asignatura> asignatura = new ArrayList<>(); 
    private ArrayList<Profesor> profesor = new ArrayList<>(); 
    
    public Departamento(String _departamento) {
        departamento = _departamento;
    }
    
    public ArrayList<Asignatura> getAsignatura() {
        return asignatura;
    }

    public ArrayList<Profesor> getProfesor() {
        return profesor;
    }
    
    public Profesor getProfesor(String nombre) {
        for(int i=0; i < profesor.size(); i++) {
            if(profesor.get(i).getNombre().equals(nombre))
                return profesor.get(i);
        }
        return null;
    }

    public String getDepartamento() {
        return departamento;
    }
    
    public void agregar(Asignatura _asignatura) {
        asignatura.add(_asignatura);
    }
    
    public void agregar(Profesor _profesor) {
        profesor.add(_profesor);
    }
    
    
}
