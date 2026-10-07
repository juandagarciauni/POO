package POO.semana6;

public class Estudiante {

    // Atributos de la clase
    private String nombre;
    private String documento;
    private int edad;
    private String programa;

    // Constructor
    public Estudiante(String nombre, String documento, int edad, String programa) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.programa = programa;
    }

    // Getters (se usan para imprimir cada atributo por separado y comparar)
    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public int getEdad() {
        return edad;
    }

    public String getPrograma() {
        return programa;
    }

    // toString: representación en texto del objeto
    @Override
    public String toString() {
        return "Estudiante [nombre: " + nombre + ", documento: " + documento + ", edad: " + edad
                + ", programa: " + programa + "]";
    }
}
