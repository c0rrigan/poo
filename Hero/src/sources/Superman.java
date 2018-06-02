/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sources;

/**
 *
 * @author deckard
 */
public class Superman extends SuperHero{
    String objs[] = {"ladrón","gato","arma nuclear"};
    
    public Superman(){
        super();
    }
    
    public Superman(String name, String origin, String secretIdentity, String CostumeColors) {
        super(name, origin, secretIdentity, CostumeColors);
    }
    
    public String fly(int mts){
        return this.getName()+" esta volando a "+mts+"m de altura";
    }
    public String seeThrough(){
        return this.getName()+" ve un "+objs[Math.round(((float)Math.random()*objs.length-1))];
    }
}
