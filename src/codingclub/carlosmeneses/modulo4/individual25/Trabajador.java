package codingclub.carlosmeneses.modulo4.individual25;

public class Trabajador {
    private String nombres;
    private String apellidos;
    private String run;
    private String telefono;
    private int edad;

    // Constructor vacío
    public Trabajador() {
    }

    // Constructor con todos los atributos
    public Trabajador(String nombres, String apellidos, String run, String telefono, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.run = run;
        this.telefono = telefono;
        this.edad = edad;
    }

    // Método toString
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

    // Método nombreCompleto
    public String nombreCompleto() {
        return nombres + " " + apellidos;
    }

    // Método descomponerRun
    public int descomponerRun() {
        String[] partes = run.split("-");
        return Integer.parseInt(partes[0]);
    }
}