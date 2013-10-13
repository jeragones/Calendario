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
 *
 * @author Daniel Berrocal
 * @author Jorge Rojas
 */
public class CalendarioCls {

    /**
     * @param args the command line arguments
     */
    
    static ArrayList<Asignatura> calendario = new ArrayList<>();
    public ArrayList<Aula> aulas = new ArrayList<>();
    
    public ArrayList<Asignatura> asignaturas = new ArrayList<>();
    public ArrayList<Departamento> departamentos = new ArrayList<>();
    
    public ArrayList<Usuario> profesores = new ArrayList<>();
    List<Aula> aula = new ArrayList<>();
    
    public void profesores() {
        aulas();
        departamentos();
        Departamento dep = DepartamentoCls.getDepartamento("Computacion");
        Departamento dep1 = DepartamentoCls.getDepartamento("Ciencias y Letras");
        Profesor p1 = new Profesor("Oscar Viquez", "oviquez", "oviquez", "2-987-654");
        p1.agregar(asignaturas.get(8));
        p1.agregar(asignaturas.get(18));
        p1.agregar(asignaturas.get(23));
        p1.agregar(asignaturas.get(29));
        profesores.add(p1);
        dep.agregar(p1);
        
        Profesor p3 = new Profesor("Lorena Valerio", "lvalerio", "lvalerio", "3-895-234");
        p3.agregar(asignaturas.get(7));
        p3.agregar(asignaturas.get(12));
        p3.agregar(asignaturas.get(31));
        profesores.add(p3);
        dep.agregar(p3);
        
        Profesor p4 = new Profesor("Gaudy Esquivel", "gesquivel", "gesquivel", "2-856-681");
        p4.agregar(asignaturas.get(13));
        p4.agregar(asignaturas.get(22));
        profesores.add(p4);
        dep.agregar(p4);
        
        Profesor p5 = new Profesor("Jorge Velazco", "jvelazco", "jvelazco", "1-963-785");
        p5.agregar(asignaturas.get(0));
        p5.agregar(asignaturas.get(9));
        p5.agregar(asignaturas.get(35));
        profesores.add(p5);
        dep.agregar(p5);
        
        Profesor p6 = new Profesor("Oscar Lopez", "olopez", "olopez", "2-963-741");
        p6.agregar(asignaturas.get(17));
        p6.agregar(asignaturas.get(19));
        p6.agregar(asignaturas.get(24));
        p6.agregar(asignaturas.get(30));
        p6.agregar(asignaturas.get(28));
        p6.agregar(asignaturas.get(36));
        profesores.add(p6);
        dep.agregar(p6);
        
        Profesor p13 = new Profesor("Abel Mendez", "amendez", "amendez", "2-854-657");
        p13.agregar(asignaturas.get(1));
        p13.agregar(asignaturas.get(2));
        p13.agregar(asignaturas.get(33));
        p13.agregar(asignaturas.get(27));
        p13.agregar(asignaturas.get(34));
        profesores.add(p13);
        dep.agregar(p13);
        
        Profesor p7 = new Profesor("Oscar Cordoba", "ocordoba", "ocordoba", "2-682-789");
        p7.agregar(asignaturas.get(37));
        profesores.add(p7);
        DepartamentoCls.getDepartamento("Administracion de Empresas").agregar(p7);
        
        Profesor p8 = new Profesor("Esteban Ballestero", "eballestero", "eballestero", "2-983-137");
        p8.agregar(asignaturas.get(11));
        p8.agregar(asignaturas.get(21));
        profesores.add(p8);
        dep1.agregar(p8);
        
        Profesor p9 = new Profesor("Rodolfo Jimenez", "rjimenez", "rjimenez", "2-743-961");
        p9.agregar(asignaturas.get(4));
        p9.agregar(asignaturas.get(16));
        p9.agregar(asignaturas.get(26));
        profesores.add(p9);
        dep1.agregar(p9);
        
        Profesor p10 = new Profesor("Marlon Benavidez", "mbenavidez", "mbenavidez", "3-951-753");
        p10.agregar(asignaturas.get(14));
        p10.agregar(asignaturas.get(20));
        profesores.add(p10);
        dep1.agregar(p10);
        
        Profesor p11 = new Profesor("Danilo Alpizar", "dalpizar", "dalpizar", "1-654-357");
        p11.agregar(asignaturas.get(3));
        p11.agregar(asignaturas.get(5));
        p11.agregar(asignaturas.get(10));
        profesores.add(p11);
        dep1.agregar(p11);
        
        Profesor p12 = new Profesor("Karina Corella Esquivez", "kesquivel", "kesquivel", "1-125-985");
        p12.agregar(asignaturas.get(6));
        p12.agregar(asignaturas.get(15));
        p12.agregar(asignaturas.get(25));
        p12.agregar(asignaturas.get(32));
        profesores.add(p12);
        dep1.agregar(p12);
        
        profesores1();
        
        Coordinador p2 = new Coordinador("Leonardo Viquez", "lviquez", "lviquez");
        profesores.add(p2);
        UsuarioCls.setUsuario(profesores);

        ArchivoCls ins = new ArchivoCls();
        
        ArrayList<Object> l = new ArrayList<>();
        for(int i=0; i < UsuarioCls.getUsuario().size(); i++) {
            l.add(UsuarioCls.getUsuario().get(i));
        }
        ins.guardar("usuario", l);
        l.clear();
        for(int i=0; i < DepartamentoCls.getDepartamento().size(); i++) {
            l.add(DepartamentoCls.getDepartamento().get(i));
        }
        ins.guardar("departamento", l);
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
    }
    
