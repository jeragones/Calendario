/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.Asignatura.Departamento;
import java.util.ArrayList;

/**
 *
 * @author GeOrge
 */
public class DepartamentoCls implements Interface, java.io.Serializable{
    
    private static ArrayList<Departamento> departamento = new ArrayList<>();

    @Override
    public void insertar(Object args) {
        departamento.add((Departamento)args);
    }

    public static ArrayList<Departamento> getDepartamento() {
        return departamento;
    }
    
    public static Departamento getDepartamento(String arg) {
        for(int x=0; x < departamento.size(); x++) {
            if(departamento.get(x).getDepartamento().equals(arg))
                return departamento.get(x);
        }
        return null;
    }

    public static void setDepartamento(ArrayList<Departamento> departament) {
        departamento = departament;
    }
}
