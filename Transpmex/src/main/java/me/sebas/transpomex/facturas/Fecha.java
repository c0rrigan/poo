/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.sebas.transpomex.facturas;

import java.util.Calendar;

/**
 *
 * @author deckard
 */
public class Fecha {

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @return the dia
     */
    public int getDia() {
        return dia;
    }
    private final int mes;
    private final int anio;
    private final int dia;
    private Calendar c;
    public Fecha(int mes, int anio, int dia) {
        this.mes = mes;
        this.anio = anio;
        this.dia = dia;
        c = Calendar.getInstance();
        c.set(anio,mes,dia);
    }
    public Fecha(long mills){
        c = Calendar.getInstance();
        c.setTimeInMillis(mills);   
        this.mes = c.get(Calendar.MONTH);
        this.anio = c.get(Calendar.YEAR);
        this.dia = c.get(Calendar.DAY_OF_MONTH);
    }
    public long toMills(){
        c.set(getAnio(), getMes(), getDia());
        return c.getTimeInMillis();
    }
    public Calendar getCalendar(){
        return c;
    }

    @Override
    public String toString() {
        return anio+"-"+mes+"-"+dia;
    }
    
}
