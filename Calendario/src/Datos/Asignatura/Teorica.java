/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.Asignatura;

/**
 * Asignatura Practica
 * @author Daniel Berrocal
 * @author Jorge Rojas
 */
public class Teorica extends Asignatura {
    
    private String pagina;
    
    /**
     * Constructor de la asignatura teorica
     * @param _codigo Codigo del la asignatura
     * @param _nombre Nombre de la asignatura
     * @param _grupo Grupo
     * @param _semestre Semestre al que pertenece la asignatura
     * @param _creditos Numero de creditos de la asignatura
     * @param _pagina Pagina web de la asignatura teorica
     */
    public Teorica(String _codigo, String _nombre, int _grupo, int _semestre, int _creditos, String _pagina) {
        super(_codigo, _nombre, _grupo, _semestre, _creditos);
        pagina = _pagina;
    }

    /**
     * Metodo que obtiene la pagina web perteneciente a la asignatura teorica
     * @return 
     */
    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }
    
}
