/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.Asignatura.Asignatura;
import Datos.Usuario.Profesor;
import Datos.Usuario.Usuario;
import java.util.ArrayList;


/**
 *
 * @author Daniel Berrocal
 * @author Jorge Rojas
 */
public class UsuarioCls implements Interface{

    private static ArrayList<Usuario> usuario = new ArrayList<>();
    ArchivoCls insArchivo = new ArchivoCls();
    
    @Override
    public void insertar(Object args) {
        usuario.add((Usuario)args);
    }

    @Override
    public void guardar() {
        ArrayList<Object> lista = new ArrayList<>();
        for(int i=0; i < usuario.size(); i++)
            lista.add(usuario.get(i));
        insArchivo.guardar("usuario", lista);
    }
    
    public static ArrayList<Usuario> getUsuario() {
        return usuario;
    }

    public static void setUsuario(ArrayList<Usuario> usuario) {
        UsuarioCls.usuario = usuario;
    }

    public static Usuario getUser(String name){
        for(Usuario user:usuario){
            if (user.getNombre().equals(name)){
                return user;
            }
        }
        return null;
    }
    public static void deleteUser(String name){
        for(int i=0; i<usuario.size();i++){
            if (usuario.get(i).getNombre().equals(name)){
                usuario.remove(usuario.get(i));
            }
        }
    }
    
    public static Profesor getProfesorporAsignatura(String asig){
        for(Usuario Prof:usuario){
            String p=Prof.getNombre();
            if (Prof instanceof Profesor){
                Profesor profe = (Profesor)Prof;
                for(Asignatura asigna:profe.getAsignatura()){
                    String a=asigna.getNombre();
                    if (asigna.getNombre().equals(asig)){
                        return profe;
                    }                   
                }                
            }            
        }
       return null;
    }
}
