package ec.edu.ups.poo.clases;

public class Empleado {
    private Departamento departamento;

    public Empleado(Departamento departamento) {}
    public Empleado(){}

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
