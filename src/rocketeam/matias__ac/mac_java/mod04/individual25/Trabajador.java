package rocketeam.matias__ac.mac_java.mod04.individual25;

public class Trabajador {
    private String nombres;
    private String apellidos;
    private String run;
    private String telefono;
    private int edad;

    public Trabajador(){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.run = run;
        this.telefono = telefono;
        this.edad = edad;
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

    public String nombreCompleto() {
        return nombres + " " + apellidos;
    }

    public int descomponerRun() {
        String[] partes = this.run.split("-");
        String runSinGuion = partes[0];
        return Integer.parseInt(runSinGuion);
    }
    @Override
    public String toString() {
        return "Nombre: " + nombres + "\n" +
                "Apellidos: " + apellidos + "\n" +
                "RUN: " + run + "\n" +
                "Teléfono: " + telefono + "\n" +
                "Edad: " + edad;
    }

}
