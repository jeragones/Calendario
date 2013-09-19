/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Asignatura;
import calendario.Interface;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GeOrge
 */
public class Departamento implements Interface {

    private String departamento;
    private ArrayList<Asignatura> asignatura = new ArrayList<>(); 
    
    public Departamento(String _departamento) {
        departamento = _departamento;
    }
    
    public void agregar(Asignatura _asignatura) {
        asignatura.add(_asignatura);
    }
    
    public List<Asignatura> asignaturas() {
        return asignatura;
    }
}
