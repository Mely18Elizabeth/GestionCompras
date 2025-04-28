package ec.edu.ups.poo.clases;
import ec.edu.ups.poo.enums.Estado;
import java.util.GregorianCalendar;

public class Solicitud {
    private String numero;
    private String nombreEmpleado;
    private Double cantidad;
    private GregorianCalendar fechaInicio;
    private Estado estado;
    private Estado estadoSolicitado;
    private Double precio;

    public Solicitud() {}

    public Solicitud(String numero, String nombreEmpleado, Double cantidad) {
        this.numero = numero;
        this.nombreEmpleado = nombreEmpleado;
        this.cantidad = cantidad;
        this.fechaInicio = new GregorianCalendar();
        this.estado = Estado.Rechazado;
        this.estadoSolicitado = Estado.Solicitado;
        this.precio = 0.0;
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

    public Estado getEstadoSolicitado() {
        return estadoSolicitado;
    }

    public void setEstadoSolicitado(Estado estadoSolicitado) {
        this.estadoSolicitado = estadoSolicitado;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Solicitud{" +
                "numero='" + numero + '\'' +
                ", nombreEmpleado='" + nombreEmpleado + '\'' +
                ", cantidad=" + cantidad +
                ", fechaInicio=" + fechaInicio +
                ", estado=" + estado +
                ", estadoSolicitado=" + estadoSolicitado +
                ", precio=" + precio +
                '}';
    }
}
