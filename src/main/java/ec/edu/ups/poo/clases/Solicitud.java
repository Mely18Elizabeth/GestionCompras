package ec.edu.ups.poo.clases;
import ec.edu.ups.poo.enums.Estado;

import java.util.GregorianCalendar;

public class Solicitud {
    private String numero;
    private String nombreEmpleado;
    private Double cantidad;
    private GregorianCalendar fechaInicio;
    private Estado estado;

    public Solicitud(String numero, String nombreEmpleado, Double cantidad, GregorianCalendar fechaInicio, Estado estado) {
        this.numero = numero;
        this.nombreEmpleado = nombreEmpleado;
        this.cantidad = cantidad;
        this.fechaInicio = fechaInicio;
        this.estado = estado;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public GregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(GregorianCalendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Solicitud{" +
                "numero='" + numero + '\'' +
                ", nombreEmpleado='" + nombreEmpleado + '\'' +
                ", cantidad=" + cantidad +
                ", fechaInicio=" + fechaInicio +
                ", estado=" + estado +
                '}';
    }
}
