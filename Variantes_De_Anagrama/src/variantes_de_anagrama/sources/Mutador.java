/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variantes_de_anagrama.sources;

public class Mutador {
    private StringBuilder sbui = new StringBuilder();;
    
    public Mutador(String s){
        if(s.length()<10)
            sbui.append(s);
        else
            sbui.append(s.substring(0, 10));
    }
    public boolean cuasiAnagrama(String s){
        return esAnagrama(s.substring(0,s.length()/2));
    }
    public 
    boolean esAnagrama(String a){
        //Eliminar espacios;
        //Iterar a e ir eliminando los caracteres de b, si la longitud de b no es 0, enntonces no es
        if(a.length()==sbui.length()){
        StringBuilder temp = new StringBuilder(sbui);
        for (int i = 0; i < a.length(); i++) {
            temp.deleteCharAt(temp.indexOf(String.valueOf(a.charAt(i))));
        }
        return temp.length()==0;
        }
        return false;
    }
    public boolean cuasiPanlindromo(){
        StringBuilder temp=new StringBuilder(sbui.toString());
        temp.deleteCharAt(0);
        temp.deleteCharAt(temp.length()-1);
        return sbui.substring(1,sbui.length()-1).equals(temp.toString());
    }
    public void setSBui(String s){
        this.sbui=new StringBuilder(s.toLowerCase());
    }
    public StringBuilder getSbui(){
        return new StringBuilder(sbui.toString().toLowerCase());
    }
    @Override
    public String toString(){
        return sbui.toString();
    }
    public String transforma(int n){
        String res="";
        StringBuffer out=new StringBuffer(sbui.toString().trim());
        out.append(String.valueOf((char)Math.round(Math.random()*255)));
        out.append(String.valueOf((char)Math.round(Math.random()*255)));
        for (int i = 0; i < n; i++) {
            res+=out.toString();
        }
        return res;
    }
}
