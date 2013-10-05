/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.Asignatura.Asignatura;
import Datos.Asignatura.Departamento;
import Datos.Asignatura.Practica;
import Datos.Asignatura.Teorica;
import Datos.Aula.Aula;
import Datos.Aula.Clase;
import Datos.Aula.Laboratorio;
import Datos.Horario.Dia;
import Datos.Horario.Horario;
import Datos.Usuario.Coordinador;
import Datos.Usuario.Estudiante;
import Datos.Usuario.Profesor;
import Datos.Usuario.Usuario;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author GeOrge
 */
public class ArchivoCls {
    
    private AulaCls insAula = new AulaCls();
    private AsignaturaCls insAsignatura = new AsignaturaCls();
    private DepartamentoCls insDepartamento = new DepartamentoCls();
    private UsuarioCls insUsuario = new UsuarioCls();
    
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
                    insAula.setAula((ArrayList<Aula>)objeto.readObject());
                    break;
                case "asignatura":
                    insAsignatura.setAsignatura((ArrayList<Asignatura>)objeto.readObject());
                    break;
                case "departamento":
                    insDepartamento.setDepartamento((ArrayList<Departamento>)objeto.readObject());
                    break;
                case "usuario":
                    insUsuario.setUsuario((ArrayList<Usuario>)objeto.readObject());
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
