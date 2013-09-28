/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.Asignatura;

import java.util.ArrayList;

/**
 *
 * @author GeOrge
 */
public class Practica extends Asignatura {
    
    private String sistema;
    private ArrayList<String> material = new ArrayList<>();
    
    public Practica(String _codigo, String _nombre, int _grupo, int _semestre, int _creditos, String _sistema) {
        super(_codigo, _nombre, _grupo, _semestre, _creditos);
        sistema = _sistema;
    }
    
    public void agregar(String _material) {
        material.add(_material);
    }
}
