package org.example;

public class Docente extends  Persona{
    private String titulacion;
    private double puntos;

    public Docente() {}
    public Docente(String titulacion, double puntos, String nombre, String apellido, String segundoApellido) {
        super(nombre, apellido, segundoApellido);
        this.titulacion = titulacion;
        this.puntos = puntos;
    }

    public double getPuntos() {
        return puntos;
    }

    @Override
    public String toString() {
        return "Docentes{" +
                super.toString() +
                "titulacion='" + titulacion + '\'' +
                ", puntos=" + puntos +
                '}';
    }
}
