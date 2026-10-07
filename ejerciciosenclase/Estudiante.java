public class Estudiante {
    
    //Atributos
    private String nombre;
    private String documento;
    private int edad;
    private String correo;
    private Curso curso;

    //Constructor de la clase
    public Estudiante(String nombre, String documento, int edad, String correo, Curso curso){
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.correo = correo;
        this.curso = curso;
    }
    
    public String toString(){
        return "Estudiante [ nombre: " + nombre + " documento: " + documento +
                             " edad: " + edad + " correo: " + correo + " Matricula " + curso + "]";
    }
}
