package org.example.Modelos;

public class Persona implements Identificacion {
    private String DNI;
    private String nombre;
    private String pape;

    // Getters y setters
    public String getDNI() { return DNI; }
    public void setDNI(String DNI) { this.DNI = DNI; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPape() { return pape; }
    public void setPape(String pape) { this.pape = pape; }



    public Persona(String DNI, String nombre, String pape) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.pape = pape;
    }

    @Override
    public String identificarte() {
        return String.format("Hola soy una persona");
    }

    @Override
    public String toString() {
        return "Persona{" +
                "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", pape='" + pape + '\'' +
                '}';
    }
}

