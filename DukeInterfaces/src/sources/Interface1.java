/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sources;

import java.util.Calendar;

/**
 *
 * @author alumno
 */
public interface Interface1 {
     double pi = Math.PI;
    String saludo = "Hola";
    String saludar();
    String saludar(String nombre);
    String saludarFormal(String nombre);
    default String fecha(){
        return Calendar.getInstance().getTime().toString();
    }
}
