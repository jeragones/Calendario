/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

import java.util.List;

/**
 *
 * @author GeOrge
 */
public class Profesor extends Usuario {
    
    private String cedula;
    //private Departamento departamento;
    //private List<Dia> horario;
    
    public Profesor(String _nombre, String _usuario, String _contrasena, String _cedula) {
        super(_nombre, _usuario, _contrasena);
        cedula = _cedula;
    }
}
