package codingclub.carlosmeneses.modulo4.individual31;

public class Trabajador {
    protected String nombres;
    protected String apellidos;
    protected String run;
    protected String telefono;
    protected int edad;

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

    public String mostrarDatos() {
        return "Telefono: " + telefono + ", Edad: " + edad;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getRun() {
        return run;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}