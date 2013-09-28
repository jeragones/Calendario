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
public class Departamentos extends Main{
    
    private ArrayList<Departamento> departamento = new ArrayList<>();

    @Override
    public void insertar(Object[] args, int op) {
        departamento.add(new Departamento((String)args[0]));
    }

    public ArrayList<Departamento> getDepartamento() {
        return departamento;
    }
}
