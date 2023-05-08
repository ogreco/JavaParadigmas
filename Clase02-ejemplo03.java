public class Alumno {
    private String nombre;
    private double calificacion;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("Juan");
        alumno.setCalificacion(8.5);
        System.out.println("La calificación del alumno " + alumno.getNombre() + " es: " + alumno.getCalificacion());
    }
}
