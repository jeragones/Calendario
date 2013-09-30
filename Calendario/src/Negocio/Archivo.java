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
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import javax.swing.JFileChooser;

/**
 *
 * @author GeOrge
 */
public class Archivo {
    
    public void cargarArchivo() {
        try {
            /*JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File f = chooser.getSelectedFile();
            String filename = f.getAbsolutePath();*/
            //C:\Users\GeOrge\Documents\GitHub\Calendario\Calendario\src\Datos\Archivos
            //C:\Users\GeOrge\Documents\GitHub\Calendario\Calendario\src\Negocio
            /*JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File f = chooser.getSelectedFile();
            String filename = f.getAbsolutePath();*/
            Aulas insAula = new Aulas();
            Departamentos insDepartamento = new Departamentos();
            Usuarios insUsuario = new Usuarios();
            String[] direcciones = new String[] {"aulas","departamentos","asignaturas","usuarios"};
            for(int x=0; x < direcciones.length; x++) {
                int cont = 1;
                String path = new File(".").getAbsolutePath();
                path = path.substring(0, path.length()-1)+"src\\Datos\\Archivos\\"+direcciones[x]+".txt";
                FileInputStream fstream = new FileInputStream(path);
                try (DataInputStream entrada = new DataInputStream(fstream)) {
                    BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
                    String strLinea;
                    while ((strLinea = buffer.readLine()) != null)   {
                        String[] linea = strLinea.split("@");
                        switch(direcciones[x]) {
                            case "aulas":
                                if(linea[0].equals("A"))
                                    insAula.insertar(new Clase(linea[1], Integer.valueOf(linea[2]), linea[3], Integer.valueOf(linea[4]), Boolean.valueOf(linea[5])));
                                else if(linea[0].equals("L"))
                                    insAula.insertar(new Laboratorio(linea[1], Integer.parseInt(linea[2]),linea[3], Integer.parseInt(linea[4])));
                                break;
                            case "departamentos":
                                insDepartamento.insertar(new Departamento(linea[0]));
                                break;
                            case "usuarios":
                                if(linea[0].equals(">"))
                                    cont++;
                                switch(cont) {
                                    case 1:
                                        Usuario usuario = null;
                                        if(linea[0].equals("P")) {
                                            usuario = new Profesor(linea[2], linea[3], linea[4], linea[5]);
                                            insDepartamento.getDepartamento(linea[1]).agregar((Profesor)usuario);
                                        } else if(linea[0].equals("C"))
                                            usuario = new Coordinador(linea[1], linea[2], linea[3]);
                                        else if(linea[0].equals("E"))
                                            usuario = new Estudiante(linea[1], linea[2], linea[3], linea[4]);
                                        if(usuario != null)
                                            insUsuario.insertar(usuario);
                                        break;
                                    case 2:
                                        for(int i=0; i < Usuarios.getUsuario().size(); i++) {
                                            if(Usuarios.getUsuario().get(i).getUsuario().equals(linea[0])) {
                                                Dia dia = new Dia(linea[1]);
                                                dia.agregar(new Horario(linea[2],linea[3]));
                                                ((Profesor)Usuarios.getUsuario().get(i)).agregar(dia);
                                            }
                                        }
                                        break;
                                    case 3:
                                        for(int i=0; i < Usuarios.getUsuario().size(); i++) {
                                            if(Usuarios.getUsuario().get(i).getUsuario().equals(linea[0])) {
                                                for(int j=1; j < linea.length; j++) {
                                                    for(int n=0; n < Asignaturas.getAsignatura().size(); n++) {
                                                        if(Asignaturas.getAsignatura().get(n).getCodigo().equals(linea[j]))
                                                            ((Profesor)Usuarios.getUsuario().get(i)).agregar(Asignaturas.getAsignatura().get(n));
                                                    }
                                                }
                                            }
                                        }
                                }
                                break;
                            case "asignaturas":
                                Asignatura curso = null;
                                if(linea[0].equals("T"))
                                    curso = new Teorica(linea[1], linea[2], Integer.parseInt(linea[3]), Integer.parseInt(linea[4]), Integer.parseInt(linea[5]), linea[6]);
                                else if(linea[0].equals("P"))
                                    curso = new  Practica(linea[1], linea[2], Integer.parseInt(linea[3]), Integer.parseInt(linea[4]), Integer.parseInt(linea[5]), linea[6]);
                                if(curso != null) {
                                    String codigo = "";
                                    for(int i=0; i < linea[1].length(); i++) {
                                        try {
                                            Integer.parseInt(String.valueOf(linea[1].charAt(i)));
                                            break;
                                        } catch(Exception e) {
                                            codigo += linea[1].charAt(i);
                                        }
                                    }
                                    switch(codigo) {
                                        case "CI":
                                            insDepartamento.getDepartamento("Computacion").agregar(curso);
                                            break;
                                        case "AE":
                                            insDepartamento.getDepartamento("Administracion de Empresas").agregar(curso);
                                            break;
                                        case "CS":
                                            insDepartamento.getDepartamento("Ciencias y Letras").agregar(curso);
                                            break;
                                        case "MA":
                                            insDepartamento.getDepartamento("Ciencias y Letras").agregar(curso);
                                    }
                                }
                        }
                        
                    }
                } catch(Exception e){}
            }
        } catch(Exception e) {}
    }
}
