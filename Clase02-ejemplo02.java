public class Circulo {
    private double radio;

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setRadio(5.0);
        System.out.println("El área del círculo es: " + circulo.calcularArea());
    }
}


