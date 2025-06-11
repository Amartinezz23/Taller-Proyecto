package org.example.Modelos;

public class Moto extends Vehiculo {
    private boolean limitador;

    public boolean getLimitador() { return limitador; }
    public void setLimitador(boolean limitador) { this.limitador = limitador; }

    public Moto(String matricula, String marca, String modelo, boolean limitador) {
        super(matricula, marca, modelo);
        this.limitador = limitador;
    }
}

