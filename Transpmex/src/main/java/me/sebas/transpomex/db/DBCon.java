/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.sebas.transpomex.db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import me.sebas.transpomex.facturas.Direccion;
import me.sebas.transpomex.facturas.Factura;
import me.sebas.transpomex.facturas.Fecha;
import me.sebas.transpomex.vehiculo.Vehiculo;

/**
 *
 * @author deckard
 */
public class DBCon {
    
    private String SELECT_VEHICULOS_STMT = "select vehiculos.id_vehiculo,estados_vehiculos.estado,vehiculos.matr,marcas.marca,vehiculos.modelo,vehiculos.anio,vehiculos.cap_carga,vehiculos.vol_carga,vehiculos.km_recorridos,vehiculos.km_servicio,vehiculos.dir_img from vehiculos join marcas on vehiculos.id_marca = marcas.id_marca join estados_vehiculos on vehiculos.id_estado = estados_vehiculos.id_estado";
    private String INSERT_VEHICULOS_STMT = "insert into vehiculos(matr,id_marca,modelo,anio,cap_carga,vol_carga,dir_img) values (?,?,?,?,?,?,?)";
    private String SELECT_MARCAS_STMT = "select marcas.marca from marcas order by marcas.marca asc";
    private String DELETE_VEHICULOS_STMT = "delete from vehiculos where vehiculos.id_vehiculo = ?";
    private String UPDATE_VEHICULOS_STMT = "update vehiculos set matr =?,id_marca=?,modelo=?,anio=?,cap_carga=?,vol_carga=?,dir_img=? where id_vehiculo=?";
    private String INSERT_FACTURA_STMT  = "insert into facturas(key,calle,colonia,municipio,id_estado,tipo_envio,vol_carga,peso_carga,fecha_salida,fecha_entrega,costo) values (?,?,?,?,?,?,?,?,?,?,?)";
    private String SELECT_FACTURA_STMT = "select facturas.id_factura,facturas.key,facturas.calle,facturas.colonia,facturas.municipio,estados.estado,tipo_envios.tipo,facturas.vol_carga,facturas.peso_carga,facturas.fecha_salida,facturas.fecha_entrega,facturas.retraso,facturas.costo from facturas join estados on facturas.id_estado = estados.id_estadomex join tipo_envios on facturas.tipo_envio = tipo_envios.id_tipoenv where facturas.`key` = ?";
    private String SELECT_ALLFACTURAS_STMT ="select facturas.id_factura,facturas.key,facturas.calle,facturas.colonia,facturas.municipio,estados.estado,tipo_envios.tipo,facturas.vol_carga,facturas.peso_carga,facturas.fecha_salida,facturas.fecha_entrega,facturas.retraso,facturas.costo from facturas join estados on facturas.id_estado = estados.id_estadomex join tipo_envios on facturas.tipo_envio = tipo_envios.id_tipoenv ";
    private String SELECT_ESTADOS_STMT = "select estados.estado from estados";
    
