package org.example;
public class Satelite extends Astros{
    private double distanciaAlPlaneta;
    private double orbita;
    private Planetas planeta;

    public Satelite(double radio, double rotacion, double masa, double temperatura, double gravedad, double distanciaAlPlaneta, double orbita, Planetas planeta) {
        super(radio, rotacion, masa, temperatura, gravedad);
        this.distanciaAlPlaneta = distanciaAlPlaneta;
        this.orbita = orbita;
        this.planeta = planeta;
    }

    public double getDistanciaAlPlaneta() {
        return distanciaAlPlaneta;
    }

    public void setDistanciaAlPlaneta(double distanciaAlPlaneta) {
        this.distanciaAlPlaneta = distanciaAlPlaneta;
    }

    public double getOrbita() {
        return orbita;
    }

    public void setOrbita(double orbita) {
        this.orbita = orbita;
    }

    public Planetas getPlaneta() {
        return planeta;
    }

    public void setPlaneta(Planetas planeta) {
        this.planeta = planeta;
    }

    @Override
    public String toString() {
        return "Satelites{" +
                "distanciaAlPlaneta=" + distanciaAlPlaneta +
                ", orbita=" + orbita +
                ", planeta=" + planeta +
                ", radio=" + super.getRadio() +
                ", rotacion=" + super.getRotacion() +
                ", masa=" + super.getMasa() +
                ", temperatura=" + super.getTemperatura() +
                ", gravedad=" + super.getGravedad() +
                '}';
    }
}
