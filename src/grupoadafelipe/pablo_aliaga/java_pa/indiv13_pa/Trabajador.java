package grupoadafelipe.pablo_aliaga.java_pa.indiv13_pa;
import java.util.Scanner;

public class Trabajador {
    private String nombres;
    private String apellidos;
    private int run;
    private int digitoVerificador;
    private int telefono;
    private int edad;

    // Constructor vacío
    public Trabajador() {
    }

    // Constructor que solicita todos los atributos
    public Trabajador(String nombres, String apellidos, int run, int digitoVerificador, int telefono, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.run = run;
        this.digitoVerificador = digitoVerificador;
        this.telefono = telefono;
        this.edad = edad;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Trabajador{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", run=" + run +
                ", digitoVerificador=" + digitoVerificador +
                ", telefono=" + telefono +
                ", edad=" + edad +
                '}';
    }

    // Método nombreCompleto()
    public String nombreCompleto() {
        return nombres + " " + apellidos;
    }

    // Método descomponerRun()
    public int descomponerRun() {
        return run / 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos del trabajador:");
        System.out.print("Nombres: ");
        String nombres = scanner.nextLine();

        System.out.print("Apellidos: ");
        String apellidos = scanner.nextLine();

        System.out.print("RUN: ");
        int run = scanner.nextInt();

        System.out.print("Dígito Verificador: ");
        int digitoVerificador = scanner.nextInt();

        System.out.print("Teléfono: ");
        int telefono = scanner.nextInt();

        System.out.print("Edad: ");
        int edad = scanner.nextInt();

        Trabajador trabajador = new Trabajador(nombres, apellidos, run, digitoVerificador, telefono, edad);

        System.out.println("\nDatos del trabajador:");
        System.out.println(trabajador);
        System.out.println("Nombre completo: " + trabajador.nombreCompleto());
        System.out.println("RUN descompuesto: " + trabajador.descomponerRun());
    }
}
