/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.sebas.transpomex.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


/**
 *
 * @author deckard
 */
public class Configuracion {
  
    public static float IVA = 0.16f;
    public static float CAJA_PESO = 15;
    public static float CAJA_VOL = 0.125f;
    private static float CAJA_LARGO = 0.5f;
    private static float CAJA_ALTO = 0.5f;
    private static float CAJA_ANCHO = 0.5f;
    private static final String CONFIG_DIR = "config";
    public static void leerConfig(){
        //TODO: Calculas el volumen de la caja y guardarlo
        //TODO: TODO EL MÓDULO DE FACTURACIÓN :cc
        File f = new File(CONFIG_DIR);
        if(f.exists()){
            Properties props = new Properties();
            try {
                props.load(new FileInputStream(f));
                CAJA_PESO = Float.parseFloat(props.getProperty("CAJA_PESO"));
                CAJA_VOL = Float.parseFloat(props.getProperty("CAJA_VOL"));
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
    }
    public static void guardarConfig(){
        try {
            FileOutputStream out = new FileOutputStream(new File(CONFIG_DIR));
            Properties props = new Properties();
            props.setProperty("CAJA_PESO",Float.toString(CAJA_PESO));
            props.setProperty("CAJA_VOL",Float.toString(CAJA_VOL));
            props.store(out, "---Confuguración TRANSPOMEX--");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
