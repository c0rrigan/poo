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
public class El_Santo extends Athlete implements Volador{
    public boolean mascaraPlata;
    public boolean capaAntiBalas;
    public El_Santo(){
        super("Moreno","Lucha Libre");   
    }
    public El_Santo(boolean mascPlata,boolean capAnti){
        super("Moreno","Lucha Libre");
        this.capaAntiBalas = capAnti;
        this.mascaraPlata = mascPlata;
    }
    
    public int matarVampiros(){
        return (this.mascaraPlata)?Math.round((float)Math.random()*10):0;
    }
    public int matarMomiasGto(){
        return (this.capaAntiBalas)?Math.round((float)Math.random()*50):0;
    }
    @Override
    public String despegar() {
        return "El Santo ha despegado, gravedad:"+GRAVEDAD;
    }

    @Override
    public String volar() {
        return "El santo sigue volando, gravedad:"+GRAVEDAD;
    }

    @Override
    public String aterrizar() {
        return "El santo ha aterrizado, gravedad:"+GRAVEDAD;
    }

    @Override
    public String toString() {
        return super.toString()+"\nMascara Plata:"+this.mascaraPlata+"\nCapa Antibalas:"+this.capaAntiBalas; 
    }
    
   
}
