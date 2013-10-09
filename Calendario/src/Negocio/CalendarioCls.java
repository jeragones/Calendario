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
    List<Aula> aula = new ArrayList<Aula>();
    
    DepartamentoCls insDepa = new DepartamentoCls();
    UsuarioCls insUs = new UsuarioCls();
    
    public void profesores() {
        //aulas();
        departamentos();
        /*ArchivoCls insC = new ArchivoCls();
        insC.cargar();
        for(int y=0; y < DepartamentoCls.getDepartamento().size(); y++) {
            for(int x=0; x < DepartamentoCls.getDepartamento().get(y).getAsignatura().size(); x++) {
                asignaturas.add(DepartamentoCls.getDepartamento().get(y).getAsignatura().get(x));
            }
        }*/
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
        
        /*for(int i=0; i < asignaturas.size(); i++) {
            System.err.println(String.valueOf(i)+" "+asignaturas.get(i).getCodigo()+" "+asignaturas.get(i).getNombre());
        }*/
        
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
        insDepa.getDepartamento("Computacion").agregar(p1);
        Teorica t2 = new Teorica("CI1802","Introduccion a la Programacion",50,1,4,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(t2);
        insDepa.getDepartamento("Computacion").agregar(t2);
        Practica t1 = new Practica("CI1803","Taller de Programacion",50,1,4,"Windows 7");
        asignaturas.add(t1);
        insDepa.getDepartamento("Computacion").agregar(t1);
        Teorica p2 = new Teorica("CI0202","Ingles Basico",50,1,2,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(p2);
        insDepa.getDepartamento("Ciencias y Letras").agregar(p2);
        Practica p3 = new Practica("MA0101","Matematica General",50,1,3,"Windows 7");
        asignaturas.add(p3);
        insDepa.getDepartamento("Ciencias y Letras").agregar(p3);
        Teorica p4 = new Teorica("CI1311","Ingles I para Computacion",50,1,2,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(p4);
        insDepa.getDepartamento("Ciencias y Letras").agregar(p4);
        Teorica p5 = new Teorica("CI1403","Comunicacion Tecnica",50,1,2,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(p5);
        insDepa.getDepartamento("Ciencias y Letras").agregar(p5);
        Practica t3 = new Practica("CI2001","Estructura de Datos",50,2,4,"Windows 7");
        asignaturas.add(t3);
        insDepa.getDepartamento("Computacion").agregar(t3);
        Practica p6 = new Practica("CI2101","Programacion Orientada a Objetos",50,2,4,"Windows 7");
        asignaturas.add(p6);
        insDepa.getDepartamento("Computacion").agregar(p6);
        Teorica t4 = new Teorica("CI3101","Arquitectura de Computadores",50,2,4,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(t4);
        insDepa.getDepartamento("Computacion").agregar(t4);
        Teorica p7 = new Teorica("CI1312","Ingles II para Computacion",50,2,2,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(p7);
        insDepa.getDepartamento("Ciencias y Letras").agregar(p7);
        Practica p8 = new Practica("MA1404","Calculo",50,2,4,"Windows 7");
        asignaturas.add(p8);
        insDepa.getDepartamento("Ciencias y Letras").agregar(p8);
        Teorica p9 = new Teorica("CI3002","Analisis de Algoritmos",50,3,4,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(p9);
        insDepa.getDepartamento("Computacion").agregar(p9);
        Practica p10 = new Practica("CI4301","Bases de Datos I",50,3,4,"Ubunto");
        asignaturas.add(p10);
        insDepa.getDepartamento("Computacion").agregar(p10);
        Teorica t5 = new Teorica("CI1313","Ingles III para Computacion",50,3,2,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(t5);
        insDepa.getDepartamento("Ciencias y Letras").agregar(t5);
        Teorica t6 = new Teorica("CS2101","Ambiente Humano",50,3,2,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(t6);
        insDepa.getDepartamento("Ciencias y Letras").agregar(t6);
        Practica t7 = new Practica("MA2405","Algebra Lineal para Computacion",50,3,4,"Windows 7");
        asignaturas.add(t7);
        insDepa.getDepartamento("Ciencias y Letras").agregar(t7);
        Teorica p11 = new Teorica("CI4302","Bases de Datos II",50,4,4,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(p11);
        insDepa.getDepartamento("Computacion").agregar(p11);
        Practica p12 = new Practica("CI4700","Lenguajes de Programacion",50,4,4,"Windows 7");
        asignaturas.add(p12);
        insDepa.getDepartamento("Computacion").agregar(p12);
        Practica p13 = new Practica("CI5821","Requerimientos de Software",50,4,4,"Window 7");
        asignaturas.add(p13);
        insDepa.getDepartamento("Computacion").agregar(p13);
        Teorica t8 = new Teorica("CI1314","Ingles IV para Computacion",50,4,2,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(t8);
        insDepa.getDepartamento("Ciencias y Letras").agregar(t8);
        Practica t9 = new Practica("MA2404","Probabilidades",50,4,4,"Windows 7");
        asignaturas.add(t9);
        insDepa.getDepartamento("Ciencias y Letras").agregar(t9);
        Teorica t10 = new Teorica("CI4810","Administracion de Proyectos",50,5,4,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(t10);
        insDepa.getDepartamento("Computacion").agregar(t10);
        Practica p14 = new Practica("CI5701","Compiladores e Interpretes",50,5,4,"Windows 7");
        asignaturas.add(p14);
        insDepa.getDepartamento("Computacion").agregar(p14);
        Practica p15 = new Practica("CI6821","Diseño de Software de Software",50,5,4,"Windows 7");
        asignaturas.add(p15);
        insDepa.getDepartamento("Computacion").agregar(p15);
        Teorica t11 = new Teorica("CS3401","Seminario de Estudios Filosoficos",50,5,2,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(t11);
        insDepa.getDepartamento("Ciencias y Letras").agregar(t11);
        Practica p16 = new Practica("MA3405","Estadistica",50,5,4,"Windows 7");
        asignaturas.add(p16);
        insDepa.getDepartamento("Ciencias y Letras").agregar(p16);
        Teorica t12 = new Teorica("CI4003","Electiva I",50,6,4,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(t12);
        insDepa.getDepartamento("Computacion").agregar(t12);
        Practica p18 = new Practica("CI6400","Investigacion de Operaciones",50,6,4,"Windows 8");
        asignaturas.add(p18);
        insDepa.getDepartamento("Computacion").agregar(p18);
        Teorica t13 = new Teorica("CI6600","Principios de Sistemas Operativos",50,6,4,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(t13);
        insDepa.getDepartamento("Computacion").agregar(t13);
        Teorica t14 = new Teorica("CI6831","Aseguramiento de la Calidad de Software",50,6,4,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(t14);
        insDepa.getDepartamento("Computacion").agregar(t14);
        Teorica t15 = new Teorica("CI7900","Computacion y Sociedad",50,6,2,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(t15);
        insDepa.getDepartamento("Computacion").agregar(t15);
        Teorica t16 = new Teorica("CS4402","Seminario de Estudios Costarricenses",50,6,2,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(t16);
        insDepa.getDepartamento("Ciencias y Letras").agregar(t16);
        Practica p19 = new Practica("CI5001","Electiva II",50,7,4,"Windows 8");
        asignaturas.add(p19);
        insDepa.getDepartamento("Computacion").agregar(p19);
        Practica p20 = new Practica("CI6200","Inteligencia Artificial",50,7,4,"Windows 8");
        asignaturas.add(p20);
        insDepa.getDepartamento("Computacion").agregar(p20);
        Teorica t21 = new Teorica("CI7602","Redes",50,7,4,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(t21);
        insDepa.getDepartamento("Computacion").agregar(t21);
        Practica p21 = new Practica("CI7841","Proyecto de Ingenieria de Software",50,7,4,"Windows 7");
        asignaturas.add(p21);
        insDepa.getDepartamento("Computacion").agregar(p21);
        Teorica t22 = new Teorica("AE4208","Desarrollo de Emprendedores",50,7,3,"www.tec-digital.itcr.ac.cr");
        asignaturas.add(t22);
        insDepa.getDepartamento("Administracion de Empresas").agregar(t22);
        departamentos = insDepa.getDepartamento();
        asignaturas1();
    }
    
    protected void asignaturas1() {
        for(int i=0; i < insDepa.getDepartamento().size(); i++) {
            for(int j=0; j < insDepa.getDepartamento().get(i).getAsignatura().size(); j++) {
                Dia d1 = new Dia("Lunes");
                d1.agregar(new Horario("7:00", "11:30"));
                d1.agregar(new Horario("12:30", "4:00"));
                insDepa.getDepartamento().get(i).getAsignatura().get(j).agregar(d1);
                Dia d2 = new Dia("Martes");
                d2.agregar(new Horario("7:00", "11:30"));
                d2.agregar(new Horario("12:30", "4:00"));
                insDepa.getDepartamento().get(i).getAsignatura().get(j).agregar(d2);
                Dia d3 = new Dia("Miercoles");
                d3.agregar(new Horario("7:00", "11:30"));
                d3.agregar(new Horario("12:30", "4:00"));
                insDepa.getDepartamento().get(i).getAsignatura().get(j).agregar(d3);
                Dia d4 = new Dia("Jueves");
                d4.agregar(new Horario("7:00", "11:30"));
                d4.agregar(new Horario("12:30", "4:00"));
                insDepa.getDepartamento().get(i).getAsignatura().get(j).agregar(d4);
                Dia d5 = new Dia("Viernes");
                d5.agregar(new Horario("7:00", "11:30"));
                d5.agregar(new Horario("12:30", "4:00"));
                insDepa.getDepartamento().get(i).getAsignatura().get(j).agregar(d5);
                if(insDepa.getDepartamento().get(i).getAsignatura().get(j).getCodigo().equals("CI1403")) {
                    insDepa.getDepartamento().get(i).getAsignatura().get(j).getHorario().clear();
                    insDepa.getDepartamento().get(i).getAsignatura().get(j).agregar(d1);
                }
            }
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
    
    protected boolean validarHora(List<Horario> curso, String[] horario) {
        for(int i=0; i < curso.size(); i++) {
            if(curso.get(i).getHoraInicio().equals(horario[1]) &
               curso.get(i).getHoraFinal().equals(horario[2])) {
                if(!curso.get(i).isEstado())
                    return true;
            }
        }
        return false;
    }
    
    protected boolean validarDia(List<Dia> curso, String[] horario) {
        for(int i=0; i < curso.size(); i++) {
            if(curso.get(i).getDia().equals(horario[0])) {
                return validarHora(curso.get(i).getHorario(), horario);
            }
                //return false;
        }
        return false;
    }
    
    protected boolean validarSemestre(List<Asignatura> cursos, Asignatura curso, String[] horario) {
        for(int i=0; i < cursos.size(); i++) {
            if(!cursos.get(i).equals(curso) & 
                cursos.get(i).getSemestre() == curso.getSemestre()) {
                if(validarDia(cursos.get(i).getHorario(), horario))
                    return false;
            }
        }
        return true;
    }
    
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
    
    protected boolean aulaHora(List<Horario> aula, Horario hora) {
        for(int x=0; x < aula.size(); x++) {
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
    
    protected void calendario(List<Asignatura> cursos, List<Asignatura> curso, List<Profesor> profesor, List<Aula> aula, String departamento, List<Asignatura> calendario) {
        if(!curso.isEmpty() & !profesor.isEmpty() & !aula.isEmpty()) {
            for(int x=0; x < curso.size(); x++) {
                if(crear(cursos, curso.get(x), profesor, aula, departamento))
                    calendario.add(curso.get(x));
            }
        }
    }
    
    public ArrayList<Asignatura> crear(List<Departamento> departamento, List<Usuario> usuario, List<Aula> aula) {
        ArrayList<Asignatura> cursos = new ArrayList<>();
        for(int x=0; x < departamento.size(); x++) 
            cursos.addAll(departamento.get(x).getAsignatura());
        for(int x=0; x < departamento.size(); x++) {
            calendario(cursos, departamento.get(x).getAsignatura(), departamento.get(x).getProfesor(), aula, departamento.get(x).getDepartamento(), calendario);
        }
        if(calendario.size() == cursos.size())
            return calendario;
        else {
            ordenar(calendario);
            return calendario;
        }
    }
    
    protected void ordenar(List<Asignatura> calendario) {
        
    }
    
    
    
    
    
    /**
     * 
     * @param cursos
     * @param curso
     * @return 
     */
    /*protected Horario compararHora(List<Horario> cursos, List<Horario> curso, boolean x) {
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
    /*protected Dia compararDia(List<Dia> cursos, List<Dia> curso, boolean x) { // true: encontrar - false: no encontrar
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
    /*protected boolean comparar(Asignatura curso, List<Usuario> lista) {
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
    /*protected Aula buscarAula(List<Dia> _horario, Class tipo) {
        for(int i=0; i<aulas.size(); i++) {
            if(tipoAula(tipo.getName(),aulas.get(i).getClass())) {
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
            /*} else
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
