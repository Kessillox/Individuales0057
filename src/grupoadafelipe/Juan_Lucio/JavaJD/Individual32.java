import java.util.ArrayList;
import java.util.List;

interface Corredora {
    void mostrarDatos();
}

class Trabajador implements Corredora {
    private String nombre;
    private int edad;

    public Trabajador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

class Honorario extends Trabajador {
    private double honorarios;

    public Honorario(String nombre, int edad, double honorarios) {
        super(nombre, edad);
        this.honorarios = honorarios;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Honorarios: " + honorarios);
    }
}

class Eventual extends Trabajador {
    private int horasTrabajadas;

    public Eventual(String nombre, int edad, int horasTrabajadas) {
        super(nombre, edad);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Horas Trabajadas: " + horasTrabajadas);
    }
}

class Contratado extends Trabajador {
    private int horasSemanales;

    public Contratado(String nombre, int edad, int horasSemanales) {
        super(nombre, edad);
        this.horasSemanales = horasSemanales;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Horas Semanales: " + horasSemanales);
    }
}

class Listado {
    private List<Corredora> trabajadores;

    public Listado() {
        trabajadores = new ArrayList<>();
    }

    public void agregarTrabajador(Corredora trabajador) {
        trabajadores.add(trabajador);
    }

    public void mostrarDatosTrabajadores() {
        for (Corredora trabajador : trabajadores) {
            trabajador.mostrarDatos();
            System.out.println("------------------");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Listado listado = new Listado();

        Trabajador trabajador1 = new Trabajador("Juan", 30);
        Honorario honorario1 = new Honorario("María", 35, 1500.0);
        Eventual eventual1 = new Eventual("Pedro", 25, 40);
        Contratado contratado1 = new Contratado("Luisa", 28, 35);
        Honorario honorario2 = new Honorario("Ana", 40, 2000.0);

        listado.agregarTrabajador(trabajador1);
        listado.agregarTrabajador(honorario1);
        listado.agregarTrabajador(eventual1);
        listado.agregarTrabajador(contratado1);
        listado.agregarTrabajador(honorario2);

        listado.mostrarDatosTrabajadores();
    }
}
