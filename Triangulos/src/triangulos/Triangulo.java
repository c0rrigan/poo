/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulos;

import static java.lang.Math.sqrt;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    private String tipo;
    Triangulo(){
        lado1=5;
        lado2=5;
        lado3=5;
        tipo="Equilatero";
    }
    void cambiarLado1(double nuevoValor){
        lado1=nuevoValor;
        tipo=tipoTriangulo(lado1,lado2,lado3);
    }
    void cambiarLado2(double nuevoValor){
        lado2=nuevoValor;
        tipo=tipoTriangulo(lado1,lado2,lado3);
    }
    void cambiarLado3(double nuevoValor){
        lado3=nuevoValor;
        tipo=tipoTriangulo(lado1,lado2,lado3);
    }
    double perimetro(){
        return lado1+lado2+lado3;
    }
    double area(){
        if(tipo.equals("Escaleno")){
            return 0;
        }
        double s,area=0;
        s=(lado1+lado2+lado3)/2;
        area=sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
        return area;
    }
    double sumaArea(Triangulo t2){
        return area()+t2.area();
    }
    void imprimir(){
        JOptionPane.showMessageDialog(null,"Tipo:"+tipo.toUpperCase()+"\nLado1: "+lado1+"\nLado2: "+lado2+"\nLado3: "+lado3,"Información del Triangulo",JOptionPane.INFORMATION_MESSAGE);
    }
    boolean comparar(Triangulo t2){
        return (lado1==t2.lado1&&lado2==t2.lado2&&lado3==t2.lado3)?true:false;
    }
    private String tipoTriangulo(double lado1, double lado2, double lado3){
        String tipo="";
        if(lado1!=lado2){
            if(lado1==lado3||lado2==lado3){
                tipo="Isoceles";
            }
            else{
                tipo="Escaleno";
            }
                
        }else{
            if(lado3==lado1){
                tipo="Equilatero";
            }else{
                tipo="Isoceles";
            }
        }
        return tipo;
    }
}
