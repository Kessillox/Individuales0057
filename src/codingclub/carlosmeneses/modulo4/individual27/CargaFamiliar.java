package codingclub.carlosmeneses.modulo4.individual27;

public class CargaFamiliar {
    private String run;
    private String nombres;
    private String apellidos;
    private String runFamiliar;
    private int parentesco;
    private int edad;

    public CargaFamiliar() {
    }

    public CargaFamiliar(String run, String nombres, String apellidos, String runFamiliar, int parentesco, int edad) {
        this.run = run;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.runFamiliar = runFamiliar;
        this.parentesco = parentesco;
        this.edad = edad;
    }

    public String getRun() {
        return run;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getRunFamiliar() {
        return runFamiliar;
    }

    public int getParentesco() {
        return parentesco;
    }

    public int getEdad() {
        return edad;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setRunFamiliar(String runFamiliar) {
        this.runFamiliar = runFamiliar;
    }

    public void setParentesco(int parentesco) {
        this.parentesco = parentesco;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "CargaFamiliar{" +
                "run='" + run + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", runFamiliar='" + runFamiliar + '\'' +
                ", parentesco=" + parentesco +
                ", edad=" + edad +
                '}';
    }
}