/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

import calendario.Interface;

/**
 *
 * @author GeOrge
 */
public class Estudiante extends Usuario implements Interface {
    
    private String carne;
    
    public Estudiante(String _nombre, String _usuario, String _contrasena, String _carne) {
        super(_nombre, _usuario, _contrasena);
        carne = _carne;
    }

    public String getCarne() {
        return carne;
    }
}
