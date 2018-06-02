/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sources;

/**
 *
 * @author alumno
 */
public abstract class Abstracta implements Interface2{
    @Override
    public String despedir() {
        return despido;
    }

    @Override
    public String despedir(String nombre) {
        return despido+" "+nombre;
    }

    @Override
    public String despedirFormal(String nombre) {
        return "Fue un placer Sr(a) "+nombre;
    }

    @Override
    public String saludar() {
        return saludo;
    }

    @Override
    public String saludar(String nombre) {
        return saludo+" "+nombre;
    }

    @Override
    public String saludarFormal(String nombre) {
        return "Buen día Sr(a) "+nombre;
    }
}
