package bytemaster.individuales.individual31;

public class Honorario extends Trabajador{
    private String giro;
    private int anio;

    public Honorario() {
    }

    public Honorario(String nombre, String apellido, String run, int telefono, int edad, String giro, int anio) {
        super(nombre, apellido, run, telefono, edad);
        this.giro = giro;
        this.anio = anio;
    }

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Honorario{" +
                "giro='" + giro + '\'' +
                ", anio=" + anio +
                "} " + super.toString();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }
}
