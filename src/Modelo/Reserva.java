package Modelo;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Reserva {

    private String cod_reserva;
    private Date fechaInicio;
    private Date fechaFin;
    private String id_usuario;
    private String id_habitacion;
    private Double total;
    
    public Reserva(){
        
    }

    public Reserva(String cod_reserva, Date fechaInicio, Date fechaFin, String id_usuario, String id_habitacion, Double total) {
        this.cod_reserva = cod_reserva;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.id_usuario = id_usuario;
        this.id_habitacion = id_habitacion;
        this.total = total;
    }

    /**
     * @return the cod_reserva
     */
    public String getCod_reserva() {
        return cod_reserva;
    }

    /**
     * @param cod_reserva the cod_reserva to set
     */
    public void setCod_reserva(String cod_reserva) {
        this.cod_reserva = cod_reserva;
    }

    /**
     * @return the fechaInicio
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @return the fechaFin
     */
    public Date getFechaFin() {
        return fechaFin;
    }

    /**
     * @param fechaFin the fechaFin to set
     */
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
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
     * @return the total
     */
    public Double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(Double total) {
        this.total = total;
    }

}
