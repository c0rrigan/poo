/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sources;

/**
 *
 * @author Alumno
 */
public interface Volador {
    public double GRAVEDAD = 9.81;
    
    public String despegar();
    public String volar();
    public String aterrizar();
}
