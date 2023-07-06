package codingclub.andrealopez.java.ind25;

import java.util.ArrayList;

public class Carga {

    private String runCarga, nombres, apellidos, runFamiliar;
    private int edad;
    private ArrayList parentesco;

    public Carga() {
    }

    public Carga(String runCarga, String nombres, String apellidos, String runFamiliar, int edad, ArrayList parentesco) {
        this.runCarga = runCarga;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.runFamiliar = runFamiliar;
        this.edad = edad;
        this.parentesco = parentesco;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList getParentesco() {
        return parentesco;
    }

    public void setParentesco(ArrayList parentesco) {
        this.parentesco = parentesco;
    }

    @Override
    public String toString() {
        return "Carga{" +
                "runCarga='" + runCarga + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", runFamiliar='" + runFamiliar + '\'' +
                ", edad=" + edad +
                ", parentesco=" + parentesco +
                '}';
    }
}
