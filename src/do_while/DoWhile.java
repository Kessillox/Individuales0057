package do_while;

public class DoWhile {
    private static void doWhile() throws InterruptedException {
        // iniciamos la variable contador en 0.
        int contador = 0;

        // Realizamos la primera accion del ciclo.
        do {
            // Imprimir por pantalla el valor del contador.
            System.out.print("El valor del contador es: " + contador);
            // Esperar 6milisegundos antes de seguir.
            Thread.sleep(600);
            // Sumarle 1 al contador cada vez que se ejecute el ciclo.
            contador += 1;
            // Borrar pantalla y volver al primer indice de la linea a imprimir.
            System.out.print("\r");
            // Repetir el ciclo mientras el contador sea menor o igual a 10.
        } while(contador <= 10);
    }
    public static void main(String[] args) throws InterruptedException {
        // Instanciamos el metodo doWhile.
        doWhile();
    }
}
