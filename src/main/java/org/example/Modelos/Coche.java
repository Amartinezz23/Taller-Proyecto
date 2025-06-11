package org.example.Modelos;

public class Coche extends Vehiculo {
    private int anchura;
    private int altura;

    public int getAnchura() { return anchura; }
    public void setAnchura(int anchura) { this.anchura = anchura; }

    public int getAltura() { return altura; }
    public void setAltura(int altura) { this.altura = altura; }

    public Coche(String matricula, String marca, String modelo, int anchura, int altura) {
        super(matricula, marca, modelo);
        this.anchura = anchura;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "anchura=" + anchura +
                ", altura=" + altura +
                '}';
    }
}
