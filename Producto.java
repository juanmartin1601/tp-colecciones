public class Producto {
    // Atributos privados (encapsulamiento)
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;
    
    // Constructor
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    
    // Getters
    public String getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    public CategoriaProducto getCategoria() {
        return categoria;
    }
    
    // Setters
    public void setId(String id) {
        this.id = id;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void setCategoria(CategoriaProducto categoria) {
        this.categoria = categoria;
    }
    
    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("ID: " + id + " | Nombre: " + nombre + 
                         " | Precio: $" + precio + " | Stock: " + cantidad + 
                         " | Categoría: " + categoria + " (" + categoria.getDescripcion() + ")");
    }
}