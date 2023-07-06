package rocketeam.matias__ac.mac_java.mod04.individual27;

public class CargaFamiliar {
    private String rut;
    private String nombres;
    private String apellidos;
    private String rutFamiliar;
    private int parentesco;
    private int edad;


    public CargaFamiliar() {
    }

    public CargaFamiliar(String rut, String nombres, String apellidos, String rutFamiliar, int parentesco, int edad) {
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.rutFamiliar = rutFamiliar;
        this.parentesco = parentesco;
        this.edad = edad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
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

    public String getRutFamiliar() {
        return rutFamiliar;
    }

    public void setRutFamiliar(String rutFamiliar) {
        this.rutFamiliar = rutFamiliar;
    }

    public int getParentesco() {
        return parentesco;
    }

    public void setParentesco(int parentesco) {
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
        return "CargaFamiliar" +
                "rut='" + rut + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", rutFamiliar='" + rutFamiliar + '\'' +
                ", parentesco=" + parentesco +
                ", edad=" + edad;

    }

}

