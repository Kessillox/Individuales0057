package do_while;

public class DoWhile {
    public static void main(String[] args) {
        // iniciamos la variable contador en 0.
        int contador = 0;

        // Realizamos la primera accion del ciclo.
        // Imprimir por pantalla el valor del contador.
        // Sumarle 1 al contador cada vez que se ejecute el ciclo.
        do {
            System.out.println(contador);
            contador++;
            // Repetir el ciclo mientras el contador sea menor o igual a 10.
        } while(contador <= 10);
    }
}
