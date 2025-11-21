import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Biblioteca {
    // Atributos
    private String nombre;
    private List<LibroBiblioteca> libros;
    
    // Constructor
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    
    // Agregar libro (composición: el libro se crea aquí)
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        LibroBiblioteca nuevoLibro = new LibroBiblioteca(isbn, titulo, anioPublicacion, autor);
        libros.add(nuevoLibro);
        System.out.println("Libro agregado: " + titulo);
    }
    
    // Listar todos los libros
    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
        
        System.out.println("\n=== CATÁLOGO DE " + nombre + " ===");
        for (LibroBiblioteca libro : libros) {
            libro.mostrarInfo();
        }
    }
    
    // Buscar libro por ISBN
    public LibroBiblioteca buscarLibroPorIsbn(String isbn) {
        for (LibroBiblioteca libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }
    
    // Eliminar libro por ISBN
    public void eliminarLibro(String isbn) {
        LibroBiblioteca libro = buscarLibroPorIsbn(isbn);
        if (libro != null) {
            libros.remove(libro);
            System.out.println("Libro eliminado: " + libro.getTitulo());
        } else {
            System.out.println("Libro con ISBN " + isbn + " no encontrado.");
        }
    }
    
    // Obtener cantidad de libros
    public int obtenerCantidadLibros() {
        return libros.size();
    }
    
    // Filtrar libros por año de publicación
    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("\n=== LIBROS PUBLICADOS EN " + anio + " ===");
        boolean encontrado = false;
        
        for (LibroBiblioteca libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("No hay libros publicados en ese año.");
        }
    }
    
    // Mostrar autores disponibles (sin repetir)
    public void mostrarAutoresDisponibles() {
        System.out.println("\n=== AUTORES EN LA BIBLIOTECA ===");
        Set<String> autoresUnicos = new HashSet<>();
        
        for (LibroBiblioteca libro : libros) {
            String nombreAutor = libro.getAutor().getNombre();
            if (!autoresUnicos.contains(nombreAutor)) {
                autoresUnicos.add(nombreAutor);
                libro.getAutor().mostrarInfo();
            }
        }
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
}