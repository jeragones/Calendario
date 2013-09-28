/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.Asignatura.Departamento;
import Datos.Asignatura.Practica;
import Datos.Asignatura.Teorica;
import Datos.Aula.Aula;
import Datos.Aula.Clase;
import Datos.Aula.Laboratorio;
import Datos.Horario.Dia;
import Datos.Horario.Horario;
import Datos.Usuario.Profesor;
import java.util.List;

/**
 *
 * @author GeOrge
 */
public class Calendario {

    /**
     * @param args the command line arguments
     */
    
    List<Departamento> departamentos;
    List<Aula> aulas;
    List<Profesor> profesores;
    
    
    public static void main(String[] args) {
        
        //new vPrincipal().show();
    }
    
    // AUTOMATICO
    
    protected void profesores() {
        profesores.add(new Profesor("Oscar Viquez", "oviquez", "oviquez", "2-987-654"));
        profesores.add(new Profesor("Leonardo Viquez", "lviquez", "lviquez", "2-321-658"));
        profesores.add(new Profesor("Lorena Valerio", "lvalerio", "lvalerio", "3-895-234"));
        profesores.add(new Profesor("Gaudy Esquivel", "gesquivel", "gesquivel", "2-856-681"));
        profesores.add(new Profesor("Jorge Velazco", "jvelazco", "jvelazco", "1-963-785"));
        profesores.add(new Profesor("Oscar Lopez", "olopez", "olopez", "2-963-741"));
    }
    
    protected void profesores1() {
        for(int i=0; i<profesores.size(); i++) {
            Dia d1 = new Dia("Lunes");
            d1.agregar(new Horario("7:00", "11:30"));
            d1.agregar(new Horario("12:30", "4:00"));
            profesores.get(0).agregar(d1);
            Dia d2 = new Dia("Martes");
            d2.agregar(new Horario("7:00", "11:30"));
            d2.agregar(new Horario("12:30", "4:00"));
            profesores.get(0).agregar(d2);
            Dia d3 = new Dia("Miercoles");
            d3.agregar(new Horario("7:00", "11:30"));
            d3.agregar(new Horario("12:30", "4:00"));
            profesores.get(0).agregar(d3);
            Dia d4 = new Dia("Jueves");
            d4.agregar(new Horario("7:00", "11:30"));
            d4.agregar(new Horario("12:30", "4:00"));
            profesores.get(0).agregar(d4);
            Dia d5 = new Dia("Viernes");
            d5.agregar(new Horario("7:00", "11:30"));
            d5.agregar(new Horario("12:30", "4:00"));
            profesores.get(0).agregar(d5);
        }
    }
    
    protected void departamentos(){
        departamentos.add(new Departamento("Computacion"));
        departamentos.add(new Departamento("Ciencias y Letras"));
        departamentos.add(new Departamento("Administracion de Empresas"));
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
        departamentos.get(0).agregar(new Teorica("CI1400","Fundamentos de Organizacion de Computadoras",50,1,4,"www.algo1.com"));
        departamentos.get(0).agregar(new Teorica("CI1802","Introduccion a la Programacion",50,1,4,"www.algo2.com"));
        departamentos.get(0).agregar(new Practica("CI1803","Taller de Programacion",50,1,4,"Windows xp"));
        departamentos.get(1).agregar(new Practica("CI0202","Ingles Basico",50,1,2,""));
        departamentos.get(1).agregar(new Practica("MA0101","Matematica General",50,1,3,""));
        departamentos.get(1).agregar(new Practica("CI1311","Ingles I para Computacion",50,1,2,""));
        departamentos.get(1).agregar(new Practica("CI1403","Comunicacion Tecnica",50,1,2,""));
        
        departamentos.get(0).agregar(new Teorica("CI2001","Estructura de Datos",50,2,4,"www.algo3.com"));
        departamentos.get(0).agregar(new Practica("CI2101","Programacion Orientada a Objetos",50,2,4,"Windows xp"));
        departamentos.get(0).agregar(new Teorica("CI3101","Arquitectura de Computadores",50,2,4,"www.algo4.com"));
        departamentos.get(1).agregar(new Practica("CI1312","Ingles II para Computacion",50,2,2,""));
        departamentos.get(1).agregar(new Practica("MA1404","Calculo",50,2,4,""));
        
        departamentos.get(0).agregar(new Practica("CI3002","Analisis de Algoritmos",50,3,4,"Windows xp"));
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
        departamentos.get(2).agregar(new Teorica("AE4208","Desarrollo de Emprendedores",50,7,3,"www.algo15.com"));
    }
}
