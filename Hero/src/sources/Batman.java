/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sources;

import java.util.Arrays;

/**
 *
 * @author deckard
 */
public class Batman extends SuperHero{
    
    public Batman(){
        super();
    }
    
    public Batman(String name, String origin, String secretIdentity, String CostumeColors) {
        super(name, origin, secretIdentity, CostumeColors);
    }
    public String callAlfred(){
        return "Que se le ofrece Sr. "+this.getName();
    }
    public String callBatmobile(){
        return Arrays.asList(this.getNaturalPowerList()).contains(new String("Tiene Batimóvil"))?"Va en camino":"No disponible";
    }
}
