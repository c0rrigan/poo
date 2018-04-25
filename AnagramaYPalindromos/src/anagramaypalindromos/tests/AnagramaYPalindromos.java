/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagramaypalindromos.tests;

import anagramaypalindromos.sources.Anagrama;

/**
 *
 * @author alumno
 */
public class AnagramaYPalindromos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Anagrama a = new Anagrama("amor");
        System.out.println("anagrama: "+a.anagrama("roma"));
        a.setBuild("ana");
        System.out.println("palindromo "+a.palindromo());
        a.setBuild("Holanda");
        System.out.println("toString: "+a.toString());
        System.out.println("Procesa : "+a.procesa(3));
        
    }
    
}
