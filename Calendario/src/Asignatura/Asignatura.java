/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Asignatura;

import Aula.Aula;
import Horario.Dia;
import java.util.ArrayList;

/**
 *
 * @author GeOrge
 */
public abstract class Asignatura {
    
    private String codigo;
    private String nombre;
    private int grupo;
    private int semestre;
    private int creditos;
    private ArrayList<Dia> horario = new ArrayList<>();
    private int tipoSemestre;
    
    public Asignatura(String _codigo, String _nombre, int _grupo, int _semestre, int _creditos) {
        codigo = _codigo;
        nombre = _nombre;
        grupo = _grupo;
        semestre = _semestre;
        creditos = _creditos;
        tipoSemestre = _semestre % 2; // 0 = semestre I, 1 = semestre II
    }
    
    /*public void agregar(Aula _aula) {
        aula.add(_aula);
    }*/
}
