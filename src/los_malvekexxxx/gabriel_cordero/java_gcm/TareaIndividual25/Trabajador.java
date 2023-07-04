package los_malvekexxxx.gabriel_cordero.java_gcm.TareaIndividual25;


// Se crea la clase Trabajador con sus atributos
public class Trabajador {
    private String nombres;
    private String apellidos;
    private String run;
    private String telefono;
    private int edad;

    // Constructor vacio
    public Trabajador() {
    }
    //Constructor con atributos
    public Trabajador(String nombres, String apellidos, String run, String telefono, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.run = run;
        this.telefono = telefono;
        this.edad = edad;
    }


    // Se crea los Getters  and Seters
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Se crea el metodo nombre completo
    public String nombreCompleto() {
        return nombres + " " + apellidos;
    }

    // Se crea el metodo descomponer run
    public int descomponerRun() {
        String[] partes = run.split("-");
        return Integer.parseInt(partes[0]);
    }


    // Se crea el metodo toString
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


}


