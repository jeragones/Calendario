/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.Usuario;

import Datos.calendario.Interface;

/**
 *
 * @author GeOrge
 */
public class Coordinador extends Usuario implements Interface {
    
    public Coordinador(String _nombre, String _usuario, String _contrasena) {
        super(_nombre, _usuario, _contrasena);
    }
}
