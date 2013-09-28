/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Asignatura;
import Usuario.Profesor;
import calendario.Interface;
import java.util.ArrayList;

/**
 *
 * @author GeOrge
 */
public class Departamento implements Interface {

    private String departamento;
    private ArrayList<Asignatura> asignatura = new ArrayList<>(); 
    private ArrayList<Profesor> profesor = new ArrayList<>(); 
    
    public Departamento(String _departamento) {
        departamento = _departamento;
    }

    public String getDepartamento() {
        return departamento;
    }
    
    public void agregar(Asignatura _asignatura) {
        asignatura.add(_asignatura);
    }
    
    public ArrayList<Asignatura> asignaturas() {
        return asignatura;
    }
}
