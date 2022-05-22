/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Modelo.*;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author Lenovo
 */
public class ReservaData {
    
    private DataBase data;
    
    public ReservaData() throws ClassNotFoundException, SQLException{
        this.data = new DataBase();
    }
    
    public boolean createReserva(Reserva reserva){
        try{
            Statement stmt = data.getConexion().createStatement();
            DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String query = "INSERT INTO hosteria.tblreserva\n" +
                        "(fecha_inicio, id_usuario, id_habitacion, fecha_fin, total)\n" +
                        "VALUES('"+formatter.format(reserva.getFechaInicio())+"', '"
                    +reserva.getId_usuario()+"', '"+reserva.getId_habitacion()+"', '"
                    +formatter.format(reserva.getFechaFin())+"', "+reserva.getTotal()+");";
            stmt.execute(query);
            data.getConexion().close();
            return true;
        }catch(Exception e){
            System.out.println(e.getStackTrace().toString());
            return false;
        }
    }
}
