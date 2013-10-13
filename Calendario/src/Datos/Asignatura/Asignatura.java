/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.Asignatura;

import Datos.Aula.Aula;
import Datos.Horario.Dia;
import java.util.ArrayList;

/**
 * Clase asignatura.
 * @author Daniel Berrocal
 * @author Jorge Rojas
 */
public class Asignatura implements java.io.Serializable {
    
    private String codigo;
    private String nombre;
    private int grupo;
    private int semestre;
    private int creditos;
    private ArrayList<Aula> aula = new ArrayList<>();
    private ArrayList<Dia> horario = new ArrayList<>();
    private int tipoSemestre;
    private int error;
    
    /**
     * Constrctor de la clase Asignatura
     * @param _codigo Codigo del la asignatura
     * @param _nombre Nombre de la asignatura
     * @param _grupo Grupo
     * @param _semestre Semestre al que pertenece la asignatura
     * @param _creditos Numero de creditos de la asignatura
     */
    public Asignatura(String _codigo, String _nombre, int _grupo, int _semestre, int _creditos) {
        codigo = _codigo;
        nombre = _nombre;
        grupo = _grupo;
        semestre = _semestre;
        creditos = _creditos;
        tipoSemestre = _semestre % 2; // 0 = semestre I, 1 = semestre II
        error = 0;
    }

    /**
     * Metodo que obtiene el codigo de la asignatura
     * @return Retorna un string con el codigo de la asignatura
     */
    public String getCodigo() {
        return codigo;
    }
    
    /**
     * Metodo que obtiene el nombre de la asignatura
     * @return Retorna un string con el nombre de la asignatura
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Metodo que obtiene el grupo de la asignatura
     * @return Retorna un numero con el grupo de la asignatura
     */
    public int getGrupo() {
        return grupo;
    }
    
    /**
     * Metodo que obtiene el semestre al que pertenece asignatura
     * @return Retorna un numero con el semetre al que pertenece la asignatura
     */
    public int getSemestre() {
        return semestre;
    }
    
    /**
     * Metodo que obtiene el numero de creditos de la asignatura
     * @return Retorna un numero con los creditos de la asignatura
     */
    public int getCreditos() {
        return creditos;
    }
    
    /**
     * Metodo que cambia el valor del atributo error.
     * @param error Nuevo valor.
     */
    public void setError(int error) {
        this.error = error;
    }
    
    /**
     * Metodo que obtiene la lista de aulas en las que se imparte la asignatura
     * @return Retorna la lista de aulas.
     */
    public ArrayList<Aula> getAula() {
        return aula;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public void setTipoSemestre(int tipoSemestre) {
        this.tipoSemestre = tipoSemestre;
    }
    
    /**
     * Metodo que obtiene la lista de dias en las que se imparte la aignatura
     * @return Lista de dias
     */
    public ArrayList<Dia> getHorario() {
        return horario;
    }
    
    /**
     * Metodo que obtiene el tipo de semestre de la asignatura
     * @return Retorna el tipo de semestre
     */
    public int getTipoSemestre() {
        return tipoSemestre;
    }
    
    /**
     * Metodo para agregar un aula en la que se imparte la asignatura
     * @param _aula Nueva aula
     */
    public void agregar(Aula _aula) {
        aula.add(_aula);
    }
    
    /**
     * Metodo para agregar un dia en el que se imparte la asignatura
     * @param _horario Nuevo dia
     */
    public void agregar(Dia _horario) {
        horario.add(_horario);
    }
}
