class Estudiante2 {
    private String nombre;
    private String codigo;
    private int edad;
    private String correo;
    private String programa;
    private int semestre;

    public Estudiante2(String nombre, String codigo, int edad, String correo, String programa, int semestre) {
        setNombre(nombre);
        setCodigo(codigo);
        setEdad(edad);
        setCorreo(correo);
        setPrograma(programa);
        setSemestre(semestre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre.trim();
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.trim().isEmpty()) {
            this.codigo = codigo.trim();
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (correo != null && correo.contains("@") && correo.contains(".")) {
            this.correo = correo.trim();
        }
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        if (programa != null && !programa.trim().isEmpty()) {
            this.programa = programa.trim();
        }
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        if (semestre >= 1 && semestre <= 10) {
            this.semestre = semestre;
        }
    }

    public void estudiar() {
        System.out.println(nombre + " está estudiando en " + programa + ".");
    }

    public void avanzarSemestre() {
        if (semestre < 10) {
            semestre++;
            System.out.println(nombre + " avanzó al semestre " + semestre + ".");
        } else {
            System.out.println(nombre + " ya está en el último semestre.");
        }
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public boolean esEstudianteActivo() {
        return semestre >= 1 && semestre <= 10;
    }

    @Override
    public String toString() {
        return "Estudiante2{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", edad=" + edad +
                ", correo='" + correo + '\'' +
                ", programa='" + programa + '\'' +
                ", semestre=" + semestre +
                '}';
    }
}

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