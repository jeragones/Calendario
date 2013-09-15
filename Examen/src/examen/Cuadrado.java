/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author GeOrge
 */
public class Cuadrado extends Poligono {
    public Cuadrado(int l) {
        super(l);
    }

    public double getArea() {
        return(lados * lados);
    }

    
    public int getLados() {
        return(lados);
    }

    public String nombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
