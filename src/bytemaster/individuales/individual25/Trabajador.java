package bytemaster.individuales.individual25;

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
        String[] partes = run.split("-"); // Dividir el RUN en dos partes separadas por el guion
        String parteAnterior = partes[0]; // Obtener la primera parte del RUN antes del guion

        // Eliminar los puntos de la primera parte del RUN
        String runSinPuntos = parteAnterior.replace(".", "");

        // Convertir la primera parte del RUN en un número entero
        int numero = Integer.parseInt(runSinPuntos);

        return numero;
    }





}
