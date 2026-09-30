public class MainEstudiante {
    public static void main(String[] args) {
        // Creación de los objetos
        Estudiante objEstudiante1 = new Estudiante();
        objEstudiante1.id = 1;
        objEstudiante1.nombre = "Levi Talaga";
        objEstudiante1.nota = 4.5;

        Estudiante objEstudiante2 = new Estudiante();
        objEstudiante2.id = 2;
        objEstudiante2.nombre = "Ana Torres";
        objEstudiante2.nota = 3.8;

        objEstudiante1.mostrarInformacion();
        objEstudiante2.mostrarInformacion();
    }
}
