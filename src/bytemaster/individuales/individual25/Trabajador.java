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
}
