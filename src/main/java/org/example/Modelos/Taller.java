package org.example.Modelos;
import java.util.List;

public class Taller {
    private String nombre;
    private String direccion;
    private Propietario propietario;
    private List<Cliente> clientes;

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public Propietario getPropietario() { return propietario; }
    public void setPropietario(Propietario propietario) { this.propietario = propietario; }

    public List<Cliente> getClientes() { return clientes; }
    public void setClientes(List<Cliente> clientes) { this.clientes = clientes; }

    @Override
    public String toString() {
        return "Taller{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", propietario=" + propietario +
                ", clientes=" + clientes +
                '}';
    }
}

