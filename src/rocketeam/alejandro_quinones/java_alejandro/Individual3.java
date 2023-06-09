package rocketeam.alejandro_quinones.java_alejandro;

import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class Individual3 {
    public static void main(String[] args) {
        int costoPlato = 4_500;
        int personas = 0;
        Scanner sc = new Scanner(System.in);
        NumberFormat nf = DecimalFormat.getInstance(Locale.ENGLISH);

        System.out.println("Ingresa la cantidad de personas: ");
        personas = sc.nextInt();

        if(personas > 200 && personas <= 300) costoPlato = 4_200;
        if(personas > 300) costoPlato = 4_000;

        int total = personas * costoPlato;
        String resultado = nf.format(total);
        resultado = "$" + resultado.replace(",", ".");

        System.out.println("El presupuesto para: " + personas + " personas es de: " + resultado);

    };
};
