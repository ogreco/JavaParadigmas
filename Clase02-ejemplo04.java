public class Libro {
    private String titulo;
    private String autor;
    private String editorial;
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getEditorial() {
        return editorial;
    }
    
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.setTitulo("Harry Potter y la Piedra Filosofal");
        libro.setAutor("J.K. Rowling");
        libro.setEditorial("Salamandra");
        
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Editorial: " + libro.getEditorial());
    }
}
