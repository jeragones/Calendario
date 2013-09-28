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
public class Aula extends Main{

    private ArrayList<Clase> clase = new ArrayList<>();
    private ArrayList<Laboratorio> laboratorio = new ArrayList<>();
    
    @Override
    public void insertar(Object[] args, int op) {
        switch(op) {
            case 1:
                clase.add(new Clase((String)args[0], (int)args[1], (String)args[2], (int)args[3], (boolean)args[4]));
                break;
            case 2:
                laboratorio.add(new Laboratorio((String)args[0], (int)args[1], (String)args[2], (int)args[3]));
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
