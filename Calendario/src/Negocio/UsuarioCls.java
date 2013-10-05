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
    
    @Override
    public void insertar(Object args) {
        usuario.add((Usuario)args);
    }

    public ArrayList<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(ArrayList<Usuario> usuario) {
        UsuarioCls.usuario = usuario;
    }
}
