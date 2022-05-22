package Data;

import Modelo.Habitacion;
import Modelo.Hotel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.xml.crypto.Data;

public class HabitacionData {

    private DataBase data;

    public HabitacionData() throws ClassNotFoundException, SQLException {
        this.data = new DataBase();
    }

    public List<Habitacion> getHabitacionByHotelId(Hotel hotel) throws SQLException {
        List<Habitacion> listaHabitacion = new ArrayList<Habitacion>();
        Statement stmt = data.getConexion().createStatement();
        ResultSet rs = stmt.executeQuery("select * from tblhabitacion t "
                + "where t.id_hotel = '" + hotel.getId_hotel() + "'");
        while (rs.next()) {
            Habitacion objHabitacion = new Habitacion(rs.getString("id_habitacion"),
                    rs.getString("nom_habitacion"), rs.getString("tipo"), rs.getDouble("precio_tempAlta"),
                    rs.getDouble("precio_tempBaja"), rs.getString("activo"), rs.getString("imagen_habitacion"),
                    rs.getString("id_hotel"));
                    listaHabitacion.add(objHabitacion);
        }
        data.getConexion().close();
        return listaHabitacion;
    }
}
