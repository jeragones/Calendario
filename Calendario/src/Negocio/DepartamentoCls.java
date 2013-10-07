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
    ArchivoCls insArchivo = new ArchivoCls();
    
    @Override
    public void insertar(Object args) {
        departamento.add((Departamento)args);
    }
    
    @Override
    public void guardar() {
        ArrayList<Object> lista = new ArrayList<>();
        for(int i=0; i < departamento.size(); i++)
            lista.add(departamento.get(i));
        insArchivo.guardar("departamento", lista);
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
