/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.sebas.transpomex.facturas;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 *
 * @author deckard
 */
public class Factura {

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
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @return the dir
     */
    public Direccion getDir() {
        return dir;
    }

    /**
     * @param dir the dir to set
     */
    public void setDir(Direccion dir) {
        this.dir = dir;
    }

    /**
     * @return the tipoEnvio
     */
    public String getTipoEnvio() {
        return tipoEnvio;
    }

    /**
     * @param tipoEnvio the tipoEnvio to set
     */
    public void setTipoEnvio(String tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    /**
     * @return the volCarga
     */
    public float getVolCarga() {
        return volCarga;
    }

    /**
     * @param volCarga the volCarga to set
     */
    public void setVolCarga(float volCarga) {
        this.volCarga = volCarga;
    }

    /**
     * @return the pesoCarga
     */
    public float getPesoCarga() {
        return pesoCarga;
    }

    /**
     * @param pesoCarga the pesoCarga to set
     */
    public void setPesoCarga(float pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    /**
     * @return the fechaSalida
     */
    public Fecha getFechaSalida() {
        return fechaSalida;
    }

    /**
     * @param fechaSalida the fechaSalida to set
     */
    public void setFechaSalida(Fecha fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    /**
     * @return the fechaEntrega
     */
    public Fecha getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * @param fechaEntrega the fechaEntrega to set
     */
    public void setFechaEntrega(Fecha fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    /**
     * @return the retraso
     */
    public int getRetraso() {
        return retraso;
    }

    /**
     * @param retraso the retraso to set
     */
    public void setRetraso(int retraso) {
        this.retraso = retraso;
    }

    /**
     * @return the precioNeto
     */
    public float getPrecioNeto() {
        return precioNeto;
    }

    /**
     * @param precioNeto the precioNeto to set
     */
    public void setPrecioNeto(float precioNeto) {
        this.precioNeto = precioNeto;
    }
    private int id;
    private String key;
    private Direccion dir;
    private String tipoEnvio;
    private float volCarga;
    private float pesoCarga;
    private Fecha fechaSalida;
    private Fecha fechaEntrega;
    private int retraso;
    private float precioNeto;

    public Factura() {
    }
/**
 * Constructor para una nueva instancia de factura
 * @param id
 * @param key
 * @param dir
 * @param tipoEnvio
 * @param volCarga
 * @param pesoCarga
 * @param fechaSalida
 * @param fechaEntrega
 * @param retraso
 * @param precioNeto 
 */
    public Factura(int id, String key, Direccion dir, String tipoEnvio, float volCarga, float pesoCarga,Fecha fechaSalida,Fecha fechaEntrega, int retraso, float precioNeto) {
        this.id = id;
        this.dir = dir;
        this.tipoEnvio = tipoEnvio;
        this.volCarga = volCarga;
        this.pesoCarga = pesoCarga;
        this.fechaSalida = fechaSalida;
        this.fechaEntrega = fechaEntrega;
        this.retraso = retraso;
        this.precioNeto = precioNeto;
        if(key.isEmpty()){
            this.key = obtenerHash().toUpperCase();
        }else{
            this.key = key;
        }
    }
        
    public String obtenerHash(){
        byte res[] = {0};
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update((dir.getCalle()+dir.getColonia()+fechaSalida+volCarga+pesoCarga).getBytes(StandardCharsets.UTF_8));
            res = md.digest();
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Algoritmo no encontrado\n"+e);
        }  
        return Base64.getEncoder().encodeToString(res).substring(0, 6);
    }
 
    
}
