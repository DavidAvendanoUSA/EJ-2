package Reservas;

public class Main {
    public static void main(String[] args) {
        Fecha fechaNac = new Fecha(15, 6, 2000);
        Codigo codigo = new Codigo(12345, 'A');
        Nombre nombre = new Nombre("Juan", "Pérez");
        Estudiante estudiante = new Estudiante(codigo, 1, nombre, fechaNac);
        Proyecto proyecto = new Proyecto("IA en Educación", "Mejorar el aprendizaje con IA");
        Programa programa = new Programa(101, "Ciencia de la Computación", "Facultad de Ingeniería");
        Fecha fechaInscripcion = new Fecha(1, 3, 2025);
        Inscripcion inscripcion = new Inscripcion(estudiante, proyecto, programa, fechaInscripcion);
        Evento evento = new Evento();
        evento.agregarInscripcion(inscripcion);

        System.out.println("ID: " + estudiante.getId() +
                ", Código: " + estudiante.getCodigoEstudiante().getCodigo() + estudiante.getCodigoEstudiante().getLetra() +
                ", Nombre: " + estudiante.getNombreEstudiante().getNombre() + " " + estudiante.getNombreEstudiante().getApellido() +
                ", Fecha de nacimiento: " + estudiante.getFechaNacimiento().getDia() + "/" +
                                            estudiante.getFechaNacimiento().getMes() + "/" +
                                            estudiante.getFechaNacimiento().getAnio() +
                ", Proyecto: " + proyecto.getNombre() +
                ", Objetivo: " + proyecto.getObjetivo() +
                ", Programa: " + programa.getNombreProg() +
                ", Facultad: " + programa.getFacultad() +
                ", Fecha de inscripción: " + fechaInscripcion.getDia() + "/" +
                                            fechaInscripcion.getMes() + "/" +
                                            fechaInscripcion.getAnio());
    }
}
