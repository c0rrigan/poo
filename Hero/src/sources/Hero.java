/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sources;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author alumno
 */
public abstract class Hero  {

    /**
     * @return the origin
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * @param origin the origin to set
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * @return the secretIdentity
     */
    public String getSecretIdentity() {
        return secretIdentity;
    }

    /**
     * @param secretIdentity the secretIdentity to set
     */
    public void setSecretIdentity(String secretIdentity) {
        this.secretIdentity = secretIdentity;
    }

    /**
     * @return the CostumeColors
     */
    public String getCostumeColors() {
        return CostumeColors;
    }

    /**
     * @param CostumeColors the CostumeColors to set
     */
    public void setCostumeColors(String CostumeColors) {
        this.CostumeColors = CostumeColors;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the naturalPowerList
     */
    public String[] getNaturalPowerList() {
        return naturalPowerList;
    }

    /**
     * @param naturalPowerList the naturalPowerList to set
     */
    public void setNaturalPowerList(String[] naturalPowerList){
        this.naturalPowerList = naturalPowerList;
    }
    private String name;
    private String origin;
    private String[] naturalPowerList;
    private String secretIdentity;
    private String CostumeColors;

    public Hero(){
        naturalPowerList = new String[10];
    }
    
    public Hero(String name, String origin, String secretIdentity, String CostumeColors) {
        this.name = name;
        this.origin = origin;
        this.secretIdentity = secretIdentity;
        this.CostumeColors = CostumeColors;
        naturalPowerList = new String[10];
    }
    
    public abstract String attacks();
    public abstract String defends();
    public abstract String smile();

    @Override
    public String toString() {
        return "Nombre:"+getName()+"\nOrigen:"+getOrigin()+"\nIdentidad Secreta:"
                +getSecretIdentity()+"\nColores del traje:"+getCostumeColors()
                +"\nPoderes:"+Arrays.toString(this.naturalPowerList);
    }
    
}
