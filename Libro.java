public class Libro {
    // Atributos privados
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;
    
    // Constructor
    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }
    
    // Getters
    public String getIsbn() {
        return isbn;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    
    public Autor getAutor() {
        return autor;
    }
    
    // Setters
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("ISBN: " + isbn + " | Título: " + titulo + 
                         " | Año: " + anioPublicacion + " | Autor: " + autor.getNombre());
    }
}