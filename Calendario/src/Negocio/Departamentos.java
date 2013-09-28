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
public class Departamentos implements Main{
    
    private static ArrayList<Departamento> departamento = new ArrayList<>();

    @Override
    public void insertar(Object args, int op) {
        departamento.add((Departamento)args);
    }

    public ArrayList<Departamento> getDepartamento() {
        return departamento;
    }
}
