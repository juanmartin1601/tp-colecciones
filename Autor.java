public class Autor {
    // Atributos privados
    private String id;
    private String nombre;
    private String nacionalidad;
    
    // Constructor
    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    
    // Getters
    public String getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getNacionalidad() {
        return nacionalidad;
    }
    
    // Setters
    public void setId(String id) {
        this.id = id;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Autor: " + nombre + " (ID: " + id + ") - " + nacionalidad);
    }
}