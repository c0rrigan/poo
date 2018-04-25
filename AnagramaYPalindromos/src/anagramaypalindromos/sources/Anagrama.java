/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagramaypalindromos.sources;

/**
 *
 * @author alumno
 */
public class Anagrama {

    private StringBuilder sbui;

    public Anagrama(String s) {
        this.sbui = new StringBuilder(s);
    }

    public boolean anagrama(String a) {
        if (a.length() == sbui.length()) {
            StringBuilder temp = new StringBuilder(sbui);
            for (int i = 0; i < a.length(); i++) {
                temp.deleteCharAt(temp.indexOf(String.valueOf(a.charAt(i))));
            }
            return temp.length() == 0;
        }
        return false;
    }

    public boolean palindromo() {
        StringBuilder temp = new StringBuilder(sbui.toString());
        temp.deleteCharAt(0);
        temp.deleteCharAt(temp.length() - 1);
        return sbui.substring(1, sbui.length() - 1).equals(temp.toString());
    }

    public void setBuild(String s) {
        this.sbui = new StringBuilder(s);
    }

    public String toString() {
        StringBuilder temp = new StringBuilder(sbui);
        return temp.reverse().toString().toUpperCase();
    }

    public String procesa(int n) {
        String res = "";
        StringBuffer out = new StringBuffer(sbui.toString().trim());
        for (int i = 0; i < 10; i++) {
            out.append(String.valueOf((char) Math.round(Math.random() * 255)));
        }
        for (int i = 0; i < n; i++) {
            res +=out.toString()+"@";
        }
        return res;
    }

}