    public void departamentos() {
        departamentos.add(new Departamento("Computacion"));
        departamentos.add(new Departamento("Ciencias y Letras"));
        departamentos.add(new Departamento("Administracion de Empresas"));
        DepartamentoCls.setDepartamento(departamentos);
        asignaturas();
    }
    
    public void aulas() {
        aulas.add(new Clase("Aula 01",1,"Computacion",30,true));
        aulas.add(new Clase("Aula 02",2,"Computacion",30,true));
        aulas.add(new Clase("Aula 03",3,"Computacion",30,true));
        aulas.add(new Clase("Aula 04",4,"Ciencias y Letras",30,true));
        aulas.add(new Clase("Aula 05",5,"Ciencias y Letras",30,false));
        aulas.add(new Clase("Aula 06",6,"Ciencias y Letras",30,true));
        aulas.add(new Clase("Aula 07",7,"Ciencias y Letras",30,true));
        aulas.add(new Clase("Aula 08",8,"Ciencias y Letras",30,false));
        aulas.add(new Clase("Aula 09",9,"Ciencias y Letras",30,true));
        aulas.add(new Clase("Aula 10",10,"Ciencias y Letras",30,false));
        aulas.add(new Clase("Aula 11",11,"Ciencias y Letras",30,false));
        aulas.add(new Clase("Aula 12",12,"Ciencias y Letras",30,true));
        aulas.add(new Laboratorio("LAIMI",3,"Computacion",30));
        aulas.add(new Laboratorio("Laboratorio 01",1,"Computacion",24));
        aulas.add(new Laboratorio("Laboratorio 02",2,"Computacion",24));
    }
    
