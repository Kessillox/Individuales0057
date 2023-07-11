package do_while.katy_cordero.java_katy_cordero.individual33;

public class Main {
    public static void main(String[] args) {
       Empleado empleado = new Empleado("Juan", "Perez", 45, 500000);
       System.out.println(empleado);
       empleado.calcularSueldo();


        Vendedor vendedor = new Vendedor("María", "Lopez", 35, 600000, "01/01/2010");
        System.out.println(vendedor);
        vendedor.calcularSueldo();



        Repartidor repartidor = new Repartidor("Pedro", "Garcia", 28, 400000, "Tarde");
        System.out.println(repartidor);
        repartidor.calcularSueldo();


    }
}
