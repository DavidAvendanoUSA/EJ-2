package Reservas; 

import java.util.ArrayList;
import java.util.List;

public class Evento {
    private List<Inscripcion> inscripciones;

    public Evento() {
        this.inscripciones = new ArrayList<>();
    }

    public void agregarInscripcion(Inscripcion inscripcion) {
        inscripciones.add(inscripcion);
    }

    public List<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    public void setInscripciones(List<Inscripcion> inscripciones) {
        this.inscripciones = inscripciones;
    }
    
}
