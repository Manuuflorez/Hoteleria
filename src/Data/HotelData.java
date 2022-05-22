/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Modelo.Hotel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class HotelData {
    
    private DataBase data;
    
    public HotelData() throws ClassNotFoundException, SQLException{
        data = new DataBase();
    }
    
    public List<Hotel> getHotel() throws SQLException{
        List<Hotel> listaHotel = new ArrayList<Hotel>();
        Statement stmt = data.getConexion().createStatement();
            ResultSet rs = stmt.executeQuery("select * from tblhotel");
            while (rs.next()) {               
                Hotel objHotel = new Hotel(rs.getString("id_hotel"),
                        rs.getString("nom_hotel"),rs.getString("ubicacion"),
                        rs.getInt("num_habitaciones_vip"),rs.getInt("num_habitaciones_estandar"),
                        rs.getInt("num_habitaciones_premium"),rs.getInt("capacidad"), 
                        rs.getString("activo"),rs.getString("imagen"));
                listaHotel.add(objHotel);
            }
            data.getConexion().close();
        return listaHotel;
    }
}
