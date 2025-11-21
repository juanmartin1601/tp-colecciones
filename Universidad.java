import java.util.ArrayList;
import java.util.List;

public class Universidad {
    // Atributos
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;
    
    // Constructor
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
    
    // Agregar profesor
    public void agregarProfesor(Profesor p) {
        profesores.add(p);
        System.out.println("Profesor agregado: " + p.getNombre());
    }
    
    // Agregar curso
    public void agregarCurso(Curso c) {
        cursos.add(c);
        System.out.println("Curso agregado: " + c.getNombre());
    }
    
    // Asignar profesor a curso
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        
        if (curso != null && profesor != null) {
            curso.setProfesor(profesor);
            System.out.println("Profesor " + profesor.getNombre() + " asignado al curso " + curso.getNombre());
        } else {
            if (curso == null) System.out.println("Curso no encontrado: " + codigoCurso);
            if (profesor == null) System.out.println("Profesor no encontrado: " + idProfesor);
        }
    }
    
    // Listar profesores
    public void listarProfesores() {
        System.out.println("\n=== PROFESORES DE " + nombre + " ===");
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
        } else {
            for (Profesor p : profesores) {
                p.mostrarInfo();
                p.listarCursos();
            }
        }
    }
    
    // Listar cursos
    public void listarCursos() {
        System.out.println("\n=== CURSOS DE " + nombre + " ===");
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos registrados.");
        } else {
            for (Curso c : cursos) {
                c.mostrarInfo();
            }
        }
    }
    
    // Buscar profesor por ID
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }
    
    // Buscar curso por código
    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }
    
    // Eliminar curso
    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            // Romper la relación con el profesor si existe
            if (curso.getProfesor() != null) {
                curso.getProfesor().eliminarCurso(curso);
            }
            cursos.remove(curso);
            System.out.println("Curso eliminado: " + curso.getNombre());
        } else {
            System.out.println("Curso no encontrado: " + codigo);
        }
    }
    
    // Eliminar profesor
    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            // Dejar null los cursos que dictaba
            List<Curso> cursosDelProfesor = new ArrayList<>(profesor.getCursos());
            for (Curso curso : cursosDelProfesor) {
                curso.setProfesor(null);
            }
            profesores.remove(profesor);
            System.out.println("Profesor eliminado: " + profesor.getNombre());
        } else {
            System.out.println("Profesor no encontrado: " + id);
        }
    }
    
    // Mostrar reporte: cantidad de cursos por profesor
    public void mostrarReporteCursosPorProfesor() {
        System.out.println("\n=== REPORTE: CURSOS POR PROFESOR ===");
        for (Profesor p : profesores) {
            System.out.println(p.getNombre() + ": " + p.getCursos().size() + " curso(s)");
        }
    }
    
    // Getter
    public String getNombre() {
        return nombre;
    }
}