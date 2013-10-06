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
 *
 * @author GeOrge
 */
public class ArchivoCls {
    
    /*private AulaCls insAula = new AulaCls();
    private AsignaturaCls insAsignatura = new AsignaturaCls();
    private DepartamentoCls insDepartamento = new DepartamentoCls();
    private UsuarioCls insUsuario = new UsuarioCls();*/
    
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
    
    public void cargar(String nombre) {
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
}
