package org.example;

public abstract class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private String segundoApellido;
    private static int contador = 0;

    public Persona(){}

    public Persona(String nombre, String apellido, String segundoApellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        contador++;
        this.id = contador;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                '}';
    }
}
