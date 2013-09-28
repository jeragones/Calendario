/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.Usuario.Coordinador;
import Datos.Usuario.Estudiante;
import Datos.Usuario.Profesor;
import java.util.ArrayList;

/**
 *
 * @author GeOrge
 */
public class Usuario implements Main{

    private static ArrayList<Coordinador> coordinador = new ArrayList<>();
    private static ArrayList<Profesor> profesor = new ArrayList<>();
    private static ArrayList<Estudiante> estudiante = new ArrayList<>();
    
    @Override
    public void insertar(Object args, int op) {
        switch(op) {
            case 1:
                coordinador.add((Coordinador)args);
                break;
            case 2:
                profesor.add((Profesor)args);
                break;
            case 3:
                estudiante.add((Estudiante)args);
                break;
        }
    }

    public ArrayList<Coordinador> getCoordinador() {
        return coordinador;
    }

    public ArrayList<Profesor> getProfesor() {
        return profesor;
    }

    public ArrayList<Estudiante> getEstudiante() {
        return estudiante;
    }
}
