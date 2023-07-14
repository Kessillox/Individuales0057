package do_while.katy_cordero.java_katy_cordero.individual25;

public class Trabajador {
    private String nombres;
    private String apellidos;
    private String run;
    private String telefono;
    private String edad;

    public Trabajador(){

    }

    public Trabajador(String nombres, String apellidos, String run, String telefono, String edad) {
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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String nombreCompleto(){
    return this.getNombres() + " " + this.getApellidos();
    }

    public int descomponerRun() {
        String[] rut = this.run.split("-");
        return Integer.parseInt(rut[0]);
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", run='" + run + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }


}
