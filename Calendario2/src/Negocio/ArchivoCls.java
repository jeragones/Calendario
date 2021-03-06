/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.Asignatura.Departamento;
import Datos.Aula.Aula;
import Datos.Usuario.Usuario;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


/**
 * Esta clase permite administrar las actividades del sistema con los archivos
 * @author Daniel Berrocal
 * @author Jorge Rojas
 */
public class ArchivoCls {
    
    /**
     * Metodo para guardar
     * @param nombre Nombre del archivo en el que desea guardar
     * @param lista Lista de objetos que seran guardados
     */
    public void guardar(String nombre, ArrayList<Object> lista) {
        String path = new File(".").getAbsolutePath();
        path = path.substring(0, path.length()-1) + "src\\Datos\\Archivos\\"+nombre+".obj";
        
        File tmp = new File(path);    
        if (tmp.exists())
            tmp.delete();
        ObjectOutputStream objeto = null;
        FileOutputStream archivo = null;
        
        try {
            archivo = new FileOutputStream(path, true);
            objeto = new ObjectOutputStream(archivo);
            objeto.writeObject(lista);
        } catch (Exception ex) {
            System.err.println(ex.getMessage()); 
        } finally {
            if(objeto != null) {
                try {
                    objeto.close();
                } catch (IOException ex) {
                    ex.getMessage();
                }
            } 
        }
    }
    
    /**
     * Metodo que obtiene la informacion de un archivo y la carga en las diferentes estructuras de datos
     * @param nombre Nombre del archivo del que se desea obtener la informacion
     */
    protected void cargar(String nombre) {
        String path = new File(".").getAbsolutePath();
        path = path.substring(0, path.length()-1) + "src\\Datos\\Archivos\\" + nombre + ".obj";
        
        File tmp = new File(path);    
        if (!tmp.exists())
            System.err.println("No existe: " + path);
        else {  
            ObjectInputStream objeto = null;
            FileInputStream archivo = null;

            try {
                archivo = new FileInputStream(path);
                objeto = new ObjectInputStream(archivo);
                
                switch(nombre) {
                case "aula":
                    AulaCls.setAula((ArrayList<Aula>)objeto.readObject());
                    break;
                /*case "asignatura":
                    insAsignatura.setAsignatura((ArrayList<Asignatura>)objeto.readObject());
                    break;*/
                case "departamento":
                    DepartamentoCls.setDepartamento((ArrayList<Departamento>)objeto.readObject());
                    break;
                case "usuario":
                    UsuarioCls.setUsuario((ArrayList<Usuario>)objeto.readObject());
                }
                
            } catch (Exception ex) {
                ex.getMessage();
            } finally {
                if(objeto != null) {
                    try {
                        objeto.close();
                    } catch (IOException ex) {
                        ex.getMessage();
                    }
                } 
            }
        }
    }
    
    /**
     * Metodo que obtiene la informacion de todos los archivos por medio de 3 llamadas al metodo protegido de cargar
     */
    public void cargar() {
        cargar("aula");
        cargar("departamento");
        cargar("usuario");
    }
}
