/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundomillonarios;

/**
 *
 * @author Alumno
 */
public class Millonario {
    private double total;
    private double efectivo;
    private int propiedades;
    private double dineroProp;
    
    Millonario(){
        efectivo=1e7;
        propiedades=1;
        dineroProp=5e6;
        total=efectivo+dineroProp;
    }
    void abonar(double cantidad){
        total+=cantidad;
        efectivo+=cantidad;
    }
    void retirar(double cantidad){
        total-=cantidad;
        efectivo-=cantidad;
        if(total<2e6)
            System.out.println("YA NO ERES MILLONARIO");
    }
    void agregar(){
        propiedades+=1;
        dineroProp+=5e6;
        total+=5e6;
    }
    void perderProp(){
        propiedades-=1;
        dineroProp-=5e6;
        total-=5e6;
        if(propiedades<2)
            System.out.println("YA NO VENDA MÁS PROPIEDADES.EL NÚMERO DE PROPIEDADES NUNCA DEBERÁ SER MENOR A 1");
    }
    void print(){
        System.out.printf("Total:%.2f\n",total);
        System.out.printf("Dinero en efectivo:%.2f\n",efectivo);
        System.out.printf("Número de propiedades:%d\n",propiedades);
        System.out.printf("Dinero en propiedades:%.2f\n",dineroProp); 
    }
    
}
