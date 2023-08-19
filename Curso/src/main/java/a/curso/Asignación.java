public class Asignación {
    private Alumno alumno;
    private Curso curso;

    public Asignación(Alumno alumno, Curso curso) {
        this.alumno = alumno;
        this.curso = curso;
    }

    public void imprimirDatos() {
        System.out.println("Asignación - Alumno: #" + alumno.getCarnet() + ", Curso: " + curso.getNombre());
    }
}
