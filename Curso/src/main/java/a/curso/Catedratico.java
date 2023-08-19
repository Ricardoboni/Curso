public class Catedrático {
    private static int contadorCatedráticos = 1;
    private int númeroCatedrático;

    public Catedrático() {
        this.númeroCatedrático = contadorCatedráticos++;
    }

    public void imprimirDatos() {
        System.out.println("Catedrático #" + númeroCatedrático);
    }
}
