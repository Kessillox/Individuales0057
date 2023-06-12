package los_malvekexxxx.franco_vargas.java_fv;

public class TareaIndividual3 {
    public static void main(String[] args) {
        int costoPorPersona, numeroPersonas;
        double presupuestoTotal;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de personas para el evento: ");
        numeroPersonas = sc.nextInt();

        if (numeroPersonas > 300) {
            costoPorPersona = 4000;
        } else if (numeroPersonas > 200 && numeroPersonas <= 300) {
            costoPorPersona = 4200;
        } else {
            costoPorPersona = 4500;
        }

        presupuestoTotal = costoPorPersona * numeroPersonas;

        System.out.println("El presupuesto total para el evento es de: $" + presupuestoTotal);

        sc.close();
    }
}
