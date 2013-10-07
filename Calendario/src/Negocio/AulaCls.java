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
    ArchivoCls insArchivo = new ArchivoCls();
    
    @Override
    public void insertar(Object args) {
        aula.add((Aula)args);
    }
    
    @Override
    public void guardar() {
        ArrayList<Object> lista = new ArrayList<>();
        for(int i=0; i < aula.size(); i++)
            lista.add(aula.get(i));
        insArchivo.guardar("aula", lista);
    }
    
    public static ArrayList<Aula> getAula() {
        return aula;
    }

    public static void setAula(ArrayList<Aula> aula) {
        AulaCls.aula = aula;
    }
}
