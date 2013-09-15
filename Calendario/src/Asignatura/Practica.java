/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Asignatura;

import java.util.List;

/**
 *
 * @author GeOrge
 */
public class Practica extends Asignatura{
    
    private String sistema;
    private List<String> material;
    
    public Practica(String _nombre, int _grupo, int _semestre, int _creditos, /*Departamento _departamento, */boolean _tipo, String _sistema) {
        super(_nombre, _grupo, _semestre, _creditos, _tipo);
        sistema = _sistema;
    }
    
    public void agregar(String _material) {
        material.add(_material);
    }
}
