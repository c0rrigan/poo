/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sources;

import java.util.regex.Pattern;

public class ZooAnimal {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento.toString();
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public boolean isPeligroExtincion() {
        return peligroExtincion;
    }

    public void setPeligroExtincion(boolean peligroExtincion) {
        this.peligroExtincion = peligroExtincion;
    }

    public Pattern getP() {
        return p;
    }

    public void setP(Pattern p) {
        this.p = p;
    }
    private String nombre;
    private Fecha fechaNacimiento;
    private String nombreCientifico;
    private String clase;
    private boolean peligroExtincion;
    private Pattern p;
    private String[] Tipos = {"Mamifero","Reptil"};
    private char[] Signos ={'$','&','%'};
    
    public ZooAnimal(String nombre, Fecha fechaNacimiento, String nombreCientifico, String clase, boolean peligroExtincion) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.nombreCientifico = nombreCientifico;
        this.clase = clase;
        this.peligroExtincion = peligroExtincion;
    }

    public ZooAnimal() {
        
    }
    
    public char obtenerConsonante(String cadena){
        char ret = ' ';
        for (int i = 0; i < cadena.length(); i++) {
            if(Pattern.matches("[^aeiou]",String.valueOf(cadena.charAt(i)))){
                ret = cadena.charAt(i);
                break;
            }  
        }
        return ret;
    }
    public char obtenerVocal(String cadena){
        char ret = '\0';
        for (int i = 0; i < cadena.length(); i++) {
            if(Pattern.matches("[aeiou]",String.valueOf(cadena.charAt(i)))){
                ret = cadena.charAt(i);
                break;
            }  
        }
        return ret;
    }
    public boolean peligroExtincion(){
        return isPeligroExtincion();
    }
    @Override
    public String toString() {
        return "ID:"+obtenerId()+"\nNombre:"+getNombre()+"\nNombre científico:"+getNombreCientifico()
                +"\nFecha de Nacimiento:"+getFechaNacimiento()+"\nClase:"+getClase()
                +"\nPeligro de extinción:"+isPeligroExtincion();
    }
    public String obtenerId(){
        int i,j = i  = 0;
        char c = ' ';
        StringBuffer id = new StringBuffer();
        while(j<3) {
            if(i < nombre.length()){
                    if (Pattern.matches("[^aeiou]", String.valueOf(nombre.charAt(i)))) {
                        id.append(nombre.charAt(i));
                        j++;
                    }
                    i++;
            }
            else{
                id.append("#");
                j++;
            }
        }
        for(i = 0;i<3;i++){
            id.append(fechaNacimiento.mes.charAt(i));
        }
        j = i = 0;
        while(j<3) {
            if(i < nombreCientifico.length()){
                if (Pattern.matches("[^aeiou]", String.valueOf(nombreCientifico.charAt(i)))) {
                    id.append(nombreCientifico.charAt(i));
                    j++;
                }
                i++;
            }
            else{
                id.append("#");
                j++;
            }
        }
        if(peligroExtincion)
            id.append('T');
        else
            id.append('F');
        //Mamifero
        if(clase.equals(Tipos[0]))
            id.append(Math.round(Math.random()*1000));
        //reptil
        else
            id.append(Signos[(int)Math.floor(Math.random()*Signos.length)]);
            return id.toString();
    }
}
