class Curso {
    private String codigo;
    private String nombre;
    private int creditos;

    public Curso(String codigo, String nombre, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    @Override
    public String toString() {
        return nombre + " (" + codigo + ", " + creditos + " créditos)";
    }
}

class Estudiante {
    private String nombre;
    private String codigo;
    private int edad;
    private String email;
    private Curso curso;

    public Estudiante(String nombre, String codigo, int edad, String email, Curso curso) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.edad = edad;
        this.email = email;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", edad=" + edad +
                ", email='" + email + '\'' +
                ", curso=" + curso +
                '}';
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso("7308", "POO", 4);
        Curso curso2 = new Curso("7765", "Cálculo Diferencial", 4);

        Estudiante est1 = new Estudiante("Julian", "1110363", 21, "jf@ucc", curso1);
        Estudiante est2 = new Estudiante("Jose", "100643", 19, "jdiaz@ucc", curso1);
        Estudiante est3 = new Estudiante("Juan", "112309", 20, "jp@ucc", curso2);

        System.out.println(est1);
        System.out.println(est2);
        System.out.println(est3);
    }
}
