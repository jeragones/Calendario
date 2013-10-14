/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.Asignatura.Departamento;
import Datos.Asignatura.Practica;
import Datos.Asignatura.Teorica;
import Datos.Asignatura.Asignatura;
import Datos.Aula.Aula;
import Datos.Aula.Clase;
import Datos.Aula.Laboratorio;
import Datos.Horario.Dia;
import Datos.Horario.Horario;
import Datos.Usuario.Coordinador;
import Datos.Usuario.Profesor;
import Datos.Usuario.Usuario;
import java.util.ArrayList;
import java.util.List;


/**
 *  Clase que perminte administrar el calendario
 * @author Daniel Berrocal
 * @author Jorge Rojas
 */
public class CalendarioCls {

    /**
     * @param args the command line arguments
     */
    
    static ArrayList<Asignatura> calendario = new ArrayList<>();
    
    public void reset() {
        calendario.clear();
    }
    
    /**
     * Metodo para validar la disponibilidad de un horario 
     * @param curso lista de horarios 
     * @param horario horario a comparar
     * @param tipo true para buscar horarios libres y
     *             false para buscar horarios ocupados 
     * @return true si el horario se encuentra disponible
     */
    protected boolean validarHora(List<Horario> horarios, String[] horario, boolean tipo) {
        for(int i=0; i < horarios.size(); i++) {
            if(horarios.get(i).getHoraInicio().equals(horario[1]) &
               horarios.get(i).getHoraFinal().equals(horario[2])) {
                //if(!horarios.get(i).isEstado())
                if(horarios.get(i).isEstado()) {
                    if(tipo)
                        return true;
                } else if(!tipo)
                    return true;
            }
        }
        return false;
    }
    
    /**
     * Metodo para validar la disponibilidad de un dia
     * @param dias lista de dias
     * @param horario horario a comparar
     * @param tipo true para buscar horarios libres y
     *             false para buscar horarios ocupados
     * @return true si el dia se encuentra disponible
     */
    protected boolean validarDia(List<Dia> dias, String[] horario, boolean tipo) {
        for(int i=0; i < dias.size(); i++) {
            if(dias.get(i).getDia().equals(horario[0])) {
                return validarHora(dias.get(i).getHorario(), horario, tipo);
            }
        }
        return false;
    }
    
    /**
     * Metodo para validar que no exista un choque de horarios del mismo semestre
     * @param cursos lista de asignaturas
     * @param curso asignatura que se quiere comparar
     * @param horario horario de un curso
     * @return true si no existe choque de horarios con las asignaturas de un 
     *         mismo semestre
     */
    protected boolean validarSemestre(List<Asignatura> cursos, Asignatura curso, String[] horario) {
        for(int i=0; i < cursos.size(); i++) {
            if(!cursos.get(i).equals(curso) & 
                cursos.get(i).getSemestre() == curso.getSemestre()) {
                if(validarDia(cursos.get(i).getHorario(), horario, false))
                    return false;
            }
        }
        return true;
    }
    
    /**
     * 
     * @param d
     * @param h
     * @return 
     */
    protected Dia nuevoDia(String d, Horario h) {
        Dia dia = new Dia(d);
        Horario hora = new Horario(h.getHoraInicio(), h.getHoraFinal());
        hora.setEstado(false);
        dia.agregar(hora);
        return dia;
    }
    
    protected boolean tipoAula(String t1, Class t2) {
        if(t1.equals("Computacion") & t2.equals(Laboratorio.class))
            return true;
        else if(!t1.equals("Computacion") & t2.equals(Clase.class))
            return true;
        else 
            return false;
    }
    
    
    /////////////////////////////////////////////////////////////////////////////////////
    
    protected boolean aulaHora(List<Horario> aula, Horario hora) {
        for(int x=0; x < aula.size(); x++) {
            String[] horario = new String[] {};
            //if(validarDia(aula.get(x)., horario, true)) {
            //}
            
            if(aula.get(x).getHoraInicio().equals(hora.getHoraInicio()) & 
               aula.get(x).getHoraFinal().equals(hora.getHoraFinal())) {
                if(aula.get(x).isEstado()) {
                    aula.get(x).setEstado(false);
                    return true;
                } else
                    return false;
            }
        }
        Horario h = new Horario(hora.getHoraInicio(), hora.getHoraFinal());
        h.setEstado(false);
        aula.add(h);
        return true;
    }
    
    protected boolean aulaDia(Aula aula, List<Dia> aulaDia, String dia, Horario hora) {
        if(aulaDia.isEmpty()) {
            aula.agregar(nuevoDia(dia, hora));
            return true;
        } else {
            for(int x=0; x < aulaDia.size(); x++) {
                if(aulaDia.get(x).getDia().equals(dia)) {
                    if(aulaHora(aulaDia.get(x).getHorario(), hora))
                        return true;
                    else
                        return false;
                }
            }
            aula.agregar(nuevoDia(dia, hora));
            return true;
        }
    }
    
