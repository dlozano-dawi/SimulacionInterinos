package org.example;

public abstract class Astros {
    private double radio;
    private double rotacion;
    private double masa;
    private double temperatura;
    private double gravedad;

    public Astros(double radio, double rotacion, double masa, double temperatura, double gravedad) {
        this.radio = radio;
        this.rotacion = rotacion;
        this.masa = masa;
        this.temperatura = temperatura;
        this.gravedad = gravedad;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRotacion() {
        return rotacion;
    }

    public void setRotacion(double rotacion) {
        this.rotacion = rotacion;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getGravedad() {
        return gravedad;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }

    @Override
    public String toString() {
        return "Astros{" +
                "radio=" + radio +
                ", rotacion=" + rotacion +
                ", masa=" + masa +
                ", temperatura=" + temperatura +
                ", gravedad=" + gravedad +
                '}';
    }
}
