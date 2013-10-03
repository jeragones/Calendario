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
public class Departamento {

    private String departamento;
    private static ArrayList<Asignatura> asignatura = new ArrayList<>(); 
    private static ArrayList<Profesor> profesor = new ArrayList<>(); 
    
    public Departamento(String _departamento) {
        departamento = _departamento;
    }
    
    public static ArrayList<Asignatura> getAsignatura() {
        return asignatura;
    }

    public static ArrayList<Profesor> getProfesor() {
        return profesor;
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
