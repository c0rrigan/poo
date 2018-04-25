/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variantes_de_anagrama.tests;

import variantes_de_anagrama.sources.Mutador;

/**
 *
 * @author Alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mutador m = new Mutador("aanaa");
        System.out.println("Cuasipalindromo:"+m.cuasiPanlindromo());
        m.setSBui("amor");
        System.out.println(m.getSbui());
        System.out.println("Cuasianagrama: "+m.cuasiAnagrama("romahola"));
        System.out.println("ToString:"+m.toString());
        System.out.println("Transforma:"+m.transforma(2));
    }
    
}
