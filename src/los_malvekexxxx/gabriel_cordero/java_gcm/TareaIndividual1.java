package los_malvekexxxx.gabriel_cordero.java_gcm;

public class TareaIndividual1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Cuantas personas asisitiran al evento: ");
        int Personas = input.nextInt();

        int costoPorPersona;

        if (Personas > 300) {
            costoPorPersona = 4000;
        }

        else if (Personas > 200) {
            costoPorPersona = 4200;
        }

        else {
            costoPorPersona = 4500;
        }

        int costoTotal = Personas * costoPorPersona;

        System.out.println("El valor del banquete es: $" +costoTotal);

    }

}
