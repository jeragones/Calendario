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
    
    List<Asignatura> calendario = new ArrayList<>();
    List<Aula> aula = new ArrayList<Aula>();
    
    
    
    
    
    
    List<Departamento> departamentos = new ArrayList<>();
    
    List<Aula> aulas = new ArrayList<>();
    List<Profesor> profesores = new ArrayList<>();
    List<Asignatura> asignaturas = new ArrayList<>();
    
    
    
    /*public static void main(String[] args) {

    }*/
    
    // AUTOMATICO
    
    public void profesores() {
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
        aulas();
        profesores1();
    }
    
    protected void profesores1() {
        for(int i=0; i<profesores.size(); i++) {
            Dia d1 = new Dia("Lunes");
            d1.agregar(new Horario("7:00", "11:30"));
            d1.agregar(new Horario("12:30", "4:00"));
            profesores.get(i).agregar(d1);
            Dia d2 = new Dia("Martes");
            d2.agregar(new Horario("7:00", "11:30"));
            d2.agregar(new Horario("12:30", "4:00"));
            profesores.get(i).agregar(d2);
            Dia d3 = new Dia("Miercoles");
            d3.agregar(new Horario("7:00", "11:30"));
            d3.agregar(new Horario("12:30", "4:00"));
            profesores.get(i).agregar(d3);
            Dia d4 = new Dia("Jueves");
            d4.agregar(new Horario("7:00", "11:30"));
            d4.agregar(new Horario("12:30", "4:00"));
            profesores.get(i).agregar(d4);
            Dia d5 = new Dia("Viernes");
            d5.agregar(new Horario("7:00", "11:30"));
            d5.agregar(new Horario("12:30", "4:00"));
            profesores.get(i).agregar(d5);
        }
    }
    
    protected void departamentos(){
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
        inicializarCalendario();
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
    
    protected Aula buscarAula(String tipo) {
        for(int i=0; i<aulas.size(); i++) {
            if(aulas.get(i).getClass().getName().equals(tipo))
                return aulas.get(i);
        }
        return null;
    }
    
    public void inicializarCalendario() {
        for(int x=0; x<asignaturas.size(); x++) {
            if(calendario.isEmpty()) {
                asignaturas.get(x).getHorario().get(0).getHorario().get(0).setEstado(false);
                Aula aula = null;
                if(asignaturas.get(x) instanceof Practica)
                    aula = buscarAula("Laboratorio");
                else 
                    aula = buscarAula("Clase");
                Dia dia = new Dia(asignaturas.get(x).getHorario().get(0).getDia());
                dia.agregar(asignaturas.get(x).getHorario().get(0).getHorario().get(0));
                aula.agregar(dia);
                asignaturas.get(x).agregar(aula);
                calendario.add(asignaturas.get(x));
                asignaturas.remove(x);
                x -= 1;
            } else {
                for(int i=0; i < aulas.size(); i++) {
                    
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
            }
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
    
    protected boolean compararHorario(String _horario1, String _horario2) {
        
        
        
        
        
        
        return true;
    } 
}
