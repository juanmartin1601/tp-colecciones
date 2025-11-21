public class Curso {
    // Atributos
    private String codigo;
    private String nombre;
    private Profesor profesor;
    
    // Constructor
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }
    
    // Getters
    public String getCodigo() {
        return codigo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public Profesor getProfesor() {
        return profesor;
    }
    
    // Setter bidireccional para profesor
    public void setProfesor(Profesor nuevoProfesor) {
        // Si ya tenía un profesor, quitarse de su lista
        if (this.profesor != null) {
            this.profesor.eliminarCurso(this);
        }
        
        // Asignar el nuevo profesor
        this.profesor = nuevoProfesor;
        
        // Agregar este curso a la lista del nuevo profesor
        if (nuevoProfesor != null && !nuevoProfesor.getCursos().contains(this)) {
            nuevoProfesor.agregarCurso(this);
        }
    }
    
    // Método para mostrar información
    public void mostrarInfo() {
        String nombreProfesor = (profesor != null) ? profesor.getNombre() : "Sin asignar";
        System.out.println("Código: " + codigo + " | Curso: " + nombre + " | Profesor: " + nombreProfesor);
    }
}