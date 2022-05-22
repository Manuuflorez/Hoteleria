package Modelo;

import java.time.format.DateTimeFormatterBuilder;

public class Usuario {

    private String id_usuario;
    private String nom_usuario;
    private String correo;
    private String telefono;
    private String activo;
    private String contrasena;
    
    public Usuario(){
        
    }

    public Usuario(String id_usuario, String nom_usuario, String correo, String telefono, String activo, String contrasena) {
        this.id_usuario = id_usuario;
        this.nom_usuario = nom_usuario;
        this.correo = correo;
        this.telefono = telefono;
        this.activo = activo;
        this.contrasena = contrasena;
    }

    /**
     * @return the id_usuario
     */
    public String getId_usuario() {
        return id_usuario;
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    /**
     * @return the nom_usuario
     */
    public String getNom_usuario() {
        return nom_usuario;
    }

    /**
     * @param nom_usuario the nom_usuario to set
     */
    public void setNom_usuario(String nom_usuario) {
        this.nom_usuario = nom_usuario;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the activo
     */
    public String getActivo() {
        return activo;
    }

    /**
     * @param activo the activo to set
     */
    public void setActivo(String activo) {
        this.activo = activo;
    }

    /**
     * @return the contraseña
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * @param contrasena the contrasena to set
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}
