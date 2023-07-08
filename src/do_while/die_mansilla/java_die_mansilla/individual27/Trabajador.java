package do_while.die_mansilla.java_die_mansilla.individual27;

public class Trabajador {
    private String run;
    private String nombres;
    private String apellidos;

    public Trabajador() {
    }

    public Trabajador(String rut, String nombres, String apellidos) {
        this.run = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

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

    @Override
    public String toString() {
        return "Trabajador{" +
                "rut='" + run + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }
}
