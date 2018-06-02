/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author alumno
 */
public class SuperHero extends Hero implements Ideology{

    /**
     * @return the superNaturalPowers
     */
    public ArrayList<String> getSuperNaturalPowers() {
        return superNaturalPowers;
    }

    /**
     * @param superNaturalPowers the superNaturalPowers to set
     */
    public void setSuperNaturalPowers(List<String> superNaturalPowers) {
        this.superNaturalPowers = new ArrayList<String>(superNaturalPowers);
    }
    private ArrayList<String> superNaturalPowers;

    public SuperHero(){
        super();
        superNaturalPowers = new ArrayList<>();
    }
    
    public SuperHero(String name, String origin, String secretIdentity, String CostumeColors) {
        super(name, origin, secretIdentity, CostumeColors);
        superNaturalPowers = new ArrayList<>();
    }

    @Override
    public String toString() {
        return super.toString()+"\nPoderes Supernaturales:"+getSuperNaturalPowers().toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String attacks() {
        return this.getName()+" esta atacando";
    }

    @Override
    public String defends() {
        return this.getName()+" se defiende";
    }

    @Override
    public String smile() {
        return this.getName()+" sonrie :)";
    }

    @Override
    public String showIdealAndMore() {
        return ideal.toUpperCase()+"\n"+this.toString();
    }
    
}
