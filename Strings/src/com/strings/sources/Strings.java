package com.strings.sources;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strings {
    private static String s="";
    private static StringBuffer sb=new StringBuffer();
    private Pattern p;

    public String vocales(String cad) {
        StringBuffer s = new StringBuffer("");
        for (int i = 0; i < cad.length(); i++) {
            if (Pattern.matches("^[aeiouAEIOU].*", String.valueOf(cad.charAt(i)))) {
                s.append(cad.charAt(i));
            }
        }
        return s.toString();
    }
    @Override
    public String toString(){
        return sb.toString()+s;
    }
    public StringBuffer consonantes(int indice,StringBuffer sb){
        StringBuffer res = new StringBuffer();
        for (int i = indice; i < sb.length(); i++) {
            if (Pattern.matches("^[^aeiouAEIOU].*", String.valueOf(sb.charAt(i)))) {
                res.append(sb.charAt(i));
            }
        }
        sb.substring(indice);
        return res;
    }
    public void setSB(StringBuffer sb){
        if(sb.length()%2==0)
            this.sb=sb;
    }
    public StringBuffer getSb(){
        return sb;
    }
    public void setS(String s){
        if (Pattern.matches("^[aeiouAEIOU].*[aeiouAEIOU]$",s)){
            this.s=s;
            //System.out.println("matches!!!");        
        }
    }
    public String getS(){
        return s;
    }
    public String mix(){
        String r;
        r=s.substring(0,s.length()/2);
        r=r.concat(sb.substring(sb.length()/2,sb.length()));
        return r;
    }
    public StringBuffer cifrado(StringBuffer sb,char c){
        
        StringBuffer temp = sb;
        temp.replace(0, 1, "#");
        for (int i = 1; i < temp.length()-1; i++) {
            if(temp.charAt(i)==c)
                temp.replace(i, i+1,"@");
        }
        temp.append("#");
        return temp;
    }
    public static double numero(){
        return Math.random()*s.length();
    }
}
