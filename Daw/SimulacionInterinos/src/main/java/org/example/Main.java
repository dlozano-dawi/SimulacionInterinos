package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        simularAdjudicacion();
    }

    public static void mostrarAdjudicaciones(ArrayList<Plaza> plazas) {
        for (Plaza plaza : plazas) {
            if (plaza.getTipo() == 'S') {
                System.out.println(plaza);
            }
        }for (Plaza plaza : plazas) {
            if (plaza.getTipo() == 'D') {
                System.out.println(plaza);
            }
        }
    }
    public static ArrayList<Plaza> adjudicarPlazas(ArrayList<Plaza> plazas, ArrayList<Persona> personas) {
        ArrayList<Docente> docentes = new ArrayList<>();
        ArrayList<Sanitario> sanitarios = new ArrayList<>();

        for (Persona persona : personas) {
            if (persona instanceof Docente) {
                docentes.add((Docente) persona);
            } else {
                sanitarios.add((Sanitario) persona);
            }
        }

        docentes.sort(Comparator.comparingDouble(Docente::getPuntos));
        Collections.reverse(docentes);
        sanitarios.sort(Comparator.comparingInt(Sanitario::getDias));
        Collections.reverse(sanitarios);

        for (Plaza plaza : plazas) {
            if (plaza.getTipo() == 'D' && docentes.size() >= 0) {
                plaza.setPersona(docentes.getFirst());
                plaza.setAdjudicada(true);
                docentes.removeFirst();
            } else if (plaza.getTipo() == 'S' && sanitarios.size() >= 0) {
                plaza.setPersona(sanitarios.getFirst());
                plaza.setAdjudicada(true);
                sanitarios.removeFirst();
            }
            if (docentes.isEmpty() && sanitarios.isEmpty()) {
                break;
            }
        }
        return plazas;
    }

    public static void simularAdjudicacion() {
        ArrayList<Plaza> listaPlaza = new ArrayList<>();
        Plaza plazaPalma = new Plaza(0,'D');
        Plaza plazaCiutadella = new Plaza(1,'S');
        Plaza plazaInca = new Plaza(2,'D');
        Plaza plazaMahon = new Plaza(3,'S');
        Plaza plazaMuro = new Plaza(4,'D');
        Plaza plazaLlubi = new Plaza(5,'S');
        Plaza plazaSineu = new Plaza(6,'D');
        Plaza plazaSaPobla = new Plaza(7,'S');
        Plaza plazaFormentera = new Plaza(8,'D');
        Plaza plazaMarratxi = new Plaza(9,'S');

        listaPlaza.add(plazaPalma);
        listaPlaza.add(plazaCiutadella);
        listaPlaza.add(plazaInca);
        listaPlaza.add(plazaMahon);
        listaPlaza.add(plazaMuro);
        listaPlaza.add(plazaLlubi);
        listaPlaza.add(plazaSineu);
        listaPlaza.add(plazaSaPobla);
        listaPlaza.add(plazaFormentera);
        listaPlaza.add(plazaMarratxi);

        ArrayList<Persona> listaPersona = new ArrayList<>();

        Docente jaumeBarcelo = new Docente("Doctor", 2.4, "Jaume","Barceló","Vicenç");
        Docente marcCosta = new Docente("Máster",  3.2, "Marc","Costa","Marquez");
        Docente maximoFernandez = new Docente("Grado", 2.7, "Máximo","Fernández","Riera");
        Sanitario franciscaOliver = new Sanitario("Grado", 13, "Francisca","Oliver","Sanz");
        Sanitario margaritaRobles = new Sanitario("Master", 7, "Margarita","Robles","Perez");
        Sanitario paulaSanchez = new Sanitario("Doctor", 31, "Paula","Sanchez","Aguirre");

        listaPersona.add(jaumeBarcelo);
        listaPersona.add(marcCosta);
        listaPersona.add(maximoFernandez);
        listaPersona.add(franciscaOliver);
        listaPersona.add(margaritaRobles);
        listaPersona.add(paulaSanchez);

        listaPlaza = adjudicarPlazas(listaPlaza, listaPersona);
        mostrarAdjudicaciones(listaPlaza);
    }
}