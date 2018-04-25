/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintv;

/**
 *
 * @author Alumno
 */
public class MainTv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TV t1 = new TV();
        t1.subirvol();
        System.out.println(t1.volumen);
        t1.bajarvol();
        System.out.println(t1.volumen);
    }
    
}
