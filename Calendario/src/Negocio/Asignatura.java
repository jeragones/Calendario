/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.Asignatura.Practica;
import Datos.Asignatura.Teorica;
import java.util.ArrayList;

/**
 *
 * @author GeOrge
 */
public class Asignatura implements Main{
    
    private ArrayList<Practica> practica = new ArrayList<>();
    private ArrayList<Teorica> teorica = new ArrayList<>();
    
    @Override
    public void insertar(Object args, int op) {
        switch(op) {
            case 1:
                practica.add((Practica)args);
                break;
            case 2:
                teorica.add((Teorica)args);
                break;
        }
    }

    public ArrayList<Practica> getPractica() {
        return practica;
    }

    public ArrayList<Teorica> getTeorica() {
        return teorica;
    }
}
