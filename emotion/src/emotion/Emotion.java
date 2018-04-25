/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emotion;

/**
 *
 * @author Alumno
 */
public class Emotion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Man m1,m2 ;
        m1=new Man();
        m1.sadness=30;
        m1.happiness=20;
        m1.anger=90;
        m1.fear=25;
        m2=new Man();
        m2.fear=10;
        m1.state();
        //m2.state();
    }
    
}
