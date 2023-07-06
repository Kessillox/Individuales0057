package bytemaster.individuales.individual27;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
    private String nombre;
    private String apellido;
    private String run;
    private int telefono;
    private int edad;
    private List<CargaFamiliar> listaCargaFamiliar = new ArrayList<>();

    public Trabajador() {
    }

    public Trabajador(String nombre, String apellido, String run, int telefono, int edad, List<CargaFamiliar> listaCargaFamiliar) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.run = run;
        this.telefono = telefono;
        this.edad = edad;
        this.listaCargaFamiliar = listaCargaFamiliar;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", run='" + run + '\'' +
                ", telefono=" + telefono +
                ", edad=" + edad +
                '}';
    }
    public String nombreCompleto() {
        return nombre  +" "+  apellido;
    };
    public  int descomponerRun() {
        String[] partes = run.split("-"); // Dividir el RUN en dos partes separadas por el guion
        String parteAnterior = partes[0]; // Obtener la primera parte del RUN antes del guion

        // Eliminar los puntos de la primera parte del RUN
        String runSinPuntos = parteAnterior.replace(".", "");

        // Convertir la primera parte del RUN en un número entero
        int numero = Integer.parseInt(runSinPuntos);

        return numero;
    }





}
