/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Asignatura;

/**
 *
 * @author GeOrge
 */
public class Teorica extends Asignatura{
    
    private String pagina;
    
    public Teorica(String _nombre, int _grupo, int _semestre, int _creditos, /*Departamento _departamento, */boolean _tipo, String _pagina) {
        super(_nombre, _grupo, _semestre, _creditos, _tipo);
        pagina = _pagina;
    }
}
