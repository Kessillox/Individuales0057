package grupoadafelipe.Juan_Lucio.JavaJD.Individual33;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        LocalDate fechaNacimiento = LocalDate.of(1980, 6, 15);
        int salario = 500000; // Sueldo inicial
        Empleado empleado = new Empleado("Tomas", "Morales", fechaNacimiento, 400000 );
        empleado.bonificacion();
        System.out.println("Salario: " + empleado.getSalario());
    }
}
