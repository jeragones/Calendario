/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.Usuario;


/**
 * Clase Usuario, esta clase implemeta la interface java.io.Serializable para poder guardarla y cargarla del fichero como un objeto
 * @author Daniel Berrocal
 * @author Jorge Rojas
 */
public abstract class Usuario implements java.io.Serializable {
    
    private String nombre;
    private String usuario;
    private String contrasena;
    
    /**
     * Constructor de la clase Usuario
     * @param _nombre Nombre Completo
     * @param _usuario Nombre de usuario
     * @param _contrasena Contraseña
     */
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
