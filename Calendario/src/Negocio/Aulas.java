/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.Aula.Aula;
import java.util.ArrayList;

/**
 *
 * @author GeOrge
 */
public class Aulas implements Interface{

    private static ArrayList<Aula> aula = new ArrayList<>();
    /*private static ArrayList<Clase> clase = new ArrayList<>();
    private static ArrayList<Laboratorio> laboratorio = new ArrayList<>();*/
    
    @Override
    public void insertar(Object args) {
        aula.add((Aula)args);
        /*switch(op) {
            case 1:
                clase.add((Clase)args);
                break;
            case 2:
                laboratorio.add((Laboratorio)args);
                break;
        }*/
    }

    /*public ArrayList<Clase> getClase() {
        return clase;
    }

    public ArrayList<Laboratorio> getLaboratorio() {
        return laboratorio;
    }*/

    public static ArrayList<Aula> getAula() {
        return aula;
    }
}
