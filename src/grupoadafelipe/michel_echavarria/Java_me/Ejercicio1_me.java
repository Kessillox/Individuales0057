package grupoadafelipe.michel_echavarria.Java_me;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Ejercicio1_me {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Encender el dispositivo móvil o computadora");
            System.out.println("Abrir el navegador de internet");
            System.out.print("Escribir la pregunta o tema en la barra de búsqueda: ");
            String busqueda = scanner.nextLine();

            String busquedaURL = busqueda.replace(" ", "%20");

            String url = "https://www.google.com/search?q=" + busquedaURL;

            try {
                Desktop.getDesktop().browse(new URI(url));
            } catch (IOException | URISyntaxException e) {
                System.out.println("No se pudo abrir el navegador.");
                e.printStackTrace();
            }

            System.out.println("Revisar los títulos y descripciones de los resultados");
            System.out.println("Seleccionar el resultado más relevante");
            System.out.println("Acceder a la página web correspondiente");
            System.out.println("Leer");

            System.out.println("FIN");
        }
    }
