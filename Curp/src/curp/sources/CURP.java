/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curp.sources;

import java.util.regex.Pattern;


public class CURP {

    /**
     * @return the anio_nac
     */
    public int getAnio_nac() {
        return anio_nac;
    }

    /**
     * @param anio_nac the anio_nac to set
     */
    public void setAnio_nac(int anio_nac) {
        this.anio_nac = anio_nac;
    }

    /**
     * @return the mes_nac
     */
    public int getMes_nac() {
        return mes_nac;
    }

    /**
     * @param mes_nac the mes_nac to set
     */
    public void setMes_nac(int mes_nac) {
        this.mes_nac = mes_nac;
    }

    /**
     * @return the dia_nac
     */
    public int getDia_nac() {
        return dia_nac;
    }

    /**
     * @param dia_nac the dia_nac to set
     */
    public void setDia_nac(int dia_nac) {
        this.dia_nac = dia_nac;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getMatApellido() {
        return matApellido;
    }

    public void setMatApellido(String MatApellido) {
        this.matApellido = MatApellido;
    }

    public String getPatApellido() {
        return patApellido;
    }

    public void setPatApellido(String patApellido) {
        this.patApellido = patApellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEntidadNacimiento() {
        return entidadNacimiento;
    }

    public void setEntidadNacimiento(String entidadNacimiento) {
        this.entidadNacimiento = entidadNacimiento;
    }
    public int getHomoclave() {
        return homoclave;
    }
    public void setHomoclave(int homoclave) {
        this.homoclave = homoclave;
    }
private String nombres;
private String matApellido;
private String patApellido;
private int anio_nac;
private int mes_nac;
private int dia_nac;
private String sexo;
private int homoclave;
private String entidadNacimiento;
    public CURP(){
        
    }
    public CURP(String nombres, String PatApellido, String MatApellido, int anio, int mes, int dia, String sexo, String entidadNacimiento,int hm) {
        this.nombres = nombres;
        this.matApellido = MatApellido;
        this.patApellido = PatApellido;
        this.sexo = sexo;
        this.entidadNacimiento = entidadNacimiento;
        this.anio_nac = anio;
        this.mes_nac = mes;
        this.dia_nac = dia;
        this.homoclave = hm;
    }
    private char obtenerVocal(String cadena){
        char ret = ' ';
        for(int i = 0; i< cadena.length();i++){
            if(Pattern.matches("[AEIOUaeiou]",String.valueOf(cadena.charAt(i)))){ 
                return cadena.charAt(i);
            }
        }
        return ret;
    }
    private char obtenerCons(String cadena,int n){
        char ret = ' ';
        for(int i = 0; i < cadena.length(); i++) {
            if(Pattern.matches("[^AEIOUaeiou]",String.valueOf(cadena.charAt(i)))){
                if(n == 1)
                    return cadena.charAt(i);
                else
                    n--;
            }
        }
        return ret;
    }
    public String obtenerCurp(){
        StringBuffer ret = new StringBuffer();
        ret.append(patApellido.charAt(0));//Agregar la primera letra del primer apellido
        ret.append(obtenerVocal(patApellido));//Agregar la primera vocal de los apellido
        ret.append(matApellido.charAt(0));//Inical segundo apellido
        ret.append(nombres.charAt(0));//Inicial del primer nombre
        ret.append(getAnio_nac()%100);//Agregar solo los dos últimos números del año
       if(getMes_nac()<10)
            ret.append(0);
        ret.append(getMes_nac());//Agregar mes del año
        if(getDia_nac()<10)
            ret.append(0);
        ret.append(getDia_nac());//Agregar dia
        ret.append(sexo.charAt(0));//Agregar primer dígito del sexo     
        ret.append(entidadNacimiento);
        //System.out.println(obtenerConsonante("Lopez"));
        //System.out.println(obtenerConsonante("Lopez"));
        ret.append(obtenerCons(patApellido,2));//siguiente Consonante del apellido paterno        
        ret.append(obtenerCons(matApellido,2));//siguiente Consonante del apellido materno
        ret.append(obtenerCons(nombres,2));//siguiente Consonante del nombre
        if(homoclave<10)
            ret.append(0);
        ret.append(homoclave);//Agregar homoclave(2 digitos)
        
////Pasar fecha a numero
        return ret.toString();
    }
}
