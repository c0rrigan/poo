/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.sebas.transpomex.vehiculo;

/**
 *
 * @author deckard
 */
public class Vehiculo implements Transporte{

    /**
     * @return the idMarca
     */
    public short getIdMarca() {
        return idMarca;
    }

    /**
     * @param idMarca the idMarca to set
     */
    public void setIdMarca(short idMarca) {
        this.idMarca = idMarca;
    }

    /**
     * @return the img
     */
    public String getImg() {
        return img;
    }

    /**
     * @param img the img to set
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * @return the kmRecorridos
     */
    public int getKmRecorridos() {
        return kmRecorridos;
    }

    /**
     * @param kmRecorridos the kmRecorridos to set
     */
    public void setKmRecorridos(int kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the kmServicio
     */
    public int getKmServicio() {
        return kmServicio;
    }

    /**
     * @param kmServicio the kmServicio to set
     */
    public void setKmServicio(int kmServicio) {
        this.kmServicio = kmServicio;
    }

    /**
     * @return la matricula del vehículo
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula la matricula a asignar
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return el modelo del vehículo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo el modelo del vhículo a asignar
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the fabricante
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * @param fabricante the fabricante to set
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * @return the volCarga
     */
    public int getVolCarga() {
        return volCarga;
    }

    /**
     * @param volCarga the volCarga to set
     */
    public void setVolCarga(int volCarga) {
        this.volCarga = volCarga;
    }

    /**
     * @return the capCarga
     */
    public int getCapCarga() {
        return capCarga;
    }

    /**
     * @param capCarga the capCarga to set
     */
    public void setCapCarga(int capCarga) {
        this.capCarga = capCarga;
    }
    
    /**
     * @return the anio
     */
    public short getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(short anio) {
        this.anio = anio;
    }
    private String matricula;
    private String modelo;
    private short anio;
    private String fabricante;
    private int volCarga;
    private int capCarga;
    private int id;
    private int kmServicio;
    private int kmRecorridos;
    private short idMarca;
    private String estado;
    private String img;

    public Vehiculo() {
    }

    public Vehiculo(String matricula, String modelo, short anio, String fabricante, int volCarga, int capCarga, int id, int kmServicio,int kmRecorridos,String estado,String imgDir) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.anio = anio;
        this.fabricante = fabricante;
        this.volCarga = volCarga;
        this.capCarga = capCarga;
        this.id = id;
        this.kmServicio = kmServicio;
        this.kmRecorridos = kmRecorridos;
        this.estado = estado;
        this.img = imgDir;
    }

    @Override
    public int llevarCarga(int carga) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return matricula+" : "+fabricante+" "+modelo;
    }
    
}
