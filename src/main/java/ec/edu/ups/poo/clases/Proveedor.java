package ec.edu.ups.poo.clases;

import ec.edu.ups.poo.enums.Estado;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Proveedor {
    private List<Producto> productos;

    public Proveedor() {
        productos = new ArrayList<>();
    }
    public Proveedor(List<Producto> productos) {
        this.productos = productos;
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
                "productos=" + productos +
                '}';
    }
}
