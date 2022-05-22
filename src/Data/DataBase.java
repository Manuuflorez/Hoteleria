
package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class  DataBase {
    
    private Connection conexion;
    
    public DataBase() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        this.conexion = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/Hosteria?characterEncoding=UTF8", "root", "root");
        
    }

    /**
     * @return the con
     */
    public Connection getConexion() {
        return conexion;
    }

    /**
     * @param con the con to set
     */
    public void setConexion(Connection con) {
        this.conexion = con;
    }
    
    
}
