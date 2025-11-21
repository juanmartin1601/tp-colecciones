import java.util.ArrayList;
import java.util.List;

public class Profesor {
    // Atributos
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;
    
    // Constructor
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }
    
    // Getters
    public String getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getEspecialidad() {
        return especialidad;
    }
    
    public List<Curso> getCursos() {
        return cursos;
    }
    
    // Agregar curso (sincronización bidireccional)
    public void agregarCurso(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
            // Sincronizar el otro lado si es necesario
            if (curso.getProfesor() != this) {
                curso.setProfesor(this);
            }
        }
    }
    
    // Eliminar curso (sincronización bidireccional)
    public void eliminarCurso(Curso curso) {
        if (cursos.contains(curso)) {
            cursos.remove(curso);
            // Sincronizar el otro lado
            if (curso.getProfesor() == this) {
                curso.setProfesor(null);
            }
        }
    }
    
    // Listar cursos que dicta
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("  No dicta ningún curso actualmente.");
        } else {
            System.out.println("  Cursos que dicta:");
            for (Curso curso : cursos) {
                System.out.println("    - " + curso.getCodigo() + ": " + curso.getNombre());
            }
        }
    }
    
    // Mostrar información del profesor
    public void mostrarInfo() {
        System.out.println("ID: " + id + " | Profesor: " + nombre + 
                         " | Especialidad: " + especialidad + 
                         " | Cursos: " + cursos.size());
    }
}