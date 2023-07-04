package los_malvekexxxx.oscar_aguilera.java_oa.M4TrabajoIndividual25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Trabajador {
    String nombre1;
    String nombre2;
    String apellido1;
    String apellido2;
    String run;
    int telefono;
    int edad;

    public Trabajador(){

    }
    public Trabajador(String nombre1, String nombre2, String apellido1, String apellido2, String run, int telefono, int edad) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.run = run;
        this.telefono = telefono;
        this.edad = edad;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
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

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        return "Trabajador{" +
                "nombre1='" + nombre1 + '\'' +
                ", nombre2='" + nombre2 + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", run='" + run + '\'' +
                ", telefono=" + telefono +
                ", edad=" + edad +
                '}';
    }

    public String nombreCompleto(){
        String nomCompleto = nombre1+" "+nombre2+" "+apellido1+" "+apellido2;
        return nomCompleto;
    }

    public int descomponerRut(){
        int rut;

        if (validaRut(this.run) == true){
            String[] strRut = this.run.replace(".", "").split("-");
            rut = Integer.parseInt(strRut[0]);
            return rut;
        } else {return rut = 0;}
    }

    public static Boolean validaRut ( String rut ) {
        Pattern pattern = Pattern.compile("^[0-9]+-[0-9kK]{1}$");
        Matcher matcher = pattern.matcher(rut);
        if ( matcher.matches() == false ) return false;
        String[] stringRut = rut.split("-");
        return stringRut[1].toLowerCase().equals(dv(stringRut[0]));
    }
    public static String dv ( String rut ) {
        Integer M=0,S=1,T=Integer.parseInt(rut);
        for (;T!=0;T=(int) Math.floor(T/=10))
            S=(S+T%10*(9-M++%6))%11;
        return ( S > 0 ) ? String.valueOf(S-1) : "k";
    }
}