    public void asignaturas(){
        Teorica p1 = new Teorica("CI1400","Fundamentos de Organizacion de Computadoras",50,1,4,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(p1);
        DepartamentoCls.getDepartamento("Computacion").agregar(p1);
        Teorica t2 = new Teorica("CI1802","Introduccion a la Programacion",50,1,4,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(t2);
        DepartamentoCls.getDepartamento("Computacion").agregar(t2);
        Practica t1 = new Practica("CI1803","Taller de Programacion",50,1,4,"Windows 7");
        asignaturas.add(t1);
        DepartamentoCls.getDepartamento("Computacion").agregar(t1);
        Teorica p2 = new Teorica("CI0202","Ingles Basico",50,1,2,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(p2);
        DepartamentoCls.getDepartamento("Ciencias y Letras").agregar(p2);
        Practica p3 = new Practica("MA0101","Matematica General",50,1,3,"Windows 7");
        asignaturas.add(p3);
        DepartamentoCls.getDepartamento("Ciencias y Letras").agregar(p3);
        Teorica p4 = new Teorica("CI1311","Ingles I para Computacion",50,1,2,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(p4);
        DepartamentoCls.getDepartamento("Ciencias y Letras").agregar(p4);
        Teorica p5 = new Teorica("CI1403","Comunicacion Tecnica",50,1,2,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(p5);
        DepartamentoCls.getDepartamento("Ciencias y Letras").agregar(p5);
        Practica t3 = new Practica("CI2001","Estructura de Datos",50,2,4,"Windows 7");
        asignaturas.add(t3);
        DepartamentoCls.getDepartamento("Computacion").agregar(t3);
        Practica p6 = new Practica("CI2101","Programacion Orientada a Objetos",50,2,4,"Windows 7");
        asignaturas.add(p6);
        DepartamentoCls.getDepartamento("Computacion").agregar(p6);
        Teorica t4 = new Teorica("CI3101","Arquitectura de Computadores",50,2,4,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(t4);
        DepartamentoCls.getDepartamento("Computacion").agregar(t4);
        Teorica p7 = new Teorica("CI1312","Ingles II para Computacion",50,2,2,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(p7);
        DepartamentoCls.getDepartamento("Ciencias y Letras").agregar(p7);
        Practica p8 = new Practica("MA1404","Calculo",50,2,4,"Windows 7");
        asignaturas.add(p8);
        DepartamentoCls.getDepartamento("Ciencias y Letras").agregar(p8);
        Teorica p9 = new Teorica("CI3002","Analisis de Algoritmos",50,3,4,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(p9);
        DepartamentoCls.getDepartamento("Computacion").agregar(p9);
        Practica p10 = new Practica("CI4301","Bases de Datos I",50,3,4,"Ubunto");
        asignaturas.add(p10);
        DepartamentoCls.getDepartamento("Computacion").agregar(p10);
        Teorica t5 = new Teorica("CI1313","Ingles III para Computacion",50,3,2,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(t5);
        DepartamentoCls.getDepartamento("Ciencias y Letras").agregar(t5);
        Teorica t6 = new Teorica("CS2101","Ambiente Humano",50,3,2,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(t6);
        DepartamentoCls.getDepartamento("Ciencias y Letras").agregar(t6);
        Practica t7 = new Practica("MA2405","Algebra Lineal para Computacion",50,3,4,"Windows 7");
        asignaturas.add(t7);
        DepartamentoCls.getDepartamento("Ciencias y Letras").agregar(t7);
        Teorica p11 = new Teorica("CI4302","Bases de Datos II",50,4,4,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(p11);
        DepartamentoCls.getDepartamento("Computacion").agregar(p11);
        Practica p12 = new Practica("CI4700","Lenguajes de Programacion",50,4,4,"Windows 7");
        asignaturas.add(p12);
        DepartamentoCls.getDepartamento("Computacion").agregar(p12);
        Practica p13 = new Practica("CI5821","Requerimientos de Software",50,4,4,"Window 7");
        asignaturas.add(p13);
        DepartamentoCls.getDepartamento("Computacion").agregar(p13);
        Teorica t8 = new Teorica("CI1314","Ingles IV para Computacion",50,4,2,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(t8);
        DepartamentoCls.getDepartamento("Ciencias y Letras").agregar(t8);
        Practica t9 = new Practica("MA2404","Probabilidades",50,4,4,"Windows 7");
        asignaturas.add(t9);
        DepartamentoCls.getDepartamento("Ciencias y Letras").agregar(t9);
        Teorica t10 = new Teorica("CI4810","Administracion de Proyectos",50,5,4,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(t10);
        DepartamentoCls.getDepartamento("Computacion").agregar(t10);
        Practica p14 = new Practica("CI5701","Compiladores e Interpretes",50,5,4,"Windows 7");
        asignaturas.add(p14);
        DepartamentoCls.getDepartamento("Computacion").agregar(p14);
        Practica p15 = new Practica("CI6821","Diseño de Software de Software",50,5,4,"Windows 7");
        asignaturas.add(p15);
        DepartamentoCls.getDepartamento("Computacion").agregar(p15);
        Teorica t11 = new Teorica("CS3401","Seminario de Estudios Filosoficos",50,5,2,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(t11);
        DepartamentoCls.getDepartamento("Ciencias y Letras").agregar(t11);
        Practica p16 = new Practica("MA3405","Estadistica",50,5,4,"Windows 7");
        asignaturas.add(p16);
        DepartamentoCls.getDepartamento("Ciencias y Letras").agregar(p16);
        Teorica t12 = new Teorica("CI4003","Electiva I",50,6,4,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(t12);
        DepartamentoCls.getDepartamento("Computacion").agregar(t12);
        Practica p18 = new Practica("CI6400","Investigacion de Operaciones",50,6,4,"Windows 8");
        asignaturas.add(p18);
        DepartamentoCls.getDepartamento("Computacion").agregar(p18);
        Teorica t13 = new Teorica("CI6600","Principios de Sistemas Operativos",50,6,4,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(t13);
        DepartamentoCls.getDepartamento("Computacion").agregar(t13);
        Teorica t14 = new Teorica("CI6831","Aseguramiento de la Calidad de Software",50,6,4,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(t14);
        DepartamentoCls.getDepartamento("Computacion").agregar(t14);
        Teorica t15 = new Teorica("CI7900","Computacion y Sociedad",50,6,2,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(t15);
        DepartamentoCls.getDepartamento("Computacion").agregar(t15);
        Teorica t16 = new Teorica("CS4402","Seminario de Estudios Costarricenses",50,6,2,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(t16);
        DepartamentoCls.getDepartamento("Ciencias y Letras").agregar(t16);
        Practica p19 = new Practica("CI5001","Electiva II",50,7,4,"Windows 8");
        asignaturas.add(p19);
        DepartamentoCls.getDepartamento("Computacion").agregar(p19);
        Practica p20 = new Practica("CI6200","Inteligencia Artificial",50,7,4,"Windows 8");
        asignaturas.add(p20);
        DepartamentoCls.getDepartamento("Computacion").agregar(p20);
        Teorica t21 = new Teorica("CI7602","Redes",50,7,4,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(t21);
        DepartamentoCls.getDepartamento("Computacion").agregar(t21);
        Practica p21 = new Practica("CI7841","Proyecto de Ingenieria de Software",50,7,4,"Windows 7");
        asignaturas.add(p21);
        DepartamentoCls.getDepartamento("Computacion").agregar(p21);
        Teorica t22 = new Teorica("AE4208","Desarrollo de Emprendedores",50,7,3,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(t22);
        DepartamentoCls.getDepartamento("Administracion de Empresas").agregar(t22);
        departamentos = DepartamentoCls.getDepartamento();
        asignaturas1();
    }
    
    protected void asignaturas1() {
        for(int i=0; i < DepartamentoCls.getDepartamento().size(); i++) {
            for(int j=0; j < DepartamentoCls.getDepartamento().get(i).getAsignatura().size(); j++) {
                Dia d1 = new Dia("Lunes");
                d1.agregar(new Horario("7:00", "11:30"));
                d1.agregar(new Horario("12:30", "4:00"));
                DepartamentoCls.getDepartamento().get(i).getAsignatura().get(j).agregar(d1);
                Dia d2 = new Dia("Martes");
                d2.agregar(new Horario("7:00", "11:30"));
                d2.agregar(new Horario("12:30", "4:00"));
                DepartamentoCls.getDepartamento().get(i).getAsignatura().get(j).agregar(d2);
                Dia d3 = new Dia("Miercoles");
                d3.agregar(new Horario("7:00", "11:30"));
                d3.agregar(new Horario("12:30", "4:00"));
                DepartamentoCls.getDepartamento().get(i).getAsignatura().get(j).agregar(d3);
                Dia d4 = new Dia("Jueves");
                d4.agregar(new Horario("7:00", "11:30"));
                d4.agregar(new Horario("12:30", "4:00"));
                DepartamentoCls.getDepartamento().get(i).getAsignatura().get(j).agregar(d4);
                Dia d5 = new Dia("Viernes");
                d5.agregar(new Horario("7:00", "11:30"));
                d5.agregar(new Horario("12:30", "4:00"));
                DepartamentoCls.getDepartamento().get(i).getAsignatura().get(j).agregar(d5);
                if(DepartamentoCls.getDepartamento().get(i).getAsignatura().get(j).getCodigo().equals("CI1403")) {
                    DepartamentoCls.getDepartamento().get(i).getAsignatura().get(j).getHorario().clear();
                    DepartamentoCls.getDepartamento().get(i).getAsignatura().get(j).agregar(d1);
                }
            }
        }
    }
    
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
        for(int x=0; x < cursos.size(); x++) {
            
        }
    }
}
