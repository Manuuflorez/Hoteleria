
package Modelo;

public class Habitacion {

    private String id_habitacion;
    private String nom_habitacion;
    private String tipo;
    private double precio_temAlta;
    private double precio_temBaja;
    private String activo;
    private String imagen_habitacion;
    private String id_hotel;

    public Habitacion(String id_habitacion, String nom_habitacion, String tipo, double precio_temAlta, double precio_temBaja, String activo, String imagen_habitacion, String id_hotel) {
        this.id_habitacion = id_habitacion;
        this.nom_habitacion = nom_habitacion;
        this.tipo = tipo;
        this.precio_temAlta = precio_temAlta;
        this.precio_temBaja = precio_temBaja;
        this.activo = activo;
        this.imagen_habitacion = imagen_habitacion;
        this.id_hotel = id_hotel;
    }

    /**
     * @return the id_habitacion
     */
    public String getId_habitacion() {
        return id_habitacion;
    }

    /**
     * @param id_habitacion the id_habitacion to set
     */
    public void setId_habitacion(String id_habitacion) {
        this.id_habitacion = id_habitacion;
    }

    /**
     * @return the nom_habitacion
     */
    public String getNom_habitacion() {
        return nom_habitacion;
    }

    /**
     * @param nom_habitacion the nom_habitacion to set
     */
    public void setNom_habitacion(String nom_habitacion) {
        this.nom_habitacion = nom_habitacion;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the precio_temAlta
     */
    public double getPrecio_temAlta() {
        return precio_temAlta;
    }

    /**
     * @param precio_temAlta the precio_temAlta to set
     */
    public void setPrecio_temAlta(double precio_temAlta) {
        this.precio_temAlta = precio_temAlta;
    }

    /**
     * @return the precio_temBaja
     */
    public double getPrecio_temBaja() {
        return precio_temBaja;
    }

    /**
     * @param precio_temBaja the precio_temBaja to set
     */
    public void setPrecio_temBaja(double precio_temBaja) {
        this.precio_temBaja = precio_temBaja;
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
     * @return the imagen_habitacion
     */
    public String getImagen_habitacion() {
        return imagen_habitacion;
    }

    /**
     * @param imagen_habitacion the imagen_habitacion to set
     */
    public void setImagen_habitacion(String imagen_habitacion) {
        this.imagen_habitacion = imagen_habitacion;
    }

    /**
     * @return the id_hotel
     */
    public String getId_hotel() {
        return id_hotel;
    }

    /**
     * @param id_hotel the id_hotel to set
     */
    public void setId_hotel(String id_hotel) {
        this.id_hotel = id_hotel;
    }

}
