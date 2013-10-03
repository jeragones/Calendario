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
import Datos.Usuario.Profesor;
import Datos.Usuario.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GeOrge
 */
public class Calendario {

    /**
     * @param args the command line arguments
     */
    
    static List<Asignatura> calendario = new ArrayList<>();
    List<Aula> aula = new ArrayList<Aula>();
    
    
    
    
    
    
    List<Departamento> departamentos = new ArrayList<>();
    
    static List<Aula> aulas = new ArrayList<>();
    static List<Usuario> profesores = new ArrayList<>();
    static List<Asignatura> asignaturas = new ArrayList<>();
    
    
    
    /*public static void main(String[] args) {

    }*/
    
    // AUTOMATICO
    
    public void profesores() {
        aulas();
        departamentos();
        Profesor p1 = new Profesor("Oscar Viquez", "oviquez", "oviquez", "2-987-654");
        p1.agregar(asignaturas.get(0));
        p1.agregar(asignaturas.get(1));
        profesores.add(p1);
        
        Profesor p2 = new Profesor("Leonardo Viquez", "lviquez", "lviquez", "2-321-658");
        p2.agregar(asignaturas.get(2));
        p2.agregar(asignaturas.get(3));
        profesores.add(p2);
        
        Profesor p3 = new Profesor("Lorena Valerio", "lvalerio", "lvalerio", "3-895-234");
        p3.agregar(asignaturas.get(4));
        p3.agregar(asignaturas.get(5));
        profesores.add(p3);
        
        Profesor p4 = new Profesor("Gaudy Esquivel", "gesquivel", "gesquivel", "2-856-681");
        p4.agregar(asignaturas.get(6));
        p4.agregar(asignaturas.get(7));
        profesores.add(p4);
        
        Profesor p5 = new Profesor("Jorge Velazco", "jvelazco", "jvelazco", "1-963-785");
        p5.agregar(asignaturas.get(8));
        p5.agregar(asignaturas.get(9));
        profesores.add(p5);
        
        Profesor p6 = new Profesor("Oscar Lopez", "olopez", "olopez", "2-963-741");
        p6.agregar(asignaturas.get(10));
        p6.agregar(asignaturas.get(11));
        profesores.add(p6);
        profesores1();
    }
    
    protected void profesores1() {
        for(int i=0; i<profesores.size(); i++) {
            Dia d1 = new Dia("Lunes");
            d1.agregar(new Horario("7:00", "11:30"));
            d1.agregar(new Horario("12:30", "4:00"));
            ((Profesor)profesores.get(i)).agregar(d1);
            Dia d2 = new Dia("Martes");
            d2.agregar(new Horario("7:00", "11:30"));
            d2.agregar(new Horario("12:30", "4:00"));
            ((Profesor)profesores.get(i)).agregar(d2);
            Dia d3 = new Dia("Miercoles");
            d3.agregar(new Horario("7:00", "11:30"));
            d3.agregar(new Horario("12:30", "4:00"));
            ((Profesor)profesores.get(i)).agregar(d3);
            Dia d4 = new Dia("Jueves");
            d4.agregar(new Horario("7:00", "11:30"));
            d4.agregar(new Horario("12:30", "4:00"));
            ((Profesor)profesores.get(i)).agregar(d4);
            Dia d5 = new Dia("Viernes");
            d5.agregar(new Horario("7:00", "11:30"));
            d5.agregar(new Horario("12:30", "4:00"));
            ((Profesor)profesores.get(i)).agregar(d5);
        }
        creara(asignaturas,profesores,aulas,calendario);
        //inicializarCalendario();
    }
    
    protected void departamentos() {
        departamentos.add(new Departamento("Computacion"));
        departamentos.add(new Departamento("Ciencias y Letras"));
        departamentos.add(new Departamento("Administracion de Empresas"));
        asignaturas();
    }
    
