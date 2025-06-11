package org.example.Modelos;

import java.util.List;

public class Cliente extends Persona {
    private String telefono;
    private List<Vehiculo> vehiculos;

    public Cliente(String DNI, String nombre, String pape) {
        super(DNI, nombre, pape);
    }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public List<Vehiculo> getVehiculos() { return vehiculos; }
    public void setVehiculos(List<Vehiculo> vehiculos) { this.vehiculos = vehiculos; }


    @Override
    public String toString() {
        return "Cliente{" +
                "telefono='" + telefono + '\'' +
                ", vehiculos=" + vehiculos +
                '}';
    }

    @Override
    public String identificarte() {
        return "Cliente: " + getNombre() + " " + getPape();
    }
}

