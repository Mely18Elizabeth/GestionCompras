package ec.edu.ups.poo.clases;

import java.util.ArrayList;
import java.util.List;

public class Producto {
  private String id;
  private String nombre;
  private List<Producto> productos;

  // Constructor vacío
  public Producto() {
    this.productos = new ArrayList<>();
  }

  // Constructor con ID y nombre
  public Producto(String id, String nombre) {
    this.id = id;
    this.nombre = nombre;
    this.productos = new ArrayList<>();
  }

  // Constructor completo
  public Producto(String id, String nombre, List<Producto> productos) {
    this.id = id;
    this.nombre = nombre;
    this.productos = productos;
  }

  // Getters y Setters
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

  // Método toString mejorado
  @Override
  public String toString() {
    return "Proveedor {" +
            "ID = '" + id + '\'' +
            ", Nombre = '" + nombre + '\'' +
            ", Productos = " + productos +
            '}';
  }
}
