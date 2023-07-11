package grupoadafelipe.nelson_carvajal.java_nc.individualu16_pa;

public class CargaTrabajador {
    //atributos
    private String run;
    private String nombres;
    private String apellidos;
    private String runFamiliar;
    private String parentezco;
    private int edad;
    //contructor vacio
    public CargaTrabajador() {
    }
    //contructor con parametros


    public CargaTrabajador(String run, String nombres, String apellidos, String runFamiliar, String parentezco, int edad) {
        this.run = run;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.runFamiliar = runFamiliar;
        this.parentezco = parentezco;
        this.edad = edad;
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

    public String getRunFamiliar() {
        return runFamiliar;
    }

    public void setRunFamiliar(String runFamiliar) {
        this.runFamiliar = runFamiliar;
    }

    public String getParentezco() {
        return parentezco;
    }

    public void setParentezco(String parentezco) {
        this.parentezco = parentezco;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "CargaTrabajador{" +
                "run='" + run + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", runFamiliar='" + runFamiliar + '\'' +
                ", parentezco='" + parentezco + '\'' +
                ", edad=" + edad +
                '}';
    }
}
