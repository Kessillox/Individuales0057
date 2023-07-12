package grupoadafelipe.nelson_carvajal.java_nc.individual27;

import java.time.LocalDate;
//ESTE TRABAJO INCLUYE EL INDIVIDUAL31
public class TrabajadorHonorario extends Trabajador{
    private String giro;
    private int yearStart;

    public TrabajadorHonorario() {
    }

    public TrabajadorHonorario(String nombre, String apellido1, String apellido2, String rut, int edad, int fechaNac, int telefono, String giro, int yearStart) {
        super(nombre, apellido1, apellido2, rut, edad, fechaNac, telefono);
        this.giro = giro;
        this.yearStart = yearStart;
    }

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

    public int getYearStart() {
        return yearStart;
    }

    public void setYearStart(int yearStart) {
        this.yearStart = yearStart;
    }

    @Override
    public String toString() {
        return "TrabajadorHonorario{" +
                "giro='" + giro + '\'' +
                ", yearStart=" + yearStart +
                '}';
    }

    public String mostrarDatos (){return giro +" "+ yearStart;}
}
