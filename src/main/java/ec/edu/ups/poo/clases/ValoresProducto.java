package ec.edu.ups.poo.clases;

public class ValoresProducto extends Producto {
    private String iva;
    private String descuento;

    public ValoresProducto(String iva, String descuento) {
        this.iva = iva;
        this.descuento = descuento;
    }
    public ValoresProducto() {}

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "ValoresProducto{" +
                "iva='" + iva + '\'' +
                ", descuento='" + descuento + '\'' +
                '}';
    }
}
