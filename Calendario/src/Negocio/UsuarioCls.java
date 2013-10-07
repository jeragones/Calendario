/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.Usuario.Usuario;
import java.util.ArrayList;

/**
 *
 * @author GeOrge
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

    
}
