package los_malvekexxxx.javierasanchez.java;

public class Ejercicioindivual25byjavi {

    private String nombres;
    private String apellidos;
    private String run;
    private String telefono;
    private int edad;

    // Constructor vacío
    public Ejercicioindivual25byjavi() {
    }

    // Constructor con todos los atributos
    public Ejercicioindivual25byjavi(String nombres, String apellidos, String run, String telefono, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.run = run;
        this.telefono = telefono;
        this.edad = edad;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Trabajador{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", run='" + run + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad=" + edad +
                '}';
    }

    // Método nombreCompleto()
    public String nombreCompleto() {
        return nombres + " " + apellidos;
    }

    // Método descomponerRun()
    public int descomponerRun() {
        String[] partes = run.split("-");
        String runSinGuion = partes[0];
        return Integer.parseInt(runSinGuion);
    }
}

