/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.Usuario;


/**
 * Clase Usuario de tipo Estudiante, cada estudiante tiene un carne con el que se identifica
 * @author Daniel Berrocal
 * @author Jorge Rojas
 */
public class Estudiante extends Usuario {
    
    private String carne;
    
    /**
     * Constructor de la clase Estudiante
     * @param _nombre
     * @param _usuario
     * @param _contrasena
     * @param _carne 
     */
    public Estudiante(String _nombre, String _usuario, String _contrasena, String _carne) {
        super(_nombre, _usuario, _contrasena);
        carne = _carne;
    }

    public String getCarne() {
        return carne;
    }
}
