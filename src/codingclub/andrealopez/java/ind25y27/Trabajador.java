package codingclub.andrealopez.java.ind25y27;

import java.time.LocalDate;

public class Trabajador {

    private String nombre, apellido1, apellido2, rut;
    private int edad, telefono;
    private LocalDate fechaNacimiento;

    public Trabajador() {
    }

    public Trabajador(String nombre, String apellido1, String apellido2, String rut, int edad, LocalDate fechaNacimiento, int telefono) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.rut = rut;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
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

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", rut='" + rut + '\'' +
                ", edad=" + edad +
                ", fechaNacimiento=" + fechaNacimiento +
                ", telefono=" + telefono +
                '}';
    }
    public String nombreCompleto(){
        return nombre +" "+ apellido1 +" "+ apellido2;
    }
    public String nombreCompleto2(){
        String nombreCompleto = nombre +" "+ apellido1 +" "+ apellido2;
        return nombreCompleto;
    }

    public int procesarRut(){

        int rut=0;
        String[] arregloStrRut = this.rut.split("-");
        //arregloStrRut
        rut = Integer.parseInt(arregloStrRut[0]);

        return rut;
    }
}
