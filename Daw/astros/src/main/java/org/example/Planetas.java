package org.example;

import java.util.ArrayList;

public class Planetas extends Astros{
    private double distanciaAlSol;
    private double orbita;
    private boolean tieneSatelites;
    private final ArrayList<Satelite> satelites = new ArrayList<>();
    public Planetas(double radio, double rotacion, double masa, double temperatura, double gravedad, double distancia, double orbita, boolean tieneSatelites) {
        super(radio, rotacion, masa, temperatura, gravedad);
        this.distanciaAlSol = distancia;
        this.orbita = orbita;
        this.tieneSatelites = tieneSatelites;
    }

    public double getDistanciaAlSol() {
        return distanciaAlSol;
    }

    public void setDistanciaAlSol(double distanciaAlSol) {
        this.distanciaAlSol = distanciaAlSol;
    }

    public double getOrbita() {
        return orbita;
    }

    public void setOrbita(double orbita) {
        this.orbita = orbita;
    }
    public boolean getTieneSatelites() {
        return tieneSatelites;
    }

    public void setTieneSatelites(boolean tieneSatelites) {
        this.tieneSatelites = tieneSatelites;
    }

    public ArrayList<Satelite> getSatelites() {
        return satelites;
    }

    public void setSatelites(Satelite satelite) {
        this.satelites.add(satelite);
    }

    @Override
    public String toString() {
        return "Planetas{" +
                "distanciaAlSol=" + distanciaAlSol +
                ", orbita=" + orbita +
                ", satelites=" + satelites +
                ", radio=" + super.getRadio() +
                ", rotacion=" + super.getRotacion() +
                ", masa=" + super.getMasa() +
                ", temperatura=" + super.getTemperatura() +
                ", gravedad=" + super.getGravedad() +
                '}';
    }
}
