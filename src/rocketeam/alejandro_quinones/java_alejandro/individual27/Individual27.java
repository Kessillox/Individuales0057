package rocketeam.alejandro_quinones.java_alejandro.individual27;

public class Individual27 {
    private String RUN;
    private String Nombres;
    private String Apellidos;
    private String runFamiliar;
    private int Parentesco;
    private int Edad;

    public Individual27() {
    }

    public Individual27(String RUN, String nombres, String apellidos, String runFamiliar, int parentesco, int edad) {
        this.RUN = RUN;
        Nombres = nombres;
        Apellidos = apellidos;
        this.runFamiliar = runFamiliar;
        Parentesco = parentesco;
        Edad = edad;
    }

    public String getRUN() {
        return RUN;
    }

    public void setRUN(String RUN) {
        this.RUN = RUN;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getRunFamiliar() {
        return runFamiliar;
    }

    public void setRunFamiliar(String runFamiliar) {
        this.runFamiliar = runFamiliar;
    }

    public int getParentesco() {
        return Parentesco;
    }

    public void setParentesco(int parentesco) {
        Parentesco = parentesco;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    @Override
    public String toString() {
        return "Individual27{" +
                "RUN='" + RUN + '\'' +
                ", Nombres='" + Nombres + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                ", runFamiliar='" + runFamiliar + '\'' +
                ", Parentesco=" + Parentesco +
                ", Edad=" + Edad +
                '}';
    }
}