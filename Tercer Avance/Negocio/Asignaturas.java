/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.Asignatura.Asignatura;
import java.util.ArrayList;

/**
 *
 * @author GeOrge
 */
public class Asignaturas implements Interface{
    
    private static ArrayList<Asignatura> asignatura = new ArrayList<>();
    
    @Override
    public void insertar(Object args) {
        asignatura.add((Asignatura)args);
        /*switch(op) {
            case 1:
                asignatura.add((Practica)args);
                break;
            case 2:
                asignatura.add((Teorica)args);
                break;
        }*/
    }

    /*public ArrayList<Practica> getPractica() {
        return practica;
    }

    public ArrayList<Teorica> getTeorica() {
        return teorica;
    }*/

    public static ArrayList<Asignatura> getAsignatura() {
        return asignatura;
    }
}
