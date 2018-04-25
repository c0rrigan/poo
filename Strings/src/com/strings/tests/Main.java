package com.strings.tests;

import com.strings.sources.Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Strings s= new Strings();
        String cadena="Acabado";
        StringBuffer sbcadena=new StringBuffer("Terminando");
        System.out.println(s.vocales(cadena));
        System.out.println(s.consonantes(2, new StringBuffer(cadena)));
        System.out.println("Longitud de StringBuffer:"+sbcadena.length());
        s.setSB(sbcadena);
        System.out.println("Sb: "+s.getSb());
        System.out.println("Longitud de String:"+cadena.length());
        s.setS(cadena);
        System.out.println("S:"+s.getS());
        JOptionPane.showMessageDialog(null, s.toString(), "ToString", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("Mix: "+s.mix());
        System.out.println("Cifrado: "+s.cifrado(sbcadena, 'n'));
    }
}
