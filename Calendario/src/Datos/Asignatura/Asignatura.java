/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.Asignatura;

import Datos.Aula.Aula;
import Datos.Horario.Dia;
import java.util.ArrayList;

/**
 *
 * @author GeOrge
 */
public class Asignatura {
    
    private String codigo;
    private String nombre;
    private int grupo;
    private int semestre;
    private int creditos;
    private ArrayList<Aula> aula = new ArrayList<>();
    private ArrayList<Dia> horario = new ArrayList<>();
    private int tipoSemestre;
    private int error;
    
    public Asignatura(String _codigo, String _nombre, int _grupo, int _semestre, int _creditos) {
        codigo = _codigo;
        nombre = _nombre;
        grupo = _grupo;
        semestre = _semestre;
        creditos = _creditos;
        tipoSemestre = _semestre % 2; // 0 = semestre I, 1 = semestre II
        error = 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getGrupo() {
        return grupo;
    }

    public int getSemestre() {
        return semestre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setError(int error) {
        this.error = error;
    }

    public ArrayList<Aula> getAula() {
        return aula;
    }

    public ArrayList<Dia> getHorario() {
        return horario;
    }

    public int getTipoSemestre() {
        return tipoSemestre;
    }
    
    public void agregar(Aula _aula) {
        aula.add(_aula);
    }
    
    public void agregar(Dia _horario) {
        horario.add(_horario);
    }
}
