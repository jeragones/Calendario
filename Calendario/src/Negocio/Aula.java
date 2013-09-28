/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.Aula.Clase;
import Datos.Aula.Laboratorio;
import java.util.ArrayList;

/**
 *
 * @author GeOrge
 */
public class Aula implements Main{

    private ArrayList<Clase> clase = new ArrayList<>();
    private ArrayList<Laboratorio> laboratorio = new ArrayList<>();
    
    @Override
    public void insertar(Object args, int op) {
        switch(op) {
            case 1:
                clase.add((Clase)args);
                break;
            case 2:
                laboratorio.add((Laboratorio)args);
                break;
        }
    }

    public ArrayList<Clase> getClase() {
        return clase;
    }

    public ArrayList<Laboratorio> getLaboratorio() {
        return laboratorio;
    }
}
