public class Main {
    public static void main(String[] args) {
        Catedrático catedratico1 = new Catedrático();
        Alumno alumno1 = new Alumno();
        Curso curso1 = new Curso("Curso 1", 5);
        Curso curso2 = new Curso("Curso 2", 2);
        Asignación asignacion1 = new Asignación(alumno1, curso1);
        Asignación asignacion2 = new Asignación(alumno1, curso2);

        catedratico1.imprimirDatos();
        alumno1.imprimirDatos();
        curso1.imprimirDatos();
        curso2.imprimirDatos();
        asignacion1.imprimirDatos();
        asignacion2.imprimirDatos();
    }
}
