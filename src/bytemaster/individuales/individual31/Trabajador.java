package bytemaster.individuales.individual31;

public class Trabajador {
    private String nombre;
    private String apellido;
    private String run;
    private int telefono;
    private int edad;

    public Trabajador() {
    }

    public Trabajador(String nombre, String apellido, String run, int telefono, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.run = run;
        this.telefono = telefono;
        this.edad = edad;
    }

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

    public String nombreCompleto() {
        String nC = getNombre()+" "+getApellido();
        return nC;
    };

    public  int descomponerRun() {
        String[] partes = run.split("-"); // Dividir el RUN en dos partes separadas por el guion
        String parteAnterior = partes[0]; // Obtener la primera parte del RUN antes del guion

        // Eliminar los puntos de la primera parte del RUN
        String runSinPuntos = parteAnterior.replace(".", "");

        // Convertir la primera parte del RUN en un número entero
        int numero = Integer.parseInt(runSinPuntos);

        return numero;
    }
public void mostrarDatos()  {
    System.out.println("el telefono es " + getTelefono()+"la edad es " +getEdad() );

}





}