    protected void aulas() {
        // (String _nombre, int _numero, String _ubicacion, int _capacidad, boolean _acondicionado)
        aulas.add(new Clase("Aula 01",1,"Computacion",30,true));
        aulas.add(new Clase("Aula 02",2,"Computacion",30,true));
        aulas.add(new Clase("Aula 03",3,"Computacion",30,true));
        aulas.add(new Clase("Aula 04",4,"Computacion",30,true));
        aulas.add(new Clase("Aula 05",5,"Computacion",30,true));
        aulas.add(new Clase("Aula 06",6,"Ciencias y Letras",30,true));
        aulas.add(new Clase("Aula 07",7,"Ciencias y Letras",30,false));
        aulas.add(new Clase("Aula 08",8,"Ciencias y Letras",30,true));
        aulas.add(new Clase("Aula 09",9,"Ciencias y Letras",30,true));
        aulas.add(new Clase("Aula 10",10,"Ciencias y Letras",30,false));
        aulas.add(new Clase("Aula 11",11,"Ciencias y Letras",30,true));
        aulas.add(new Clase("Aula 12",12,"Ciencias y Letras",30,false));
        aulas.add(new Clase("Aula 13",13,"Ciencias y Letras",30,false));
        aulas.add(new Clase("Aula 14",14,"Ciencias y Letras",30,true));
        aulas.add(new Clase("Aula 15",15,"Ciencias y Letras",30,false));
        
        // (String _nombre, int _numero, String _ubicacion, int _capacidad)
        aulas.add(new Laboratorio("LAIMI",4,"Computacion",30));
        aulas.add(new Laboratorio("Laboratorio 01",1,"Computacion",24));
        aulas.add(new Laboratorio("Laboratorio 02",2,"Computacion",24));
        aulas.add(new Laboratorio("Laboratorio 03",3,"Computacion",24));
    }
    
