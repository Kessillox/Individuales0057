package codingclub.carlosmeneses.modulo4.individual31;

public class Honorario extends Trabajador {
    private int giro;
    private int anioIniciacion;

    @Override
    public String toString() {
        return "Honorario{" +
                "giro=" + giro +
                ", anioIniciacion=" + anioIniciacion +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", run='" + run + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public String mostrarDatos() {
        return "Giro: " + giro + ", año de iniciación de actividades: " + anioIniciacion;
    }

    public int getGiro() {
        return giro;
    }

    public int getAnioIniciacion() {
        return anioIniciacion;
    }

    public void setGiro(int giro) {
        this.giro = giro;
    }

    public void setAnioIniciacion(int anioIniciacion) {
        this.anioIniciacion = anioIniciacion;
    }
}
