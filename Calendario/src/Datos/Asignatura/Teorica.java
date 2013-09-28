/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.Asignatura;

/**
 *
 * @author GeOrge
 */
public class Teorica extends Asignatura {
    
    private String pagina;
    
    public Teorica(String _codigo, String _nombre, int _grupo, int _semestre, int _creditos, String _pagina) {
        super(_codigo, _nombre, _grupo, _semestre, _creditos);
        pagina = _pagina;
    }
}
