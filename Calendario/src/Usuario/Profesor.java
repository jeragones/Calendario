/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

import Asignatura.Asignatura;
import Aula.Aula;
import Horario.Dia;
import calendario.Interface;
import java.util.ArrayList;

/**
 *
 * @author GeOrge
 */
public class Profesor extends Usuario implements Interface {
    
    private String cedula;
    private ArrayList<Dia> horario = new ArrayList<>();
    private ArrayList<Asignatura> asignatura = new ArrayList<>();
    
    public Profesor(String _nombre, String _usuario, String _contrasena, String _cedula) {
        super(_nombre, _usuario, _contrasena);
        cedula = _cedula;
    }
    
    public void agregar(Dia _horario) {
        horario.add(_horario);
    }
    
    public void agregar(Asignatura _asignatura) {
        asignatura.add(_asignatura);
    }

    public String getCedula() {
        return cedula;
    }

    public ArrayList<Dia> getHorario() {
        return horario;
    }

    public ArrayList<Asignatura> getAsignatura() {
        return asignatura;
    }
}