    private Connection con;
    public DBCon(){
        try {
           con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/transpmex", "root", "charmander");
        
        } catch (SQLException e) {
            System.out.println("Excepcion SQL:\n"+e);
        }
    }
    public ArrayList<String> obtenerMarcas(){
        ArrayList<String> marcas = new ArrayList<>();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SELECT_MARCAS_STMT);
            while(rs.next()){
                marcas.add(rs.getString("marca"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return marcas;
    }
    public ArrayList<String> obtenerEstados(){
        ArrayList<String> estados = new ArrayList<>();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SELECT_ESTADOS_STMT);
            while(rs.next()){
                estados.add(rs.getString(1));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return estados;
    }
    public void nuevoVehiculo(String matr,short marca,String modelo,short anio,int capCarga,int volCarga,String dirImg) throws SQLException{
            PreparedStatement pm = con.prepareStatement(INSERT_VEHICULOS_STMT);
            pm.setString(1, matr.toUpperCase());
            pm.setShort(2, marca);
            pm.setString(3, modelo);
            pm.setShort(4, anio);
            pm.setInt(5, capCarga);
            pm.setInt(6, volCarga);
            if(dirImg.isEmpty())
                pm.setNull(7, java.sql.Types.VARCHAR);
            else
                pm.setString(7, dirImg);
            pm.execute();
    }
    public ArrayList<Vehiculo> obtenerVehiculos() throws SQLException{
        ArrayList<Vehiculo> list = new ArrayList<Vehiculo>();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(SELECT_VEHICULOS_STMT);
        while(rs.next()){
            Vehiculo v = 
                    new Vehiculo(rs.getString(3),//Matricula
                            rs.getString(5),//Modelo
                            rs.getShort(6),//Año
                            rs.getString(4),//Fabricante
                            rs.getInt(8),//Volúmen carga
                            rs.getInt(7),//Capacidad carga
                            rs.getInt(1),//ID
                            rs.getInt(9),//Km Servicio
                            rs.getInt(10),//Km Recorrido
                            rs.getString(2),//Estado
                            rs.getString(11));//Dir img
            list.add(v);
        }
        return list;
    }
    public void eliminarVehiculo(int idVehiculo) throws SQLException{
        PreparedStatement ps = con.prepareStatement(DELETE_VEHICULOS_STMT);
        ps.setInt(1, idVehiculo);
        ps.executeUpdate();
    }
    //update vehiculos set matr =?,id_marca=?,modelo=?,anio=?,cap_carga=?,vol_carga=?,dir_img=? where id_vehiculo=?
    public void modificarVehiculo(Vehiculo v) throws SQLException{
       PreparedStatement pm = con.prepareStatement(UPDATE_VEHICULOS_STMT);
            pm.setString(1, v.getMatricula().toUpperCase());
            pm.setShort(2,v.getIdMarca());
            pm.setString(3,v.getModelo());
            pm.setShort(4,v.getAnio());
            pm.setInt(5,v.getCapCarga());
            pm.setInt(6,v.getVolCarga());
            if(v.getImg().isEmpty())
                pm.setNull(7, java.sql.Types.VARCHAR);
            else
                pm.setString(7,v.getImg());
            pm.setInt(8, v.getId());
            pm.execute();
        }
    //insert into facturas(key,calle,colonia,municipio,id_estado,tipo_envio,vol_carga,peso_carga,fecha_salida,fecha_entrega,costo) values (?,?,?,?,?,?,?,?,?,?,?)";
    public void nuevaFactura(Factura f,short idEstado,short idTipoEnv,float volCarga,float pesoCarga,Fecha fechaSalida,Fecha fechaEntrega,float costo) throws SQLException{
        PreparedStatement pm = con.prepareStatement(INSERT_FACTURA_STMT);
        pm.setString(1,f.getKey());//Llave
        pm.setString(2,f.getDir().getCalle());//Calle
        pm.setString(3,f.getDir().getColonia());//Colonia
        pm.setString(4, f.getDir().getMunicipio());//Municipio
        pm.setInt(5,idEstado);//Id Estado
        pm.setShort(6, idTipoEnv);//Tipo de Envio
        pm.setFloat(7, f.getVolCarga());//Vol Carga
        pm.setFloat(8, f.getPesoCarga());//Peso Carga
        pm.setDate(9,new java.sql.Date(f.getFechaEntrega().toMills()));//Fecha salida
        pm.setDate(10,new java.sql.Date(f.getFechaSalida().toMills()));//Fecha entrega
        pm.setFloat(11,costo);//Costo
        pm.executeUpdate();
    }
    public Factura verFactura(String key) throws SQLException{
        PreparedStatement pm = con.prepareStatement(SELECT_FACTURA_STMT);
        pm.setString(1, key);
        ResultSet rs = pm.executeQuery();
        Factura f = new Factura();
        while(rs.next()){
            f.setId(rs.getInt(1));//ID
            f.setKey(rs.getString(2));//Llave
            Direccion dir = new Direccion();
            dir.setCalle(rs.getString(3));
            dir.setColonia(rs.getString(4));
            dir.setMunicipio(rs.getString(5));
            dir.setEstado(rs.getString(6));
            f.setDir(dir);
            f.setTipoEnvio(rs.getString(7));
            f.setVolCarga(rs.getFloat(8));
            f.setPesoCarga(rs.getFloat(9));
            f.setFechaSalida(new Fecha(rs.getDate(10).getTime()));
            f.setFechaEntrega(new Fecha(rs.getDate(11).getTime()));
            f.setRetraso(rs.getShort(12));
            f.setPrecioNeto(rs.getFloat(13));
        }
        return f;
    }
    public ArrayList<Factura> obtenerFacturas() throws SQLException{
        PreparedStatement pm = con.prepareStatement(SELECT_ALLFACTURAS_STMT);
        ResultSet rs = pm.executeQuery();
        ArrayList<Factura> facts = new ArrayList<>();
        while(rs.next()){
            Factura f = new Factura();
            f.setId(rs.getInt(1));//ID
            f.setKey(rs.getString(2));//Llave
            Direccion dir = new Direccion();
            dir.setCalle(rs.getString(3));
            dir.setColonia(rs.getString(4));
            dir.setMunicipio(rs.getString(5));
            dir.setEstado(rs.getString(6));
            f.setDir(dir);
            f.setTipoEnvio(rs.getString(7));
            f.setVolCarga(rs.getFloat(8));
            f.setPesoCarga(rs.getFloat(9));
            f.setFechaSalida(new Fecha(rs.getDate(10).getTime()));
            f.setFechaEntrega(new Fecha(rs.getDate(11).getTime()));
            f.setRetraso(rs.getShort(12));            
            f.setPrecioNeto(rs.getFloat(13));
            facts.add(f);
        }
        return facts;
    }
    public void cerrar(){
        try {
            con.close();   
        } catch (Exception e) {
            System.out.println("Excepcion SQL:\n"+e);
        }
    }
}