    protected void asignaturas(){
        //( codigo, String _nombre, int _grupo, int _semestre, int _creditos)
        Teorica t1 = new Teorica("CI1400","Fundamentos de Organizacion de Computadoras",50,1,4,"www.algo1.com");
        asignaturas.add(t1);
        departamentos.get(0).agregar(t1);
        Teorica t2 = new Teorica("CI1802","Introduccion a la Programacion",50,1,4,"www.algo2.com");
        asignaturas.add(t2);
        departamentos.get(0).agregar(t2);
        Practica p1 = new Practica("CI1803","Taller de Programacion",50,1,4,"Windows xp");
        asignaturas.add(p1);
        departamentos.get(0).agregar(p1);
        Practica p2 = new Practica("CI0202","Ingles Basico",50,1,2,"");
        asignaturas.add(p2);
        departamentos.get(1).agregar(p2);
        Practica p3 = new Practica("MA0101","Matematica General",50,1,3,"");
        asignaturas.add(p3);
        departamentos.get(1).agregar(p3);
        Practica p4 = new Practica("CI1311","Ingles I para Computacion",50,1,2,"");
        asignaturas.add(p4);
        departamentos.get(1).agregar(p4);
        Practica p5 = new Practica("CI1403","Comunicacion Tecnica",50,1,2,"");
        asignaturas.add(p5);
        departamentos.get(1).agregar(p5);
        // ******************************************************************************
        Teorica t3 = new Teorica("CI2001","Estructura de Datos",50,2,4,"www.algo3.com");
        asignaturas.add(t3);
        departamentos.get(0).agregar(t3);
        Practica p6 = new Practica("CI2101","Programacion Orientada a Objetos",50,2,4,"Windows xp");
        asignaturas.add(p6);
        departamentos.get(1).agregar(p6);
        Teorica t4 = new Teorica("CI3101","Arquitectura de Computadores",50,2,4,"www.algo4.com");
        asignaturas.add(t4);
        departamentos.get(0).agregar(t4);
        Practica p7 = new Practica("CI1312","Ingles II para Computacion",50,2,2,"");
        asignaturas.add(p7);
        departamentos.get(1).agregar(p7);
        Practica p8 = new Practica("MA1404","Calculo",50,2,4,"");
        asignaturas.add(p8);
        departamentos.get(1).agregar(p8);
        asignaturas1();
        // ******************************************************************************
        /*departamentos.get(0).agregar(new Practica("CI3002","Analisis de Algoritmos",50,3,4,"Windows xp"));
        departamentos.get(0).agregar(new Teorica("CI4301","Bases de Datos I",50,3,4,"www.algo5.com"));
        departamentos.get(1).agregar(new Practica("CI1313","Ingles III para Computacion",50,3,2,""));
        departamentos.get(1).agregar(new Teorica("CS2101","Ambiente Humano",50,3,2,""));
        departamentos.get(1).agregar(new Practica("MA2405","Algebra Lineal para Computacion",50,3,4,""));
        
        departamentos.get(0).agregar(new Teorica("CI4302","Bases de Datos II",50,4,4,"www.algo6.com"));
        departamentos.get(0).agregar(new Practica("CI4700","Lenguajes de Programacion",50,4,4,"Windows xp"));
        departamentos.get(0).agregar(new Teorica("CI5821","Requerimientos de Software",50,4,4,"www.algo7.com"));
        departamentos.get(1).agregar(new Practica("CI1314","Ingles IV para Computacion",50,4,2,""));
        departamentos.get(1).agregar(new Practica("MA2404","Probabilidades",50,4,4,""));
        
        departamentos.get(0).agregar(new Teorica("CI4810","Administracion de Proyectos",50,5,4,"www.algo8.com"));
        departamentos.get(0).agregar(new Practica("CI5701","Compiladores e Interpretes",50,5,4,"Windows xp"));
        departamentos.get(0).agregar(new Teorica("CI6821","Diseño de Software de Software",50,5,4,"www.algo9.com"));
        departamentos.get(1).agregar(new Teorica("CS3401","Seminario de Estudios Filosoficos",50,5,2,""));
        departamentos.get(1).agregar(new Practica("MA3405","Estadistica",50,5,4,""));
        
        departamentos.get(0).agregar(new Practica("CI4003","Electiva I",50,6,4,"Windows xp"));
        departamentos.get(0).agregar(new Practica("CI6400","Investigacion de Operaciones",50,6,4,""));
        departamentos.get(0).agregar(new Teorica("CI6600","Principios de Sistemas Operativos",50,6,4,"www.algo10.com"));
        departamentos.get(0).agregar(new Teorica("CI6831","Aseguramiento de la Calidad de Software",50,6,4,"www.algo11.com"));
        departamentos.get(0).agregar(new Teorica("CI7900","Computacion y Sociedad",50,6,2,"www.algo12.com"));
        departamentos.get(1).agregar(new Teorica("CS4402","Seminario de Estudios Costarricenses",50,6,2,""));
        
        departamentos.get(0).agregar(new Practica("CI5001","Electiva II",50,7,4,"Windows xp"));
        departamentos.get(0).agregar(new Teorica("CI6200","Inteligencia Artificial",50,7,4,"www.algo13.com"));
        departamentos.get(0).agregar(new Teorica("CI7602","Redes",50,7,4,"www.algo14.com"));
        departamentos.get(0).agregar(new Practica("CI7841","Proyecto de Ingenieria de Software",50,7,4,"Windows xp"));
        departamentos.get(2).agregar(new Teorica("AE4208","Desarrollo de Emprendedores",50,7,3,"www.algo15.com"));*/
    }
    
    protected void asignaturas1() {
        for(int i=0; i<asignaturas.size(); i++) {
            Dia d1 = new Dia("Lunes");
            d1.agregar(new Horario("7:00", "11:30"));
            d1.agregar(new Horario("12:30", "4:00"));
            asignaturas.get(i).agregar(d1);
            Dia d2 = new Dia("Martes");
            d2.agregar(new Horario("7:00", "11:30"));
            d2.agregar(new Horario("12:30", "4:00"));
            asignaturas.get(i).agregar(d2);
            Dia d3 = new Dia("Miercoles");
            d3.agregar(new Horario("7:00", "11:30"));
            d3.agregar(new Horario("12:30", "4:00"));
            asignaturas.get(i).agregar(d3);
            Dia d4 = new Dia("Jueves");
            d4.agregar(new Horario("7:00", "11:30"));
            d4.agregar(new Horario("12:30", "4:00"));
            asignaturas.get(i).agregar(d4);
            Dia d5 = new Dia("Viernes");
            d5.agregar(new Horario("7:00", "11:30"));
            d5.agregar(new Horario("12:30", "4:00"));
        }
        
    }
    
