/*
En este ejemplo, la clase Animal tiene como atributos un nombre, una edad y un tipo de alimentación,
y un método de comportamiento que todos los animales pueden realizar:
emitir un sonido. La clase Perro y la clase Gato heredan de la clase Animal y añaden sus propios atributos y comportamientos.
En el método main, creamos un objeto de cada subclase y llamamos a sus respectivos métodos.
*/

public class Animal {
    private String nombre;
    private int edad;
    private String tipoAlimentacion;

    public Animal(String nombre, int edad, String tipoAlimentacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void emitirSonido() {
        System.out.println("El animal emite un sonido

                               }
}

public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, int edad, String tipoAlimentacion, String raza) {
        super(nombre, edad, tipoAlimentacion);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void moverCola() {
        System.out.println("El perro mueve la cola");
    }
}

public class Gato extends Animal {
    private boolean tieneRatones;

    public Gato(String nombre, int edad, String tipoAlimentacion, boolean tieneRatones) {
        super(nombre, edad, tipoAlimentacion);
        this.tieneRatones = tieneRatones;
    }

    public boolean getTieneRatones() {
        return tieneRatones;
    }

    public void maullar() {
        System.out.println("El gato está maullando");
    }
}

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Fido", 3, "Croquetas", "Labrador");
        Gato gato = new Gato("Garfield", 5, "Pescado", true);
        System.out.println("Nombre del perro: " + perro.getNombre());
        System.out.println("Raza del perro: " + perro.getRaza());
        System.out.println("Nombre del gato: " + gato.getNombre());
        System.out.println("¿El gato tiene ratones?: " + gato.getTieneRatones());
    }
}
