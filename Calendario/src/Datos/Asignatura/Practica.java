/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.Asignatura;

import java.util.ArrayList;

/**
 * Asignatura Practica
 * @author Daniel Berrocal
 * @author Jorge Rojas
 */
public class Practica extends Asignatura {
    
    private String sistema;
    private ArrayList<String> material = new ArrayList<>();
    
    /**
     * Constructor de la asignatura practica
     * @param _codigo Codigo del la asignatura
     * @param _nombre Nombre de la asignatura
     * @param _grupo Grupo
     * @param _semestre Semestre al que pertenece la asignatura
     * @param _creditos Numero de creditos de la asignatura
     * @param _sistema Sistema operativo 
     */
    public Practica(String _codigo, String _nombre, int _grupo, int _semestre, int _creditos, String _sistema) {
        super(_codigo, _nombre, _grupo, _semestre, _creditos);
        sistema = _sistema;
    }
    
    /**
     * Metodo que obtiene el sistema
     * @return Retorna el sistema de la asignatura practica
     */
    public String getSistema() {
        return sistema;
    }

    /**
     * Metodo que obtiene la lista de materiales de la asignatura practica
     * @return Retorna la lista de materiales
     */
    public ArrayList<String> getMaterial() {
        return material;
    }
    
    /**
     * Metodo para agregar un nuevo material a la lista 
     * @param _material El nombre del material
     */
    public void agregar(String _material) {
        material.add(_material);
    }
    
    /**
     * Metodo para agregar una lista completa de materiales
     * @param l Lista de materiales
     */
    public void agregarMateriales(ArrayList l){
        this.material=l;
    }
}
