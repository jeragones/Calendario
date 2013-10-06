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
public class AulaCls implements Interface{

    private static ArrayList<Aula> aula = new ArrayList<>();
    
    @Override
    public void insertar(Object args) {
        aula.add((Aula)args);
    }

    public static ArrayList<Aula> getAula() {
        return aula;
    }

    public static void setAula(ArrayList<Aula> aula) {
        AulaCls.aula = aula;
    }
}
