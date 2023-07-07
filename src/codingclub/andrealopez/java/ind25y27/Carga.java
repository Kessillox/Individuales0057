package codingclub.andrealopez.java.ind25y27;

import java.util.ArrayList;

public class Carga {

    private String runCarga, nombre, apellido1, apellido2, runFamiliar;
    private int edad;
    private ArrayList<Integer> parentesco;

    public Carga() {
        parentesco = new ArrayList<>();
        parentesco.add(1);
        parentesco.add(2);
        parentesco.add(3);
    }

    public Carga(String runCarga, String nombre, String apellido1, String apellido2, String runFamiliar, int edad) {
        this.runCarga = runCarga;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.runFamiliar = runFamiliar;
        this.edad = edad;

        parentesco = new ArrayList<>();
        parentesco.add(1);
        parentesco.add(2);
        parentesco.add(3);
    }

    public String getRunCarga() {
        return runCarga;
    }

    public void setRunCarga(String runCarga) {
        this.runCarga = runCarga;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
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
                ", nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", runFamiliar='" + runFamiliar + '\'' +
                ", edad=" + edad +
                ", parentesco=" + parentesco +
                '}';
    }
}
