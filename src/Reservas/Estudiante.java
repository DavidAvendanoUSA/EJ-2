package Reservas; // Asegurar que pertenece al paquete correcto

public class Estudiante {
    private Codigo codigoEstudiante;
    private int id;
    private Nombre nombreEstudiante;
    private Fecha fechaNacimiento;

    public Estudiante(Codigo codigoEstudiante, int id, Nombre nombreEstudiante, Fecha fechaNacimiento) {
        this.codigoEstudiante = codigoEstudiante;
        this.id = id;
        this.nombreEstudiante = nombreEstudiante;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Codigo getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public int getId() {
        return id;
    }

    public Nombre getNombreEstudiante() {
        return nombreEstudiante;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setCodigoEstudiante(Codigo codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombreEstudiante(Nombre nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


}
