package ec.edu.ups.poo.clases;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

//dayanna
public class Persona {
    private String id;
    private String nombre;
    private String apellido;
    private String email;
    private List<Direccion> direccion;

    public Persona() {
        direccion = new ArrayList<>();
    }
    public Persona(String id, String nombre, String apellido, String email, List<Direccion> direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = new ArrayList<>();
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Direccion> getDireccion() {
        return direccion;
    }
    public void setDireccion(List<Direccion> direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", direccion=" + direccion +
                '}';
    }
}
