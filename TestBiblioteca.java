public class TestBiblioteca {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE BIBLIOTECA ===\n");
        
        // 1. Crear una biblioteca
        System.out.println("--- 1. CREANDO BIBLIOTECA ---");
        Biblioteca biblioteca = new Biblioteca("Biblioteca Municipal");
        System.out.println("Biblioteca creada: " + biblioteca.getNombre() + "\n");
        
        // 2. Crear al menos tres autores
        System.out.println("--- 2. CREANDO AUTORES ---");
        Autor autor1 = new Autor("A001", "Gabriel García Márquez", "Colombiano");
        Autor autor2 = new Autor("A002", "Jorge Luis Borges", "Argentino");
        Autor autor3 = new Autor("A003", "Isabel Allende", "Chilena");
        
        autor1.mostrarInfo();
        autor2.mostrarInfo();
        autor3.mostrarInfo();
        
        // 3. Agregar 5 libros a la biblioteca
        System.out.println("\n--- 3. AGREGANDO LIBROS ---");
        biblioteca.agregarLibro("978-0060883287", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("978-0142437230", "El amor en los tiempos del cólera", 1985, autor1);
        biblioteca.agregarLibro("978-0142180297", "Ficciones", 1944, autor2);
        biblioteca.agregarLibro("978-0060930349", "El Aleph", 1949, autor2);
        biblioteca.agregarLibro("978-1501117015", "La casa de los espíritus", 1982, autor3);
        
        // 4. Listar todos los libros
        biblioteca.listarLibros();
        
        // 5. Buscar un libro por ISBN
        System.out.println("\n--- 5. BÚSQUEDA POR ISBN ---");
        LibroBiblioteca encontrado = biblioteca.buscarLibroPorIsbn("978-0142180297");
        if (encontrado != null) {
            System.out.println("Libro encontrado:");
            encontrado.mostrarInfo();
        }
        
        // 6. Filtrar libros por año
        System.out.println("\n--- 6. FILTRO POR AÑO ---");
        biblioteca.filtrarLibrosPorAnio(1949);
        
        // 7. Eliminar un libro
        System.out.println("\n--- 7. ELIMINANDO LIBRO ---");
        biblioteca.eliminarLibro("978-0060930349");
        biblioteca.listarLibros();
        
        // 8. Mostrar cantidad de libros
        System.out.println("\n--- 8. CANTIDAD DE LIBROS ---");
        System.out.println("Total de libros en la biblioteca: " + biblioteca.obtenerCantidadLibros());
        
        // 9. Mostrar autores disponibles
        System.out.println("\n--- 9. AUTORES DISPONIBLES ---");
        biblioteca.mostrarAutoresDisponibles();
    }
}