    /*protected boolean compararDia(List<Dia> _calDia, List<Dia> _asigDia) {
        
        for(int i=0; i<_calDia.size(); i++) {
            for(int j=0; j<_asigDia.size(); j++) {
                if(!_calDia.get(i).getDia().equals(_asigDia.get(j).getDia())) {
                    
                }
            }
        }
        
        return true;
    } */
    
    protected Dia nuevoDia(String d, Horario h) {
        Dia dia = new Dia(d);
        Horario hora = new Horario(h.getHoraInicio(), h.getHoraFinal());
        hora.setEstado(false);
        dia.agregar(hora);
        return dia;
    }
    
    protected boolean tipoAula(Class t1, Class t2) {
        if(t1.equals(Teorica.class) & t2.equals(Clase.class))
            return true;
        else if(t1.equals(Practica.class) & t2.equals(Laboratorio.class))
            return true;
        else 
            return false;
    }
    
    protected boolean aulaHora(List<Horario> aula, Horario hora) {
        for(int x=0; x < aula.size(); x++) {
            if(aula.get(x).getHoraInicio().equals(hora.getHoraInicio()) & 
               aula.get(x).getHoraFinal().equals(hora.getHoraFinal())) {
                if(!aula.get(x).isEstado()) {
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
    
    protected Aula aula(List<Aula> aula, String dia, Horario hora, Class curso, boolean restriccion) {
        for(int x=0; x < aula.size(); x++) {
            if(tipoAula(curso, aula.get(x).getClass()) & restriccion) {
                if(aulaDia(aula.get(x), aula.get(x).getHorario(), dia, hora))
                    return aula.get(x);
            } else {
                if(aulaDia(aula.get(x), aula.get(x).getHorario(), dia, hora) & !restriccion)
                    return aula.get(x);
            }
        }
        if(restriccion)
            aula(aula, dia, hora, curso, false);
        return null;
    }
    
    protected boolean crear(Asignatura curso, List<Horario> horaCurso, List<Horario> horaProfesor, String dia, List<Aula> aulas) {
        for(int i=0; i < horaCurso.size(); i++) {
            for(int j=0; j < horaProfesor.size(); j++) {
                if(horaCurso.get(i).isEstado() & horaProfesor.get(j).isEstado()) {
                    String[] hCurso = new String[]{horaCurso.get(i).getHoraInicio(), horaCurso.get(i).getHoraFinal()};
                    String[] hProfesor = new String[]{horaProfesor.get(j).getHoraInicio(), horaProfesor.get(j).getHoraFinal()};
                    if(hCurso[0].equals(hProfesor[0]) & hCurso[1].equals(hProfesor[1])) {                
                        Aula aula = aula(aulas, dia, horaCurso.get(i), curso.getClass(), true);
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
    
    protected boolean validar(Asignatura curso, List<Dia> diaCurso, List<Dia> diaProfesor, List<Aula> aula) {
        for(int i=0; i < diaCurso.size(); i++) {
            for(int j=0; j < diaProfesor.size(); j++) {
                if(diaCurso.get(i).getDia().equals(diaProfesor.get(j).getDia())) {
                    if(crear(curso, diaCurso.get(i).getHorario(), diaProfesor.get(j).getHorario(), diaCurso.get(i).getDia(), aula))
                        return true;
                }
            }
        }
        return false;
    }
    
    protected boolean crear(Asignatura curso, Profesor profesor, List<Aula> aula) {
        for(int x=0; x < profesor.getAsignatura().size(); x++) {
            if(curso.equals(profesor.getAsignatura().get(x))) {
                if(validar(curso, curso.getHorario(), profesor.getHorario(), aula))
                    return true;
            }
        }
        return false;
    }
    
    protected boolean crear(Asignatura curso, List<Usuario> profesor, List<Aula> aula) {
        for(int x=0; x < profesor.size(); x++) {
            if(profesor.get(x).getClass().equals(Profesor.class)) {
                if(crear(curso, (Profesor)profesor.get(x), aula)) 
                    return true;
            }
        }
        return false;
    }
    
    public void creara(List<Asignatura> curso, List<Usuario> profesor, List<Aula> aula, List<Asignatura> calendario) {
        if(!curso.isEmpty() & !profesor.isEmpty() & !aula.isEmpty()) {
            for(int x=0; x < curso.size(); x++) {
                if(crear(curso.get(x), profesor, aula)) {
                    calendario.add(curso.get(x));
                    curso.remove(x);
                    x -= 1;
                }
            }
        }
        //return calendario;
    }
    
    
    
    
    
    /**
     * 
     * @param cursos
     * @param curso
     * @return 
     */
    protected Horario compararHora(List<Horario> cursos, List<Horario> curso, boolean x) {
        Horario hora = new Horario(null, null);
        for(int i=0; i<cursos.size(); i++) {
            for(int j=0; j<curso.size(); j++) {
                if(cursos.get(i).isEstado() & curso.get(j).isEstado() &
                   cursos.get(i).getHoraInicio().equals(curso.get(j).getHoraInicio()) &
                   cursos.get(i).getHoraFinal().equals(curso.get(j).getHoraFinal())) {
                    if(x) {
                        curso.get(i).setEstado(false);
                        cursos.get(i).setEstado(false);
                        return null;
                    }
                } else if(!x) {
                    hora.setEstado(false);
                    hora.setHoraInicio(curso.get(j).getHoraInicio());
                    hora.setHoraInicio(curso.get(j).getHoraFinal());
                    return hora;
                }
            }
        }
        if(x)
            return null;
        else
            return hora;
    }
    
    /**
     * 
     * @param cursos
     * @param curso
     * @return 
     */
    protected Dia compararDia(List<Dia> cursos, List<Dia> curso, boolean x) { // true: encontrar - false: no encontrar
        Dia dia;
        for(int n=0; n<cursos.size(); n++) {
            for(int m=0; m< curso.size(); m++) {
                if(cursos.get(n).getDia().equals(curso.get(m).getDia())) {
                    Horario hora = compararHora(cursos.get(n).getHorario(), curso.get(m).getHorario(), x);
                    if(x & hora == null)
                        return null;
                    else if(hora != null) {
                        dia = new Dia(curso.get(m).getDia());
                        dia.agregar(hora);
                        return dia;
                    }
                }
            }
        }
        return null;
    }
    
    /**
     * 
     * @param curso
     * @param lista
     * @return 
     */
    protected boolean comparar(Asignatura curso, List<Usuario> lista) {
        for(int i=0; i<lista.size(); i++) {
            if(lista.get(i).getClass().equals(Profesor.class)) {
                List<Asignatura> profesor = ((Profesor)lista.get(i)).getAsignatura();
                for(int j=0; j<profesor.size(); j++) {
                    if(profesor.get(j).getCodigo().equals(curso.getCodigo())) {
                        if(compararDia(((Profesor)lista.get(i)).getHorario(), curso.getHorario(), true) == null)
                            return true;
                    }    
                }
            }
        }
        return false;
    }
    
    // SE ELIMINA SI SE LOGRA ADAPTAR AL
    protected Aula buscarAula(String tipo) {
        for(int i=0; i<aulas.size(); i++) {
            if(tipo.equals("Clase") & aulas.get(i) instanceof Clase)
                return aulas.get(i);
            else if(tipo.equals("Laboratorio") & aulas.get(i) instanceof Laboratorio)
                return aulas.get(i);    
        }
        return null;
    }
    
    
    
    /*
     * EN PROCESO DE CONSTRUCCION (SI SE NECESITA !!!!)
     */
    protected Aula buscarAula(List<Dia> _horario, Class tipo) {
        for(int i=0; i<aulas.size(); i++) {
            if(tipoAula(tipo,aulas.get(i).getClass())) {
                if(aulas.get(i).getHorario().isEmpty()) {
                    return aulas.get(i);
                } else {
                    Dia dia = compararDia(aulas.get(i).getHorario(), _horario, false);
                    if(dia != null) { // retorna un Dia que hay que setearlo al aula
                        aulas.get(i).agregar(dia);
                        return aulas.get(i);
                    }
                }
            }    
        }
        return null;
    }
    
    public void inicializarCalendario() {
        for(int x=0; x<asignaturas.size(); x++) {
            if(comparar(asignaturas.get(x), profesores)) {
                if(calendario.isEmpty()) {
                    //asignaturas.get(x).getHorario().get(0).getHorario().get(0).setEstado(false); // coloca el primer horario de la asignatura en false
                    Aula aula = null;
                    if(asignaturas.get(x) instanceof Practica)
                        aula = buscarAula("Laboratorio");
                    else 
                        aula = buscarAula("Clase");
                    Dia dia = new Dia(asignaturas.get(x).getHorario().get(0).getDia()); // crea un dia con el primer dia de la lista de horarios de la asignatura
                    dia.agregar(asignaturas.get(x).getHorario().get(0).getHorario().get(0)); // le agrega al dia el primer horario que tiene la asignatura
                    aula.agregar(dia);  // le agrega el horario al dia
                    this.aula.add(aula); // agrega el aula a la lista temporal
                    asignaturas.get(x).agregar(aula); // agrega el aula a la asignatura
                    calendario.add(asignaturas.get(x)); // agrega la asignatura al calendario
                    asignaturas.remove(x); // elimina la asignatura que se agrego al calendario de la lista de asignaturas
                    x -= 1;
                } else {
                    for(int i=0; i < aulas.size(); i++) {
                        Aula aula = buscarAula(asignaturas.get(x).getHorario(), asignaturas.get(x).getClass());
                        this.aula.add(aula);
                        asignaturas.get(x).agregar(aula);
                        calendario.add(asignaturas.get(x));
                        asignaturas.remove(x);
                        x -= 1;
                    }
                }
            
                
                /*for(int i=0; i<calendario.size(); i++) { // recorre lista calendario
                    List<Dia> dias = calendario.get(i).getHorario();
                    for(int j=0; j<dias.size(); j++) { // recorre lista de los dias
                        List<Horario> horarios = dias.get(j).getHorario();
                        if(dias.get(j).getDia().equals(asignaturas.get(i).getHorario().get(0).getDia())) {
                            
                        }
                        for(int k=0; k<horarios.size(); k++) { // recorre lista de horarios de un dia
                            if(horarios.get(i).isEstado()) { // retorna 
                                if(compararHorario()) {
                                
                                }
                            }   
                            if(_lista.get(i).isEstado())
                                compararHorario()
                        }           
                        if(_lista.get(i).getDia().equals(_horario.getDia()))
                            return buscarHorario(_lista.get(i).getHorario(), _horario.getHorario());
                    }
                    if(buscarDia(calendario.get(i).getHorario(),_horario))
                        return false;
                }*/
            } else
                asignaturas.get(x).setError(1); // error 1: no coinciden los horarios del profesor con la asignatura
        }
    }
    
    /**
     * Recorre la lista calendario.
     * 
     * @param _horario
     * @return true:el campo esta libre
     *         false: el campo esta ocupado
     */
    /*protected boolean buscarCalendario(Dia _horario) {
        if(calendario.isEmpty())
            return true;
        else {
            for(int i=0; i<calendario.size(); i++) {
                if(buscarDia(calendario.get(i).getHorario(),_horario))
                    return false;
            }
            return true;
        }
    }
    
    protected boolean buscarDia(ArrayList<Dia> _lista, Dia _horario) {
        if(_lista.isEmpty())
            return false;
        else {
            for(int i=0; i<_lista.size(); i++) {
                if(_lista.get(i).getDia().equals(_horario.getDia()))
                    return buscarHorario(_lista.get(i).getHorario(), _horario.getHorario());
            }
        }
        return true;
    }
    
    protected boolean buscarHorario(ArrayList<Horario> _lista, ArrayList<Horario> _horario) {
        if(_lista.isEmpty())
            return false;
        else {
            for(int i=0; i<_lista.size(); i++) {
                if(_lista.get(i).isEstado())
                    compararHorario()
            }
        }
        return true;
    }*/
}
