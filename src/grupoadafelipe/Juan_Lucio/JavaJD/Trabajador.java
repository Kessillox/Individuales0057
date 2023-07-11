package grupoadafelipe.Juan_Lucio.JavaJD;
public class Trabajador {

    /// Trabajadores (toString)
    private String nombres;
    private String apellidos;
    private String run;
    private String telefono;
    private int edad;

    // Constructor vacío
    public Trabajador() {
    }

    // Constructor que recibe todos los atributos
    public Trabajador(String nombres, String apellidos, String run, String telefono, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.run = run;
        this.telefono = telefono;
        this.edad = edad;
    }

    // Método para obtener el nombre completo
    public String nombreCompleto() {
        return nombres + " " + apellidos;
    }

    // Método para descomponer el RUN y obtener solo el número antes del guion
    public int descomponerRun() {
        int guionIndex = run.indexOf('-');
        if (guionIndex != -1) {
            String runSinGuion = run.substring(0, guionIndex);
            return Integer.parseInt(runSinGuion);
        } else {
            throw new IllegalArgumentException("El RUN no tiene guion");
        }
    }

    // Método toString para mostrar la información del trabajador
    @Override
    public String toString() {
        return "Nombres: " + nombres +
                "\nApellidos: " + apellidos +
                "\nRUN: " + run +
                "\nTeléfono: " + telefono +
                "\nEdad: " + edad;
    
    
            }
    
}
