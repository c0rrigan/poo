/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.sebas.transpomex.reportes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import me.sebas.transpomex.db.DBCon;
import me.sebas.transpomex.vehiculo.Vehiculo;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

/**
 *
 * @author deckard
 */
public class ReportesCSV {
    public static void reporteVehiculos() throws IOException,SQLException{
        DBCon con = new DBCon();
        FileWriter out = new FileWriter(new File("reporteVehiculos.csv"));
        CSVPrinter printer = new CSVPrinter(out,CSVFormat.RFC4180.withHeader("Id Vehiulo","Estado","Matricula","Marca","Modelo","Año","Cap. Carga","Vol. Carga","Km Recorridos","Km Servicio"));
        ArrayList<Vehiculo> regs = con.obtenerVehiculos();
        for (Vehiculo reg : regs) {
            printer.printRecord(reg.getId(),reg.getEstado(),reg.getMatricula(),reg.getFabricante(),reg.getModelo(),reg.getAnio(),reg.getCapCarga(),reg.getVolCarga(),reg.getKmRecorridos(),reg.getKmServicio());
        }
        out.flush();
        con.cerrar();
    }
}
