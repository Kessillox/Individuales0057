package do_while;

public class DoWhile {
    private static void doWhile() throws InterruptedException {
        // iniciamos la variable contador en 0.
        int contador = 0;

        // Realizamos la primera accion del ciclo.
        // Imprimir por pantalla el valor del contador.
        // Sumarle 1 al contador cada vez que se ejecute el ciclo.
        do {
            System.out.print("El valor del contador es: " + contador);
            Thread.sleep(600);
            contador += 1;
            // Repetir el ciclo mientras el contador sea menor o igual a 10.
            System.out.print("\r");
        } while(contador <= 10);
    }
    public static void main(String[] args) throws InterruptedException {
        doWhile();
    }
}
