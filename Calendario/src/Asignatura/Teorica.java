/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Asignatura;

import calendario.Interface;

/**
 *
 * @author GeOrge
 */
public class Teorica extends Asignatura implements Interface {
    
    private String pagina;
    
    public Teorica(String _codigo, String _nombre, int _grupo, int _semestre, int _creditos, String _pagina) {
        super(_codigo, _nombre, _grupo, _semestre, _creditos);
        pagina = _pagina;
    }
}
