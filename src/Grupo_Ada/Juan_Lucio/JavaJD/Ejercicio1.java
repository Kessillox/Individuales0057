package Grupo_Ada.Juan_Lucio.JavaJD;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Ejercicio1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Encender el dispositivo móvil o computadora");
            System.out.println("Abrir el navegador de internet");
            System.out.print("Escribir la pregunta o tema en la barra de búsqueda: ");
            String busqueda = scanner.nextLine();

            // Reemplaza los espacios en blanco con %20 para la URL
            String busquedaURL = busqueda.replace(" ", "%20");

            // Realiza la búsqueda en Google (puedes cambiar la URL según tu motor de búsqueda preferido)
            String url = "https://www.google.com/search?q=" + busquedaURL;

            try {
                // Abre la página de búsqueda en el navegador predeterminado
                Desktop.getDesktop().browse(new URI(url));
            } catch (IOException | URISyntaxException e) {
                System.out.println("No se pudo abrir el navegador.");
                e.printStackTrace();
            }

            System.out.println("Revisar los títulos y descripciones de los resultados");
            System.out.println("Seleccionar el resultado más relevante");
            System.out.println("Acceder a la página web correspondiente");
            System.out.println("Leer");

            // Aquí puedes agregar lógica adicional para procesar la información obtenida de la página web

            System.out.println("FIN");
        }
    }
