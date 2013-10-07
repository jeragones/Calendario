/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.Asignatura;

import Datos.Usuario.Profesor;
import java.util.ArrayList;

/**
 * Clase Departamento la cual contendra una lista de asignaturas y una lista de profesores
 * @author Daniel Berrocal
 * Jorge Rojas
 */
public class Departamento implements java.io.Serializable {
    
    private String departamento;
    private ArrayList<Asignatura> asignatura = new ArrayList<>(); 
    private ArrayList<Profesor> profesor = new ArrayList<>(); 
    
    /**
     * Constructor de la clase.
     * @param _departamento Nombre del departamento
     */
    public Departamento(String _departamento) {
        departamento = _departamento;
    }
    
    /**
     * Metod que obtiene la lista de asignaturas que pertenecen al departamento
     * @return Retorna la lista de asignaturas
     */
    public ArrayList<Asignatura> getAsignatura() {
        return asignatura;
    }
    
    /**
     * Metodo que obtiene la lista de profesores que pertenecen al departamento 
     * @return Retorna la lista de profesores
     */
    public ArrayList<Profesor> getProfesor() {
        return profesor;
    }
    
    /**
     * Metodo que obtiene un profesor de la lista de profesores pertenecientes al departamento
     * @param nombre Nombre del Profesor
     * @return Retorna el profesor
     */
    public Profesor getProfesor(String nombre) {
        for(int i=0; i < profesor.size(); i++) {
            if(profesor.get(i).getNombre().equals(nombre))
                return profesor.get(i);
        }
        return null;
    }
    
    /**
     * Metodo que obtiene el nombe del departamento
     * @return Retorna el nombre del departamento
     */
    public String getDepartamento() {
        return departamento;
    }
    
    /**
     * Metodo que agrega una nueva asigantura a la lista de asignaturas del departamento
     * @param _asignatura Nueva asigantura
     */
    public void agregar(Asignatura _asignatura) {
        asignatura.add(_asignatura);
    }
    
    /**
     * Metodo que agrega un nuevo profesor a la lista de profesores del departamento 
     * @param _profesor Nuevo profesor
     */
    public void agregar(Profesor _profesor) {
        profesor.add(_profesor);
    }
    
    
}
