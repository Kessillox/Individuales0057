package rocketeam.christopher_lopez.java_cl.corredorapropiedades;

public class Honorario extends Trabajador{

    private String giro;
    private int anioIniciacion;

    public Honorario() {
    }

    public Honorario(String nombres, String apellidos, String run, int telefono, int edad, String giro, int anioIniciacion) {
        super(nombres, apellidos, run, telefono, edad);
        this.giro = giro;
        this.anioIniciacion = anioIniciacion;
    }

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

    public int getAnioIniciacion() {
        return anioIniciacion;
    }

    public void setAnioIniciacion(int anioIniciacion) {
        this.anioIniciacion = anioIniciacion;
    }

    @Override
    public String toString() {
        return "Honorario{" +
                "giro='" + giro + '\'' +
                ", anioIniciacion=" + anioIniciacion +
                "} " + super.toString();
    }

    @Override
    public String mostrarDatos() {
        return "Giro: "+this.getGiro()+", año inciciación actividades: "+this.getAnioIniciacion();
    }
}
