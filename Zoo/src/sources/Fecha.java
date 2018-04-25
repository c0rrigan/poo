/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sources;

/**
 *
 * @author Alumno
 */
public class Fecha {
        String año;
        String dia;
        String mes;

        @Override
        public String toString() {
            return dia+"/"+mes+"/"+año; //To change body of generated methods, choose Tools | Templates.
        }
        public Fecha(String dia, String mes,String año) {
            this.año = año;
            this.dia = dia;
            this.mes = mes;
        }
}
