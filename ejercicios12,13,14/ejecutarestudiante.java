package POO.semana6;

public class EjecutarEstudiante {
    public static void main(String[] args) {

        // Creación de los tres objetos
        Estudiante est1 = new Estudiante("Ana", "1001", 18, "Ingeniería de Sistemas");
        Estudiante est2 = new Estudiante("Carlos", "1002", 20, "Contaduría");
        Estudiante est3 = new Estudiante("Laura", "1003", 19, "Psicología");

        // Forma 1: imprimir el objeto directamente (Java llama a toString() solo)
        System.out.println("=== Usando toString() ===");
        System.out.println(est1);
        System.out.println(est2);
        System.out.println(est3);

        // Forma 2: imprimir cada atributo por separado
        System.out.println("\n=== Atributo por atributo ===");
        System.out.println("Nombre: " + est1.getNombre());
        System.out.println("Documento: " + est1.getDocumento());
        System.out.println("Edad: " + est1.getEdad());
        System.out.println("Programa: " + est1.getPrograma());

        System.out.println("Nombre: " + est2.getNombre());
        System.out.println("Documento: " + est2.getDocumento());
        System.out.println("Edad: " + est2.getEdad());
        System.out.println("Programa: " + est2.getPrograma());

        System.out.println("Nombre: " + est3.getNombre());
        System.out.println("Documento: " + est3.getDocumento());
        System.out.println("Edad: " + est3.getEdad());
        System.out.println("Programa: " + est3.getPrograma());

        /*
         * Comparación:
         * Con toString() basta una línea por estudiante y el formato se define en
         * un solo lugar. Imprimiendo atributo por atributo se necesitan 4 líneas por
         * estudiante (12 en total) y, si se agrega un atributo nuevo, hay que
         * modificar cada bloque de prints.
         */
    }

    public static class Estudiante {
        private String nombre;
        private String documento;
        private int edad;
        private String programa;

        public Estudiante(String nombre, String documento, int edad, String programa) {
            this.nombre = nombre;
            this.documento = documento;
            this.edad = edad;
            this.programa = programa;
        }

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

        @Override
        public String toString() {
            return "Estudiante{" +
                    "nombre='" + nombre + '\'' +
                    ", documento='" + documento + '\'' +
                    ", edad=" + edad +
                    ", programa='" + programa + '\'' +
                    '}';
        }
    }
}
