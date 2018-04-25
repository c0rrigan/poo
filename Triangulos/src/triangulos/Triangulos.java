/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Triangulos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangulo tr1 = new Triangulo();
        Triangulo tr2 = new Triangulo();

        tr1.cambiarLado1(Double.valueOf(JOptionPane.showInputDialog(null, "Lado1: ", "Triangulo 1", JOptionPane.QUESTION_MESSAGE)));
        tr1.cambiarLado2(Double.valueOf(JOptionPane.showInputDialog(null, "Lado2: ", "Triangulo 1", JOptionPane.QUESTION_MESSAGE)));
        tr1.cambiarLado3(Double.valueOf(JOptionPane.showInputDialog(null, "Lado3: ", "Triangulo 1", JOptionPane.QUESTION_MESSAGE)));
        tr2.cambiarLado1(Double.valueOf(JOptionPane.showInputDialog(null, "Lado1: ", "Triangulo 2", JOptionPane.QUESTION_MESSAGE)));
        tr2.cambiarLado2(Double.valueOf(JOptionPane.showInputDialog(null, "Lado2: ", "Triangulo 2", JOptionPane.QUESTION_MESSAGE)));
        tr2.cambiarLado3(Double.valueOf(JOptionPane.showInputDialog(null, "Lado3: ", "Triangulo 2", JOptionPane.QUESTION_MESSAGE)));
        JOptionPane.showMessageDialog(null, "Perimetro tr1: " + tr1.perimetro());
        JOptionPane.showMessageDialog(null, "Area tr1: " + tr1.area());
        JOptionPane.showMessageDialog(null, "Perimetro tr2: " + tr2.perimetro());
        JOptionPane.showMessageDialog(null, "Area tr2: " + tr2.area());
        JOptionPane.showMessageDialog(null, "triangulo1=triangulo2:" + tr1.comparar(tr2));
        tr1.cambiarLado1(Double.valueOf(JOptionPane.showInputDialog(null, "Lado1: ", "Triangulo 1", JOptionPane.QUESTION_MESSAGE)));
        tr1.cambiarLado2(Double.valueOf(JOptionPane.showInputDialog(null, "Lado2: ", "Triangulo 1", JOptionPane.QUESTION_MESSAGE)));
        tr1.cambiarLado3(Double.valueOf(JOptionPane.showInputDialog(null, "Lado3: ", "Triangulo 1", JOptionPane.QUESTION_MESSAGE)));
        JOptionPane.showMessageDialog(null, "Perimetro tr1: " + tr1.perimetro());
        JOptionPane.showMessageDialog(null, "Area tr1: " + tr1.area());
        JOptionPane.showMessageDialog(null, "Perimetro tr2: " + tr2.perimetro());
        JOptionPane.showMessageDialog(null, "Area tr2: " + tr2.area());
        JOptionPane.showMessageDialog(null, "triangulo1=triangulo2:" + tr1.comparar(tr2));

        tr1.imprimir();
        tr2.imprimir();
    }

}
