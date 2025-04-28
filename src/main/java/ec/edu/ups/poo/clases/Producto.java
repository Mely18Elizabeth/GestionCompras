package ec.edu.ups.poo.clases;

public class Producto {
  private String codigo;
  private String nombre;
  private String descripcion;
  private double precio;
  private ValoresProducto valores;

  public Producto(String codigo, String nombre, String descripcion, double precio, ValoresProducto valores) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.precio = precio;
    this.valores = valores;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }


  public ValoresProducto getValores() {
    return valores;
  }

  public void setValores(ValoresProducto valores) {
    this.valores = valores;
  }

  @Override
  public String toString() {
    return "Producto{" +
            "codigo='" + codigo + '\'' +
            ", nombre='" + nombre + '\'' +
            ", descripcion='" + descripcion + '\'' +
            ", precio=" + precio +
            ", valores=" + valores +
            '}';
  }
}
