package grupoadafelipe.nelson_carvajal.java_nc.individual27;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Trabajador {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String rut;
    private int edad;
    private LocalDate fechaNac;
    private int telefono;

    public Trabajador() {
    }

    public Trabajador(String nombre, String apellido1, String apellido2, String rut, int edad, LocalDate fechaNac, int telefono) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.rut = rut;
        this.edad = edad;
        this.fechaNac = fechaNac;
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

    public LocalDate getFechaNac() { return fechaNac; }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
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
                ", fechaNac=" + fechaNac +
                ", telefono=" + telefono +
                '}';
    }
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public String nombreCompleto(){
            return "Hola soy "+nombre +" "+ apellido1 +" "+ apellido2+" MI rut es: "+ rut+" Tengo "+ edad+" años. Y nací el: "+ fechaNac.format(formato) +" Te dejo mi número de telefo para que me contactes  "+ telefono;
    }
    public String mostrarDatos (){return telefono +" "+ edad;}


    public int procesarRut(){

        int rut=0;
        String[] arregloStrRut = this.rut.split("-");
        //arregloStrRut
        rut = Integer.parseInt(arregloStrRut[0]);

        return rut;
    }

}
