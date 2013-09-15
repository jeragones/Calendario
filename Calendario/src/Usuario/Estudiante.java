/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

/**
 *
 * @author GeOrge
 */
public class Estudiante extends Usuario {
    
    private String carne;
    
    public Estudiante(String _nombre, String _usuario, String _contrasena, String _carne) {
        super(_nombre, _usuario, _contrasena);
        carne = _carne;
    }
}
