package do_while.luis_sepulveda.java_luis_sepulveda.individual31;

public class TrHonorario extends Trabajador{
    private String giro;
    private String anioIniciacion;

    public TrHonorario(){

    }
    public TrHonorario(String nombres, String apellidos, String run, String telefono, int edad, String giro, String anioIniciacion) {
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

    public String getAnioIniciacion() {
        return anioIniciacion;
    }

    public void setAnioIniciacion(String anioIniciacion) {
        this.anioIniciacion = anioIniciacion;
    }

    @Override
    public String toString() {
        return "TrHonorario{" +
                "giro='" + giro + '\'' +
                ", anioIniciacion='" + anioIniciacion + '\'' +
                "} " + super.toString();
    }

    @Override
    public void mostrarDatos() {
       //super.mostrarDatos();
        System.out.println("giro: " + this.getGiro());
        System.out.println("año de inicio de actividades: " + this.getAnioIniciacion());

    }
}
