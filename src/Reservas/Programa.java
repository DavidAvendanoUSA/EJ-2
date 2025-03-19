package Reservas; // Asegurar que pertenece al paquete correcto

public class Programa {
    private int codProg;
    private String nombreProg;
    private String facultad;

    public Programa(int codProg, String nombreProg, String facultad) {
        this.codProg = codProg;
        this.nombreProg = nombreProg;
        this.facultad = facultad;
    }

    public int getCodProg() {
        return codProg;
    }

    public String getNombreProg() {
        return nombreProg;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setCodProg(int codProg) {
        this.codProg = codProg;
    }

    public void setNombreProg(String nombreProg) {
        this.nombreProg = nombreProg;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }


}
