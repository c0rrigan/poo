/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sources;

/**
 *
 * @author alumno
 */
public interface Interface2 extends Interface1{
    double euler = Math.E;
    String despido = "Hasta luego";
    String despedir();
    String despedir(String nombre);
    String despedirFormal(String nombre);
    default int numero(){
        return Math.round((float)Math.random()*100);
    }
}
