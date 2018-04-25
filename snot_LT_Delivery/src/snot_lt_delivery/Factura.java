/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snot_lt_delivery;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */

public class Factura {
        private String TIPO_ENVIO[]={"Local","Foraneo"};
    private String numref;
       private static int Contador;
       private int numReq;
       private static String Direccion = "Mario Pani 177,Santa Fe,CDMX";
       private String fecha;
       private short cantPzs;
       private short numCajas;
       private String tipo;
       private String dirDest;
       private String estado;
       private float total;
       private String dest;
       Factura(){
           this.Contador++;
           this.numReq=this.Contador;
           SimpleDateFormat f = new SimpleDateFormat();
           fecha=f.format(new Date());
           //Calcular el número de caja en función del número de piezas
           //alta():captura los datos de los campos
        }
       public void changeFecha(String address){
           this.fecha=address;
       }
       public void changePiezas(){
           cantPzs=Short.valueOf(JOptionPane.showInputDialog(null, "Introduzca Número de Piezas", "Número de piezas", JOptionPane.INFORMATION_MESSAGE));
           calcularTotal();
       }
       public void changePiezas(short piezas){
           this.cantPzs=piezas;
       }
       public float totalFactura(){
           return this.total;
       }
       @Override
       public String toString(){
           return "Número de Referencia:"+this.numref+"\nNúmero de Requisición: "+this.numReq+"\nFecha: "+this.fecha
                   +"\nPiezas: "+this.cantPzs+"\nCajas: "+this.numCajas+"\nTipo de Envío: "+this.tipo+"\nEstado de la Rep.: "+this.estado
                   +"\nDireccion: "+this.dirDest+"\nDestinatario: "+this.dest+"\nTotal: "+this.total+" USD";
       }
       void changeNumRef(String numRef){
           this.numref=numRef;
       }
       void changeNumReq(short numReq){
           this.numReq=numReq;
       }
       void changeDestinantario(String destinatario){
           this.dirDest=destinatario;
       }
       void changeEstadoRep(String estadoRep){
           this.estado=estadoRep;
       }
       void changeEstadoRep(){
           estado=String.valueOf(JOptionPane.showInputDialog(null, "Estado del destino del envío:", "Destino de Envío",JOptionPane.INFORMATION_MESSAGE));
       }
       void changeTipoFlete(String tipo){
           this.tipo=tipo;
           calcularTotal();
       }
       void changeTipoFlete(){
           tipo=String.valueOf(JOptionPane.showInputDialog(null, "Tipo de Envío", "Tipo de Envío", JOptionPane.INFORMATION_MESSAGE, null,TIPO_ENVIO,TIPO_ENVIO[0]));
           if(tipo.equals(TIPO_ENVIO[1])){
            estado=String.valueOf(JOptionPane.showInputDialog(null, "Estado del destino del envío:", "Destino de Envío",JOptionPane.INFORMATION_MESSAGE));   
           }else{
               estado="CDMX";
           }
           dirDest=String.valueOf(JOptionPane.showInputDialog(null, "Direccion de Envío:", "Destino de Envío",JOptionPane.INFORMATION_MESSAGE));
           calcularTotal();
       }
       public void alta(){
           numref=String.valueOf(JOptionPane.showInputDialog(null, "Ingresar número de referencia", "Número de referencia", JOptionPane.INFORMATION_MESSAGE));
           tipo=String.valueOf(JOptionPane.showInputDialog(null, "Tipo de Envío", "Tipo de Envío", JOptionPane.INFORMATION_MESSAGE, null,TIPO_ENVIO,TIPO_ENVIO[0]));
           if(tipo.equals(TIPO_ENVIO[1]))
            estado=String.valueOf(JOptionPane.showInputDialog(null, "Estado del destino del envío:", "Destino de Envío",JOptionPane.INFORMATION_MESSAGE));
           else
               estado="CDMX";
           dirDest=String.valueOf(JOptionPane.showInputDialog(null, "Direccion de Envío:", "Destino de Envío",JOptionPane.INFORMATION_MESSAGE));
           dest=String.valueOf(JOptionPane.showInputDialog(null, "Destinatario:", "Destinatario",JOptionPane.INFORMATION_MESSAGE));
           cantPzs=Short.valueOf(JOptionPane.showInputDialog(null, "Introduzca Número de Piezas", "Número de piezas", JOptionPane.INFORMATION_MESSAGE));
           calcularTotal();
           JOptionPane.showMessageDialog(null, toString(), "Sumario", JOptionPane.INFORMATION_MESSAGE);
       }
       public void mostrar(){
            JOptionPane.showMessageDialog(null, toString(), "Sumario", JOptionPane.INFORMATION_MESSAGE);
       }
       void calcularTotal(){
           numCajas=(short)((cantPzs-cantPzs%20)/20);
           numCajas+=(cantPzs%20>0)?1:0;
           total=numCajas;
           total*=(tipo.equals(TIPO_ENVIO[0]))?25:35;
       }
}
