/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaauto;

/**
 *
 * @author Alumno
 */
public class AgenciaAuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto a1 = new Auto();
        System.out.println("Color: "+a1.color);
        a1.cambiarColor("Amarillo");
        System.out.println("Color:"+a1.color);
    }
    
}
