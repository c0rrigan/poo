/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snot_lt_delivery;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author alumno
 */
public class Asimex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Factura f = new Factura();
        f.alta();
        f.changeTipoFlete();
        f.changePiezas();
        f.mostrar();
    }
    
}
