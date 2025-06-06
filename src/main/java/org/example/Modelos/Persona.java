package org.example.Modelos;

public abstract class Persona implements Identificacion {
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

    // Método de identificación (puede ser abstracto si cada subclase lo implementa)
    public abstract String identificarte();
}

