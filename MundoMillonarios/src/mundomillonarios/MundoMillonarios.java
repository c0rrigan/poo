/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundomillonarios;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class MundoMillonarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Millonario millonario1 = new Millonario();
        Scanner sc = new Scanner(System.in);
        int cont=1;
        int op=-1;
        do{
            System.out.println("Estado actual\n");
            millonario1.print();
            System.out.println("Seleccione operación:\n\t1)Abonar\n\t2)Retirar\n\t3)Agregar propiedad\n\t4)Vender propiedad\n\t5)Salir");
            op=sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Abonar:\n");
                    millonario1.abonar(sc.nextDouble());
                    break;
                case 2:
                    System.out.println("Retirar:\n");
                    millonario1.retirar(sc.nextDouble());
                    break;
                case 3:
                    System.out.println("Agregar propiedad:\n");
                    millonario1.agregar();
                    break;
                case 4:
                    System.out.println("Vender propiedad:\n");
                    millonario1.perderProp();
                    break;
                case 5:
                    System.out.println("Salir");
                    cont=0;
                    break;
                default:
                    throw new AssertionError();
            }
        }while(cont>0);
    }
    
}
