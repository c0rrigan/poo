/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuentes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Alumno
 */
public class Cadena {
    private static String s;
    private static StringBuffer sb;
    private Matcher m;
    private Pattern p;
    Cadena(){
        p=Pattern.compile("^[aeiouAEIOU]");
    }
    public int espacios(String cad){
        int sp=0;
        for(int i=0;i<cad.length();i++)
            if(cad.charAt(i)==' ')
                sp++;
        return sp;
    }
    @Override
    public String toString(){
        return s+"-"+sb.toString();
    }
    public StringBuffer substring(StringBuffer sb,int limite){
        return new StringBuffer().append(sb.substring(0, limite));
    }
    public void setSb(StringBuffer sb){
        //si sb[0] es vocal
        char c = sb.charAt(0);
        c+=(c>=65&&c<=90)?32:0;    
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            Cadena.sb=sb;
        }else{
            Cadena.sb=new StringBuffer();
        }
    }
    public void setS(String s){
        char c = s.charAt(s.length()-1);
        c+=(c>=65&&c<=90)?32:0;
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            Cadena.s=s;
        }else{
            Cadena.s="ANY";
        }
    }
    public StringBuffer getSb(){
        return new StringBuffer(sb.toString().toUpperCase());
    }
    public String getS(){
        return s.toUpperCase();
    }
    public String mezcla(){
        String r;
        r=sb.substring(0,sb.length()/2);
        r=r.concat(s.substring(s.length()/2,s.length()-1));
        return r;
    }
    public String cifrado(StringBuffer sb){
        String temp="$";
        for(int i=0;i<sb.length();i++){
            char c=sb.charAt(i);
            c+=(c>=65&&c<=90)?32:0;
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                sb.replace(i, i+1, "@");
            }
        }
        temp=temp.concat(sb.toString());
        temp=temp.concat("$");
        return temp;
    }
    public static double potencia(){
        return Math.cbrt(sb.length()+s.length());
    }
    
}
