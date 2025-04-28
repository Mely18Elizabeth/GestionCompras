package ec.edu.ups.poo.clases;

import java.util.ArrayList;
import java.util.List;

public class Proveedor {
    private String id;
    private String nombre;
    private List<Producto> productos;

    public Proveedor(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    public Proveedor(String id, String nombre, List<Producto> productos) {
        this.id = id;
        this.nombre = nombre;
        this.productos = productos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", productos=" + productos +
                '}';
    }
}
