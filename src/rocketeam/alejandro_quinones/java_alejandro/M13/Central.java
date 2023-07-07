package rocketeam.alejandro_quinones.java_alejandro.M13;

public class Central {
    public static void main(String[] args) {
        Trabajador Fernando = new Trabajador("Pedrito", "Alvarez", "12657...456-8", "98456422", 36);
        System.out.println(Fernando.nombreCompleto());
        System.out.println(Fernando.toString());
        System.out.println(Fernando.descomponerRun());
    }
}
