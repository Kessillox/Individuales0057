package grupoadafelipe.Juan_Lucio.JavaJD.Individual25a27;

//Individual 26
public class Main {
    public static void main(String[] args) {
        // Crear instancias de la clase Trabajador
        Trabajador trabajador1 = new Trabajador("Juan ","Lucio ","14722114-2", "954977330", 28);
        Trabajador trabajador2 = new Trabajador("Juan", "Pérez", "12345678-9", "555-1234", 30);
        Trabajador trabajador3 = new Trabajador("María", "López", "98765432-1", "555-5678", 25);

        // Desplegar contenido de cada objeto usando el método toString()
        System.out.println(trabajador1.toString());
        System.out.println(trabajador2.toString());
        System.out.println(trabajador3.toString());
    }
}
