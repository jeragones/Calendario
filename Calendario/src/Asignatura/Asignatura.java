/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Asignatura;

import Aula.Aula;
import java.util.List;

/**
 *
 * @author GeOrge
 */
public abstract class Asignatura {
    
    private String nombre;
    private int grupo;
    private int semestre;
    private int creditos;
    //private Departamento departamento;
    private List<Aula> aula;
    private boolean tipoSemestre;
    
    public Asignatura(String _nombre, int _grupo, int _semestre, int _creditos, /*Departamento _departamento, */boolean _tipo) {
        nombre = _nombre;
        grupo = _grupo;
        semestre = _semestre;
        creditos = _creditos;
        tipoSemestre = _tipo;
    }
}
