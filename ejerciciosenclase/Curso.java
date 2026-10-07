public class Curso {
    
    //Atributos
    private String codigo;
    private String nombre;
    private int creditos;
    
    //Constructor de la clase
    public Curso(String codigo, String nombre, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
    }
    
    public String toString(){
        return " Curso [ codigo: " + codigo + " nombre: " + nombre +
                         " creditos: " + creditos + "]";
    }

}