    protected Aula aula(List<Aula> aula, String departamento, String dia, Horario hora, boolean restriccion) {
        for(int x=0; x < aula.size(); x++) {
            if(tipoAula(departamento, aula.get(x).getClass()) & restriccion) { // aqui
                if(aulaDia(aula.get(x), aula.get(x).getHorario(), dia, hora)) 
                    return aula.get(x);
            } else if(!restriccion) {
                if(aulaDia(aula.get(x), aula.get(x).getHorario(), dia, hora))
                    return aula.get(x);
            }
        }
        if(restriccion)
            aula(aula, departamento, dia, hora, false);
        return null;
    }
    
    protected boolean crear(List<Asignatura> cursos, Asignatura curso, List<Horario> horaCurso, List<Horario> horaProfesor, String dia, List<Aula> aulas, String departamento) {
        for(int i=0; i < horaCurso.size(); i++) {
            for(int j=0; j < horaProfesor.size(); j++) {
                if(horaCurso.get(i).isEstado() & horaProfesor.get(j).isEstado()) {
                    String[] hCurso = new String[]{horaCurso.get(i).getHoraInicio(), horaCurso.get(i).getHoraFinal()};
                    String[] hProfesor = new String[]{horaProfesor.get(j).getHoraInicio(), horaProfesor.get(j).getHoraFinal()};
                    String[] horario = new String[] {dia,
                                                     horaCurso.get(i).getHoraInicio(), 
                                                     horaCurso.get(i).getHoraFinal()};
                    if(hCurso[0].equals(hProfesor[0]) & 
                       hCurso[1].equals(hProfesor[1]) &
                       validarSemestre(cursos, curso, horario)) {                
                        Aula aula = aula(aulas, departamento, dia, horaCurso.get(i), true);
                        if(aula != null) {
                            horaCurso.get(i).setEstado(false);
                            horaProfesor.get(j).setEstado(false);
                            curso.agregar(aula);
                            return true;
                        } else 
                            return false;
                    }
                }
            }
        }
        return false;
    }
    
    protected boolean validar(List<Asignatura> cursos, Asignatura curso, List<Dia> diaCurso, List<Dia> diaProfesor, List<Aula> aula, String departamento) {
        for(int i=0; i < diaCurso.size(); i++) {
            for(int j=0; j < diaProfesor.size(); j++) {
                if(diaCurso.get(i).getDia().equals(diaProfesor.get(j).getDia())) {
                    if(crear(cursos, curso, diaCurso.get(i).getHorario(), diaProfesor.get(j).getHorario(), diaCurso.get(i).getDia(), aula, departamento))
                        return true;
                }
            }
        }
        return false;
    }
    
    protected boolean crear(List<Asignatura> cursos, Asignatura curso, Profesor profesor, List<Aula> aula, String departamento) {
        for(int x=0; x < profesor.getAsignatura().size(); x++) {
            if(curso.equals(profesor.getAsignatura().get(x))) {
                if(validar(cursos, curso, curso.getHorario(), profesor.getHorario(), aula, departamento))
                    return true;
            }
        }
        return false;
    }
    
    protected boolean crear(List<Asignatura> cursos, Asignatura curso, List<Profesor> profesor, List<Aula> aula, String departamento) {
        for(int x=0; x < profesor.size(); x++) {
            if(crear(cursos, curso, profesor.get(x), aula, departamento)) 
                return true;
        }
        return false;
    }
    
    protected List<Asignatura> calendario(List<Asignatura> cursos, List<Asignatura> curso, List<Profesor> profesor, List<Aula> aula, String departamento, List<Asignatura> calendario, int semestre) {
        List<Asignatura> asignaturas = new ArrayList<>();
        if(!curso.isEmpty() & !profesor.isEmpty() & !aula.isEmpty()) {
            for(int x=0; x < curso.size(); x++) {
                if(curso.get(x).getTipoSemestre() == semestre) {
                    if(crear(cursos, curso.get(x), profesor, aula, departamento))
                        calendario.add(curso.get(x));
                    else 
                        asignaturas.add(curso.get(x));
                }
            }
        }
        return asignaturas;
    }
    
    public ArrayList<Asignatura> crear(List<Departamento> departamento, List<Usuario> usuario, List<Aula> aula, int semestre) {
        ArrayList<Asignatura> cursos = new ArrayList<>();
        List<Asignatura> asignaturas = new ArrayList<>();
        for(int x=0; x < departamento.size(); x++) 
            cursos.addAll(departamento.get(x).getAsignatura());
        for(int x=0; x < departamento.size(); x++) {
            asignaturas.addAll(calendario(cursos, departamento.get(x).getAsignatura(), departamento.get(x).getProfesor(), aula, departamento.get(x).getDepartamento(), calendario, semestre));
        }
        if(asignaturas.size() == 0)
            return calendario;
        else {
            ordenar(calendario, asignaturas);
            return calendario;
        }
    }
    
    protected void ordenar(List<Asignatura> calendario, List<Asignatura> cursos) {
        System.out.println("No se pudo ordenar los cursos:");
        for(int x=0; x < cursos.size(); x++)
            System.out.println(cursos.get(x).getCodigo()+" "+cursos.get(x).getNombre());
    }
}
