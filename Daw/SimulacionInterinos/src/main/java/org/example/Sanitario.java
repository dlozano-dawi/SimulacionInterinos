package org.example;

public class Sanitario extends Persona{
    private String especialidad;
    private int dias;

    public Sanitario(){}
    public Sanitario(String especialidad, int dias, String nombre, String apellido, String segundoApellido){
        super(nombre, apellido, segundoApellido);
        this.especialidad = especialidad;
        this.dias = dias;
    }

    public int getDias() {
        return dias;
    }

    @Override
    public String toString() {
        return "Sanitarios{" +
                super.toString() +
                "especialidad='" + especialidad + '\'' +
                ", dias=" + dias +
                '}';
    }
}
