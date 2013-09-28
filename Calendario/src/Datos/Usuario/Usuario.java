/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.Usuario;

/**
 *
 * @author GeOrge
 */
public abstract class Usuario {
    
    private String nombre;
    private String usuario;
    private String contrasena;
    
    public Usuario(String _nombre, String _usuario, String _contrasena) {
        nombre = _nombre;
        usuario = _usuario;
        contrasena = _contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }
}
