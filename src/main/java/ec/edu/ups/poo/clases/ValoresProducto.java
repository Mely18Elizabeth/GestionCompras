package ec.edu.ups.poo.clases;

public class ValoresProducto {
    private double iva;
    private double descuento;

    public ValoresProducto(double iva, double descuento) {
        this.iva = iva;
        this.descuento = descuento;
    }

    public ValoresProducto() {}

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "ValoresProducto{" +
                "iva=" + iva +
                ", descuento=" + descuento +
                '}';
    }
}
