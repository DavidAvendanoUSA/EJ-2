package Reservas; 

public class Inscripcion {
    private Estudiante estudiante;
    private Proyecto proyecto;
    private Programa programa;
    private Fecha fechaInscripcion;

    public Inscripcion(Estudiante estudiante, Proyecto proyecto, Programa programa, Fecha fechaInscripcion) {
        this.estudiante = estudiante;
        this.proyecto = proyecto;
        this.programa = programa;
        this.fechaInscripcion = fechaInscripcion;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public Programa getPrograma() {
        return programa;
    }

    public Fecha getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    public void setFechaInscripcion(Fecha fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }


}
