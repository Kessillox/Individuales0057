package Bytemaster;

public class ForEachEjemplo {

    public static void main(String[] args) {

        // Este código es un ejemplo de cómo utilizar un bucle foreach en Java.

        // En este caso, se declara un arreglo de enteros llamado "nombreArray" y se inicializa con valores del 1 al 10.
        int [] nombreArray = {1,2,3,4,5,6,7,8,9,10};

        // Luego, se utiliza el bucle foreach para recorrer cada elemento del arreglo y realizar una acción.
        for (int resultado: nombreArray){

            // Dentro del bucle, se imprime en la consola un mensaje que indica el elemento por el que se está pasando.
            System.out.println("Hola voy pasando por el elemento: "+resultado);
        }

        // El resultado será la impresión de los números del 1 al 10 junto con el mensaje.
    }
}
