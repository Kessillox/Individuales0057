package bytemaster.individuales.Individual33;

public class Empleado {
        protected String nombre;
        protected String apellido;
        protected int edad;
        protected double salario;

        public Empleado(String nombre, String apellido, int edad, double salario) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
            this.salario = salario;
        }

        public void mostrarInformacion() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellido: " + apellido);
            System.out.println("Edad: " + edad);
            System.out.println("Salario: " + salario);
        }

        public double calcularSalarioTotal() {
            double salarioTotal = salario;
            if (edad > 40) {
                salarioTotal += 100000;
            }
            return salarioTotal;
        }
    }

