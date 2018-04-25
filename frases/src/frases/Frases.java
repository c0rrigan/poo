/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frases;
import fuentes.Cadena;
/**
 *
 * @author Alumno
 */
public class Frases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Zbcamidefg");
        String s="fghijk lm ehr sdjf";
        Cadena cadena = new Cadena();
        cadena.setSb(sb);
        System.out.println("Sb:"+cadena.getSb());
        sb.replace(0, 1, "A");
        cadena.setSb(sb);
        System.out.println("Sb:"+cadena.getSb());
        cadena.setS(s);
        System.out.println("S:"+cadena.getS());
        s=s.concat("e");
        cadena.setS(s);
        System.out.println("S:"+cadena.getS());
        System.out.println("espacios: "+cadena.espacios(s));
        System.out.println("toString: "+cadena.toString());
        System.out.println("substring :"+cadena.substring(sb, 3));
        System.out.println("mezcla :"+cadena.mezcla());
        System.out.println("cifrado :"+cadena.cifrado(sb));
        System.out.println("raiz :"+Cadena.potencia());
    }
    
}
