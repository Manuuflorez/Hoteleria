
package Data;

import Modelo.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.List;

public class UsuariosData {
    private DataBase data;

    public UsuariosData() throws ClassNotFoundException, SQLException {
        this.data = new DataBase();
    }

    public boolean RegistroUsuario(Usuario usuario) {
        try{
            Statement stmt = data.getConexion().createStatement();
            String query = "INSERT INTO hosteria.tblusuario\n" +
            "(id_usuario, nom_usuario, correo, telefono, activo, contrasena)\n" +
            "VALUES('"+usuario.getId_usuario()+"', '"+usuario.getNom_usuario()+"', '"+usuario.getCorreo()
                    +"', '"+usuario.getTelefono()+"', 'si', '"+usuario.getContrasena()+"');";
            stmt.execute(query);
            data.getConexion().close();
            return true;
        }catch(Exception e){
            System.out.println(e.getStackTrace().toString());
            return false;
        }
    }
    
    public Usuario IniciarSesion(Usuario usuario) {
        try{
            Statement stmt = data.getConexion().createStatement();
            ResultSet rs = stmt.executeQuery("Select * from tblusuario user where user.nom_usuario ='"
                    +usuario.getNom_usuario()+"' and user.contrasena='"+usuario.getContrasena()+"'");
            Usuario usuarioCompleto = null;
            while (rs.next()) {
                usuarioCompleto  = new Usuario(rs.getString("id_usuario"),
                        rs.getString("nom_usuario"), rs.getString("correo"), rs.getString("telefono"),
                        rs.getString("activo"), rs.getString("contrasena"));
            }
            data.getConexion().close();
            return usuarioCompleto;
        }catch(Exception e){
            System.out.println(e.getStackTrace().toString());
            return null;
        }
    }
}

