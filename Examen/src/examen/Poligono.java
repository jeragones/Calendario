/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author GeOrge
 */
public abstract class Poligono implements Interface {
    
    protected int lados;
    protected String nombre;
    
    public Poligono(int l) {
        lados = l;
    }
    
    public abstract double getArea();
    public abstract int getLados();
    public abstract String getNombre();
}
