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
public class Usuario extends Main{

    private ArrayList<Coordinador> coordinador = new ArrayList<>();
    private ArrayList<Profesor> profesor = new ArrayList<>();
    private ArrayList<Estudiante> estudiante = new ArrayList<>();
    
    @Override
    public void insertar(Object[] args, int op) {
        switch(op) {
            case 1:
                coordinador.add(new Coordinador(args[0].toString(),args[1].toString(),args[2].toString()));
                break;
            case 2:
                profesor.add(new Profesor(args[0].toString(),args[1].toString(),args[2].toString(),args[3].toString()));
                break;
            case 3:
                estudiante.add(new Estudiante(args[0].toString(),args[1].toString(),args[2].toString(),args[3].toString()));
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
