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
public class Man {
    int sadness;
    int happiness;
    int anger;
    int fear;
    
    void state(){
        if(sadness>happiness)
            System.out.println("Im sad!");
        if(anger>fear)
            System.out.println("I attack!");
        else
            System.out.println("I ran!");
    }
}
