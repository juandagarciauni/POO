package POO.semana6;

public class Estudiante2 {

    // Atributos privados
    private String nombre;
    private String documento;
    private int edad;
    private String correo;
    private String programa;
    private int semestre;

    // Límites usados en las validaciones
    private static final int SEMESTRE_MIN = 1;
    private static final int SEMESTRE_MAX = 10;

    // Constructor con todos los atributos.
    // Se usan los setters para que las validaciones también se apliquen al crear el objeto.
    public Estudiante2(String nombre, String documento, int edad, String correo, String programa, int semestre) {
        setNombre(nombre);
        this.documento = documento;
        setEdad(edad);
        setCorreo(correo);
        this.programa = programa;
        setSemestre(semestre);
    }

    // ===== Getters =====
    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public int getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPrograma() {
        return programa;
    }

    public int getSemestre() {
        return semestre;
    }

    // ===== Setters (con validaciones) =====
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre inválido: no puede estar vacío");
        }
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 120) {
            this.edad = edad;
        } else {
            System.out.println("Edad inválida: " + edad);
        }
    }

    public void setCorreo(String correo) {
        if (correo != null && correo.contains("@")) {
            this.correo = correo;
        } else {
            System.out.println("Correo inválido: " + correo);
        }
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public void setSemestre(int semestre) {
        if (semestre >= SEMESTRE_MIN && semestre <= SEMESTRE_MAX) {
            this.semestre = semestre;
        } else {
            System.out.println("Semestre inválido: " + semestre);
        }
    }

    // ===== Métodos de comportamiento =====
    public void estudiar() {
        System.out.println(nombre + " está estudiando " + programa + ".");
    }

    public void avanzarSemestre() {
        if (semestre < SEMESTRE_MAX) {
            semestre++;
            System.out.println(nombre + " avanzó al semestre " + semestre);
        } else {
            System.out.println(nombre + " ya está en el último semestre");
        }
    }

    // Reto adicional
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    // Se considera activo si tiene un semestre válido (entre 1 y 10)
    public boolean esEstudianteActivo() {
        return semestre >= SEMESTRE_MIN && semestre <= SEMESTRE_MAX;
    }

    // ===== toString =====
    @Override
    public String toString() {
        return "Estudiante [nombre: " + nombre + ", documento: " + documento + ", edad: " + edad
                + ", correo: " + correo + ", programa: " + programa + ", semestre: " + semestre + "]";
    }
}
