package decualquierforma;

public class ContadorEstatico {
    public static void main(String[] args) throws InterruptedException {
        int contador = 0;

        for( int i = 0; i <= 10; i++ ) {
            System.out.print("Contador: " + contador + "    ");
            Thread.sleep(500); // Espera de 0.5 seg
            contador++;
            System.out.print("\r");
        }
    }
}
