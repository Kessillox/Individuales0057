package bytemaster.individuales.individual27;

public class CargaFamiliar {
    private String rumCarga;
    private String nombre;
    private String apellido;
    private String rumFamiliar;
    private Integer parentesco;
    private Integer edad;

    public CargaFamiliar() {
    }

    public CargaFamiliar(String rumCarga, String nombre, String apellido, String rumFamiliar, Integer parentesco, Integer edad) {
        this.rumCarga = rumCarga;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rumFamiliar = rumFamiliar;
        this.parentesco = parentesco;
        this.edad = edad;
    }

    public String getRumCarga() {
        return rumCarga;
    }

    public void setRumCarga(String rumCarga) {
        this.rumCarga = rumCarga;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRumFamiliar() {
        return rumFamiliar;
    }

    public void setRumFamiliar(String rumFamiliar) {
        this.rumFamiliar = rumFamiliar;
    }

    public Integer getParentesco() {
        return parentesco;
    }

    public void setParentesco(Integer parentesco) {
        this.parentesco = parentesco;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "CargaFamiliar{" +
                "rumCarga='" + rumCarga + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", rumFamiliar='" + rumFamiliar + '\'' +
                ", parentesco=" + parentesco +
                ", edad=" + edad +
                '}';
    }
}
