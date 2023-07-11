package do_while.luis_sepulveda.java_luis_sepulveda.individual31;

public class Main {

    public static void main(String[] args) {
        TrHonorario honorario = new TrHonorario("Juan", "Sepulveda", "18.242.624-5", "+56979220923", 8, "Reciclaje Avanzado", "10-05-2023");
        honorario.mostrarDatos();

        TrContratado contratado = new TrContratado("Juan", "Sepulveda", "18.242.624-5", "+56979220923", 8, "10-05-1998", "250.000");
        contratado.mostrarDatos();

        TrEventual eventual = new TrEventual("Juan", "Sepulveda", "18.242.624-5", "+56979220923", 8, "Inmediata", "luis.sepu.c@gmail.com" );
        eventual.mostrarDatos();
    }
}
