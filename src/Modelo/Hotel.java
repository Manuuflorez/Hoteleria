
package Modelo;

public class Hotel {
    
    private String id_hotel;
    private String nom_hotel;
    private String ubicacion;
    private double num_habitaciones_vip;
    private double num_habitaciones_estandar;
    private double num_habitaciones_premium;
    private double capacidad;
    private String activo;
    private String imagen;

    public Hotel(String id_hotel, String nom_hotel, String ubicacion, double num_habitaciones_vip, double num_habitaciones_estandar, double num_habitaciones_premium, double capacidad, String activo, String imagen) {
        this.id_hotel = id_hotel;
        this.nom_hotel = nom_hotel;
        this.ubicacion = ubicacion;
        this.num_habitaciones_vip = num_habitaciones_vip;
        this.num_habitaciones_estandar = num_habitaciones_estandar;
        this.num_habitaciones_premium = num_habitaciones_premium;
        this.capacidad = capacidad;
        this.activo = activo;
        this.imagen = imagen;
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

    /**
     * @return the nom_hotel
     */
    public String getNom_hotel() {
        return nom_hotel;
    }

    /**
     * @param nom_hotel the nom_hotel to set
     */
    public void setNom_hotel(String nom_hotel) {
        this.nom_hotel = nom_hotel;
    }

    /**
     * @return the ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * @return the num_habitaciones_vip
     */
    public double getNum_habitaciones_vip() {
        return num_habitaciones_vip;
    }

    /**
     * @param num_habitaciones_vip the num_habitaciones_vip to set
     */
    public void setNum_habitaciones_vip(double num_habitaciones_vip) {
        this.num_habitaciones_vip = num_habitaciones_vip;
    }

    /**
     * @return the num_habitaciones_estandar
     */
    public double getNum_habitaciones_estandar() {
        return num_habitaciones_estandar;
    }

    /**
     * @param num_habitaciones_estandar the num_habitaciones_estandar to set
     */
    public void setNum_habitaciones_estandar(double num_habitaciones_estandar) {
        this.num_habitaciones_estandar = num_habitaciones_estandar;
    }

    /**
     * @return the num_habitaciones_premium
     */
    public double getNum_habitaciones_premium() {
        return num_habitaciones_premium;
    }

    /**
     * @param num_habitaciones_premium the num_habitaciones_premium to set
     */
    public void setNum_habitaciones_premium(double num_habitaciones_premium) {
        this.num_habitaciones_premium = num_habitaciones_premium;
    }

    /**
     * @return the capacidad
     */
    public double getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
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
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
