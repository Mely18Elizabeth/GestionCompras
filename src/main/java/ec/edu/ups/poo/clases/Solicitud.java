package ec.edu.ups.poo.clases;

import ec.edu.ups.poo.enums.Estado;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.ArrayList;

public class Solicitud {
    private String numero;
    private GregorianCalendar fechaInicio;
    private Estado estado;
    private List<ItemSolicitud> items;
    public Solicitud(String numero, GregorianCalendar fechaInicio, Estado estado) {
        this.numero = numero;
        this.fechaInicio = fechaInicio;
        this.estado = estado;
        this.items = new ArrayList<>();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
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

    public List<ItemSolicitud> getItems() {
        return items;
    }

    public void setItems(List<ItemSolicitud> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Solicitud:" +
                "\n  Número: " + numero +
                "\n  Fecha de inicio: " + fechaInicio.getTime() +
                "\n  Estado: " + estado +
                "\n  Items: " + items;  // Muestra los ítems de la solicitud
    }
}
