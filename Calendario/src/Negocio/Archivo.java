/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.Asignatura.Departamento;
import Datos.Aula.Aula;
import Datos.Aula.Clase;
import Datos.Aula.Laboratorio;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
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
            String[] direcciones = new String[] {"aulas","departamentos","usuarios","asignaturas"};
            for(int x=0; x < direcciones.length; x++) {
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
                                else
                                    insAula.insertar(new Laboratorio(linea[1], Integer.parseInt(linea[2]),linea[3], Integer.parseInt(linea[4])));
                                break;
                            case "departamentos":
                                insDepartamento.insertar(new Departamento(linea[0]));
                                break;
                            case "usuarios":
                                break;
                            case "asignaturas":
                                break;
                        }
                        
                    }
                } catch(Exception e){}
            }
        } catch(Exception e) {}
    }
}
