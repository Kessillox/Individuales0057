package los_malvekexxxx;

public class CicloWhile{
    public static void main(String args[]){

        /* Declaramos la variable i como int para crear el bucle*/
        int i = 1;

        /*
            Utilizamos la funcion while, el cual es una estructura de control de bucles
            que permite repetir un bloque de codigo mientras una condicion especifiicada se cumpla.
         */
        while(i < 10){
            /* Mientras la variable i sea menor que 10 se repetira el ciclo de imprimir el valor. */
            System.out.println( "El valor del numero es  " + i );
            /* Se suma 2 a la variable i hasta cumplir con la condicion. */
            i+=2;
        }
    }
}


