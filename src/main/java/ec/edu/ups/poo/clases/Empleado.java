package ec.edu.ups.poo.clases;
import java.util.List;
public class Empleado extends Persona {

    private Departamento departamento;

    public Empleado() {}

    public Empleado(int id, String nombre, String apellido, String email, List<Direccion> direccion, Departamento departamento) {
        super(id, nombre, apellido, email, direccion);
        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "ID=" + getId() +
                ", Nombre='" + getNombre() + '\'' +
                ", Apellido='" + getApellido() + '\'' +
                ", Email='" + getEmail() + '\'' +
                ", Direccion=" + getDireccion() +
                ", Departamento=" + departamento +
                '}';
    }
}
