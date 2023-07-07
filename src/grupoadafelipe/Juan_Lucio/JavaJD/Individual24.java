import java.lang.Math;

public class Individual24 {
    public static void main(String[] args) {
        int n = obtenerNumeroTerminos(); // Obtener el número de términos de entrada
        double estimacionPi = estimarPi(n); // Estimar el valor de π
        double diferencia = Math.abs(estimacionPi - Math.PI); // Calcular la diferencia con el valor de π de la librería Math

        System.out.println("Estimación de π (Pi): " + estimacionPi);
        System.out.println("Diferencia con Math.PI: " + diferencia);
    }

    public static int obtenerNumeroTerminos() {
        // Aquí puedes implementar la lógica para obtener el número de términos de entrada
        // Puedes utilizar la entrada del usuario o cualquier otro método que prefieras
        // En este ejemplo, se utiliza un valor fijo para ilustrar el funcionamiento del programa
        return 10000; // Número de términos fijo
    }

    public static double estimarPi(int n) {
        double suma = 0.0;
        double signo = 1.0;

        for (int i = 0; i < n; i++) {
            double termino = signo / (2 * i + 1);
            suma += termino;
            signo *= -1; // Alternar el signo en cada término
        }

        return 4 * suma;
    }
}
