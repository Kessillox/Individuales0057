package bytemaster.individuales.individual25;

public class Trabajador {
    private String nombre;
    private String apellido;
    private String run;
    private int telefono;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Trabajador() {
    }

    public Trabajador(String nombre, String apellido, String run, int telefono, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.run = run;
        this.telefono = telefono;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", run='" + run + '\'' +
                ", telefono=" + telefono +
                ", edad=" + edad +
                '}';
    }
    public String nombreCompleto() {
        return nombre  +" "+  apellido;
    };
    public  int descomponerRun() {
        String[] partes = run.split("-");
        String parteAnterior = partes[0];
        String runSinPuntos = parteAnterior.replace(".", "");
        int numero = Integer.parseInt(runSinPuntos);

        return numero;
    }
}
