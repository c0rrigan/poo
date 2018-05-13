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
public class Ave extends ZooAnimal implements Volador{
    public Ave(String nombre,Fecha fechaNacimiento,String nombreCient,boolean peligroExtincion,boolean esDepredador,String tipoAlas){
        super(nombre,fechaNacimiento,nombreCient,"Ave",peligroExtincion);
        this.setDepredador(esDepredador);
        this.setTipoAlas(tipoAlas);
    }

    /**
     * @return the Depredador
     */
    public boolean isDepredador() {
        return Depredador;
    }

    /**
     * @param Depredador the Depredador to set
     */
    public void setDepredador(boolean Depredador) {
        this.Depredador = Depredador;
    }

    /**
     * @return the tipoAlas
     */
    public String getTipoAlas() {
        return tipoAlas;
    }

    /**
     * @param tipoAlas the tipoAlas to set
     */
    public void setTipoAlas(String tipoAlas) {
        this.tipoAlas = tipoAlas;
    }

    private boolean Depredador;
    private String tipoAlas;
    public int ponerHuevo(){
        return (this.isDepredador())?5:1;
    }
    public String empollar(){
        return "Empollando...";
    }
    @Override
    public String despegar() {
        return "Ave despegando, gravedad:"+GRAVEDAD;
    }

    @Override
    public String volar() {
        return "Ave volando, gravedad:"+GRAVEDAD;
    }

    @Override
    public String aterrizar() {
        return "Ave aterrizando, gravedad:"+GRAVEDAD;
    }

    @Override
    public String toString() {
        return super.toString()+"\nTipo Alas:"+this.tipoAlas+"\nDepredador:"+this.Depredador;
    }
    
}
