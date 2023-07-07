package codingclub.andrealopez.java;

public class Corredora {
    private String nombres, apellidos, run;
    private int telefono, edad;

    public Corredora() {
    }

    public Corredora(String nombres, String apellidos, String run, int telefono, int edad) {
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

    @Override
    public String toString() {
        return "Corredora{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", run='" + run + '\'' +
                ", telefono=" + telefono +
                ", edad=" + edad +
                '}';
    }

    public String nombreCompleto(){
        return this.nombres + " " + this.apellidos;
    }

    public int descomponerRun(){
        String runCompleto = this.run.replace(".", "");
        String [] runArray = runCompleto.split("-");
        int rut = Integer.parseInt(runArray[0]);
        return rut;

    }
}
