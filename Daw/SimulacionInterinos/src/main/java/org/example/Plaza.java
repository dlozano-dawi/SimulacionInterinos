package org.example;

public class Plaza {
    private int id;
    private char tipo;
    private boolean adjudicada = false;
    private Persona persona;

    public Plaza(int id, char tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
        adjudicada = true;
    }

    public char getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        if (this.persona != null) {
            return "Plazas{" +
                    "id=" + id +
                    ", tipo=" + tipo +
                    ", adjudicada=" + adjudicada +
                    ", persona=" + persona +
                    '}';
        } else {
            return "Plazas{" +
                    "id=" + id +
                    ", tipo=" + tipo +
                    ", adjudicada=" + adjudicada +
                    '}';
        }
    }

    public void setAdjudicada(boolean adjudicada) {
        this.adjudicada = adjudicada;
    }
}
