package rocketeam.christopher_lopez.java_cl.individual25;

public class CargaFamiliar {

    private String runCarga;
    private String nombres;
    private String apellidos;
    private String runFamiliar;
    private char parentesco;
    private int edad;

    public CargaFamiliar() {
    }

    public CargaFamiliar(String runCarga, String nombres, String apellidos, String runFamiliar, char parentesco, int edad) {
        this.runCarga = runCarga;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.runFamiliar = runFamiliar;
        this.parentesco = parentesco;
        this.edad = edad;
    }

    public String getRunCarga() {
        return runCarga;
    }

    public void setRunCarga(String runCarga) {
        this.runCarga = runCarga;
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

    public String getRunFamiliar() {
        return runFamiliar;
    }

    public void setRunFamiliar(String runFamiliar) {
        this.runFamiliar = runFamiliar;
    }

    public char getParentesco() {
        return parentesco;
    }

    public void setParentesco(char parentesco) {
        this.parentesco = parentesco;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "CargaFamiliar{" +
                "runCarga='" + runCarga + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", runFamiliar='" + runFamiliar + '\'' +
                ", parentesco=" + parentesco +
                ", edad=" + edad +
                '}';
    }
}
