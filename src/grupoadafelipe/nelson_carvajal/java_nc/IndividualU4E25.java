package grupoadafelipe.nelson_carvajal.java_nc;

public class IndividualU4E25 {
    private String Nombres;
    private String Apellido;
    private String RUN;
    private int Telefono;
    private int Edad;

    public IndividualU4E25() {
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getRUN() {
        return RUN;
    }

    public void setRUN(String RUN) {
        this.RUN = RUN;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    @Override
    public String toString() {
        return "IndividualU4E25{" +
                "Nombres='" + Nombres + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", RUN='" + RUN + '\'' +
                ", Telefono=" + Telefono +
                ", Edad=" + Edad +
                '}';
    }
}
