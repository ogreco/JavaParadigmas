/*
En este ejemplo, la clase abstracta Figura tiene como atributo un área y un método abstracto para calcular el área.
La clase Cuadrado y la clase Circulo heredan de la clase Figura y implementan su propio método 'calcularArea'
En el método main, creamos un objeto de cada subclase y llamamos al método calcularArea() de cada objeto.

*/


public abstract class Figura {
    protected double area;

    public abstract double calcularArea();

    public double getArea() {
        return area;
    }
}

public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        area = lado * lado;
        return area;
    }
}

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        area = Math.PI * Math.pow(radio, 2);
        return area;
    }
}

public class Main {
    public static void main(String[] args) {
        Figura cuadrado = new Cuadrado(5);
        Figura circulo = new Circulo(3);
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Área del círculo: " + circulo.calcularArea());
    }
}
