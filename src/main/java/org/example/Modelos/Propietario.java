package org.example.Modelos;

public class Propietario extends Persona {
    private String direccion;

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    @Override
    public String identificarte() {
        return "Propietario: " + getNombre() + " " + getPape();
    }
}

