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
public class Asignatura extends Main{
    
    private ArrayList<Practica> practica = new ArrayList<>();
    private ArrayList<Teorica> teorica = new ArrayList<>();
    
    @Override
    public void insertar(Object[] args, int op) {
        switch(op) {
            case 1:
                practica.add(new Practica((String)args[0], (String)args[1], (int)args[2], (int)args[3], (int)args[4], (String)args[5]));
                break;
            case 2:
                teorica.add(new Teorica((String)args[0], (String)args[1], (int)args[2], (int)args[3], (int)args[4], (String)args[5]));
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
