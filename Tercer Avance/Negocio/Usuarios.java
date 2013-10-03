/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.Usuario.Usuario;
import java.util.ArrayList;

/**
 *
 * @author GeOrge
 */
public class Usuarios implements Interface{

    private static ArrayList<Usuario> usuario = new ArrayList<>();
    
    @Override
    public void insertar(Object args) {
        usuario.add((Usuario)args);
        /*switch(op) {
            case 1:
                coordinador.add((Coordinador)args);
                break;
            case 2:
                profesor.add((Profesor)args);
                break;
            case 3:
                estudiante.add((Estudiante)args);
                break;
        }*/
    }

    /*public ArrayList<Coordinador> getCoordinador() {
        return coordinador;
    }

    public ArrayList<Profesor> getProfesor() {
        return profesor;
    }

    public ArrayList<Estudiante> getEstudiante() {
        return estudiante;
    }*/

    
    public static ArrayList<Usuario> getUsuario() {
        return usuario;
    }
}
