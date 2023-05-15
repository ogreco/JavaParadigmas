/*
En este ejemplo, la clase Vehiculo tiene como atributos una marca, un modelo y un año,
y dos métodos de comportamiento que todos los vehículos pueden realizar: acelerar y frenar. 
La clase Coche y la clase Moto heredan de la clase Vehiculo y añaden sus propios atributos y comportamientos. 
En el método main, creamos un objeto de cada subclase y llamamos a sus respectivos métodos.
*/


public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public void acelerar() {
        System.out.println("El vehículo está acelerando");
    }

    public void frenar() {
        System.out.println("El vehículo está frenando");
    }
}

public class Coche extends Vehiculo {
    private int numPuertas;

    public Coche(String marca, String modelo, int año, int numPuertas) {
        super(marca, modelo, año);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void encenderLuces() {
        System.out.println("Encendiendo las luces del coche");
    }
}

public class Moto extends Vehiculo {
    private boolean tieneCasco;

    public Moto(String marca, String modelo, int año, boolean tieneCasco) {
        super(marca, modelo, año);
        this.tieneCasco = tieneCasco;
    }

    public boolean getTieneCasco() {
        return tieneCasco;
    }

    public void ponerCasco() {
        System.out.println("Poniéndose el casco para andar en moto");
    }
}

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Ford", "Focus", 2021, 4);
        Moto moto = new Moto("Harley Davidson", "Iron 883", 2020, true);
        System.out.println("Marca del coche: " + coche.getMarca());
        System.out.println("Número de puertas del coche: " + coche.getNumPuertas());
        System.out.println("Marca de la moto: " + moto.getMarca());
        System.out.println("¿Tiene casco la moto?: " + moto.getTieneCasco());
    }
}
