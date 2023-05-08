public class Rectangulo {
    private double ancho;
    private double alto;

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public double calcularArea() {
        return ancho * alto;
    }

    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setAncho(5.0);
        rectangulo.setAlto(10.0);
        System.out.println("El área del rectángulo es: " + rectangulo.calcularArea());
    }
}
