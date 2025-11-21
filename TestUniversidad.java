public class TestUniversidad {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA ACADÉMICO UNIVERSITARIO ===\n");
        
        // Crear universidad
        Universidad utn = new Universidad("Universidad Tecnológica Nacional");
        System.out.println("Universidad creada: " + utn.getNombre() + "\n");
        
        // 1. Crear 3 profesores
        System.out.println("--- 1. CREANDO PROFESORES ---");
        Profesor prof1 = new Profesor("P001", "Dr. Juan Pérez", "Programación");
        Profesor prof2 = new Profesor("P002", "Dra. María García", "Matemáticas");
        Profesor prof3 = new Profesor("P003", "Ing. Carlos López", "Física");
        
        // 2. Agregar profesores y cursos a la universidad
        System.out.println("\n--- 2. AGREGANDO A LA UNIVERSIDAD ---");
        utn.agregarProfesor(prof1);
        utn.agregarProfesor(prof2);
        utn.agregarProfesor(prof3);
        
        System.out.println();
        Curso curso1 = new Curso("C001", "Programación I");
        Curso curso2 = new Curso("C002", "Programación II");
        Curso curso3 = new Curso("C003", "Álgebra");
        Curso curso4 = new Curso("C004", "Análisis Matemático");
        Curso curso5 = new Curso("C005", "Física I");
        
        utn.agregarCurso(curso1);
        utn.agregarCurso(curso2);
        utn.agregarCurso(curso3);
        utn.agregarCurso(curso4);
        utn.agregarCurso(curso5);
        
        // 3. Asignar profesores a cursos
        System.out.println("\n--- 3. ASIGNANDO PROFESORES A CURSOS ---");
        utn.asignarProfesorACurso("C001", "P001");
        utn.asignarProfesorACurso("C002", "P001");
        utn.asignarProfesorACurso("C003", "P002");
        utn.asignarProfesorACurso("C004", "P002");
        utn.asignarProfesorACurso("C005", "P003");
        
        // 4. Listar cursos y profesores
        utn.listarCursos();
        utn.listarProfesores();
        
        // 5. Cambiar profesor de un curso
        System.out.println("\n--- 5. CAMBIANDO PROFESOR DE UN CURSO ---");
        System.out.println("Cambiando profesor de Programación II...");
        utn.asignarProfesorACurso("C002", "P003");
        utn.listarCursos();
        utn.listarProfesores();
        
        // 6. Remover un curso
        System.out.println("\n--- 6. ELIMINANDO UN CURSO ---");
        utn.eliminarCurso("C005");
        utn.listarCursos();
        utn.listarProfesores();
        
        // 7. Remover un profesor
        System.out.println("\n--- 7. ELIMINANDO UN PROFESOR ---");
        utn.eliminarProfesor("P002");
        utn.listarCursos();
        utn.listarProfesores();
        
        // 8. Mostrar reporte
        System.out.println("\n--- 8. REPORTE FINAL ---");
        utn.mostrarReporteCursosPorProfesor();
    }
}