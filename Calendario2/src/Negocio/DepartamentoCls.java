/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.Asignatura.Asignatura;
import Datos.Asignatura.Departamento;
import Datos.Aula.Aula;
import Datos.Horario.Dia;
import java.util.ArrayList;


/**
 *  Clase que permite administrar los departamentos
 * @author Daniel Berrocal
 * @author Jorge Rojas
 */
public class DepartamentoCls implements Interface, java.io.Serializable{
    
    private static ArrayList<Departamento> departamento = new ArrayList<>();
    ArchivoCls insArchivo = new ArchivoCls();
    
    @Override
    public void insertar(Object args) {
        departamento.add((Departamento)args);
    }
    
    @Override
    public void guardar() {
        ArrayList<Object> lista = new ArrayList<>();
        for(int i=0; i < departamento.size(); i++)
            lista.add(departamento.get(i));
        insArchivo.guardar("departamento", lista);
    }
    
    public static ArrayList<Departamento> getDepartamento() {
        return departamento;
    }
    
    public static Departamento getDepartamento(String arg) {
        for(int x=0; x < departamento.size(); x++) {
            if(departamento.get(x).getDepartamento().equals(arg))
                return departamento.get(x);
        }
        return null;
    }

    public static void setDepartamento(ArrayList<Departamento> departament) {
        departamento = departament;
    }
    
    /**
     * Metodo para buscar una asignatura
     * @param name Nombre de la asignatura
     * @return Retorna la asignatura a la que le corresponde el nombre
     */
    public static Asignatura getAsig(String name){
        for(Departamento dep:departamento){
            for(Asignatura asig :dep.getAsignatura()){
                if (asig.getNombre().equals(name) || asig.getCodigo().equals(name)){
                    return asig;
                }
            }
            
        }
        
        return null;
    }
    
    /**
     * Metodo que permite obtener la lista de dias en los que se imparte una determinada asignatura
     * @param codigo Codigo de la asignatura
     * @return Retorna la lista de dias
     */
    public static ArrayList<Dia> getHorario(String codigo) {
        for(int x=0; x < departamento.size(); x++) {
            for(int i=0; i < departamento.get(x).getAsignatura().size(); i++) {
                if(codigo.equals(departamento.get(x).getAsignatura().get(i).getCodigo()))
                    return departamento.get(x).getAsignatura().get(i).getHorario();
            }
        }
        return null;
    }
    
    
    /**
     * Metodo que permite obtener la lista de aulas en las que se imparte una determinada asignatura
     * @param codigo Codigo de la asignatura
     * @return Retorna la lista de aulas
     */
    public static ArrayList<Aula> getAula(String codigo) {
        for(int x=0; x < departamento.size(); x++) {
            for(int i=0; i < departamento.get(x).getAsignatura().size(); i++) {
                if(codigo.equals(departamento.get(x).getAsignatura().get(i).getCodigo())) {
                    return departamento.get(x).getAsignatura().get(i).getAula();
                }
            }
        }
        return null;
    }
    
    /**
     * Metodo para eliminar una asignatura
     * @param name Nombre de la asignatura que se desea eliminar
     */
    public static void deleteAsig(String name){
        for(int i=0; i<departamento.size();i++){
            String dep = departamento.get(i).getDepartamento();
            for(int j=0;j<departamento.get(i).getAsignatura().size();j++){
                String asig = departamento.get(i).getAsignatura().get(j).getNombre();
                if (departamento.get(i).getAsignatura().get(j).getNombre().equals(name)){
                    departamento.get(i).getAsignatura().remove(departamento.get(i).getAsignatura().get(j));
                }
            }
        }
    }
    
    /**
     * Metodo que obtiene el departamento al que pertenece una determinada asignatura
     * @param asig Asignatura de la que se desea conocer el departamento
     * @return Departamento
     */
    public static Departamento getDepartamentoporAsignatura(String asig){
        for(Departamento dep:departamento){
            for(Asignatura asigna :dep.getAsignatura()){
                if (asigna.getNombre().equals(asig)){
                    return dep;
                }
            }
            
        }
        
        return null;
    }
    
    
}
