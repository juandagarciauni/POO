package POO.semana6;

public class EjecutarEstudiante2 {
    public static void main(String[] args) {

        // Creación de cinco objetos
        Estudiante2 est1 = new Estudiante2("Ana", "1001", 18, "ana@correo.com", "Ingeniería de Sistemas", 2);
        Estudiante2 est2 = new Estudiante2("Carlos", "1002", 17, "carlos@correo.com", "Contaduría", 1);
        Estudiante2 est3 = new Estudiante2("Laura", "1003", 21, "laura@correo.com", "Psicología", 5);
        Estudiante2 est4 = new Estudiante2("Miguel", "1004", 23, "miguel@correo.com", "Derecho", 10);
        Estudiante2 est5 = new Estudiante2("Sofía", "1005", 19, "sofia@correo.com", "Medicina", 3);

        // Estado inicial
        System.out.println("=== Estado inicial ===");
        System.out.println(est1);
        System.out.println(est2);
        System.out.println(est3);
        System.out.println(est4);
        System.out.println(est5);

        // Métodos de comportamiento
        System.out.println("\n=== Comportamientos ===");
        est1.estudiar();
        est1.avanzarSemestre();
        est4.avanzarSemestre(); // ya está en semestre 10, no debe avanzar

        // Modificaciones con setters: valores válidos
        System.out.println("\n=== Cambios válidos ===");
        System.out.println("Edad de Carlos antes: " + est2.getEdad());
        est2.setEdad(18);
        System.out.println("Edad de Carlos después: " + est2.getEdad());

        System.out.println("Programa de Laura antes: " + est3.getPrograma());
        est3.setPrograma("Ingeniería Industrial");
        System.out.println("Programa de Laura después: " + est3.getPrograma());

        // Modificaciones con setters: valores inválidos (no deben cambiar nada)
        System.out.println("\n=== Cambios inválidos ===");
        est5.setEdad(-4);
        est5.setSemestre(15);
        est5.setNombre("");
        est5.setCorreo("sofiacorreo.com");
        System.out.println("Sofía sigue igual: " + est5);

        // Reto adicional
        System.out.println("\n=== Reto adicional ===");
        System.out.println(est2.getNombre() + " es mayor de edad: " + est2.esMayorDeEdad());
        System.out.println(est4.getNombre() + " es estudiante activo: " + est4.esEstudianteActivo());

        // Estado final
        System.out.println("\n=== Estado final ===");
        System.out.println(est1);
        System.out.println(est2);
        System.out.println(est3);
        System.out.println(est4);
        System.out.println(est5);
    }
}