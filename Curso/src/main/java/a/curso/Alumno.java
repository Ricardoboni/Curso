public class Alumno {
    private static int contadorAlumnos = 1;
    private final int carnet;

    public Alumno() {
        this.carnet = contadorAlumnos++;
    }

    public void imprimirDatos() {
        System.out.println("Alumno #" + carnet);
    }
}
