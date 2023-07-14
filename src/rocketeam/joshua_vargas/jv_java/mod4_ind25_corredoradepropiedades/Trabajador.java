package rocketeam.joshua_vargas.jv_java.mod4_ind25_corredoradepropiedades;

public class Trabajador {
    private String nombres;
    private String apellidos;
    private String run;
    private int telefono;
    private int edad;

    public Trabajador() {
    }

    public Trabajador(String nombres, String apellidos, String run, int telefono, int edad) {
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

        return nombres + " " + apellidos;
    }

    public int descomponerRun() {
        String[] partes = run.split("-");
        String runSinGuion = partes[0];
        return Integer.parseInt(runSinGuion);
    }

    public String mostrarDatos(){
        return "Fono: "+ this.getTelefono() +", edad: "+ this.getEdad();
    }



    @Override
    public String toString() {
        return  "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", run='" + run + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad=" + edad;

    }
}
