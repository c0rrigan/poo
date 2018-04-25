/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.util.Scanner;
import sources.HumanBody;

/**
 *
 * @author alumno
 */
public class Main {
    public static void main(String []args){
        HumanBody hb = new HumanBody("");
        boolean cont = true;
        Scanner sc = new Scanner(System.in);
        int opc;
        while(cont){
            System.out.print("Opciones:\n1)Correr\n2)Desvelarse\n3)Dormir\n4)Salir\n");
            opc = sc.nextInt();
            switch(opc){
                case 1:
                    hb.correr();
                    break;
                case 2:
                    System.out.print("Introducir horas de desvelo:\n");
                    int horas = 0;
                    horas = sc.nextInt();
                    hb.desvelarse(horas);
                    break;
                case 3:
                    hb.dormir();
                    break;
                case 4:
                    System.exit(0);
            }
            System.out.print(hb.toString());
        }
    }
}
