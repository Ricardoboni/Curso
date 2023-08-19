public class Curso {
    private String nombre;
    private int cupoMaximo;

    public Curso(String nombre, int cupoMaximo) {
        this.nombre = nombre;
        this.cupoMaximo = cupoMaximo;
    }

    public void imprimirDatos() {
        System.out.println("Curso: " + nombre + " - Cupo máximo: " + cupoMaximo);
    }

    public boolean verificaEspacio() {
        // Lógica para verificar si hay cupo en el curso
        return true; // Cambiar esto según tu lógica
    }
}
