package rocketeam.matias__ac.mac_java.mod04.individual31;

public class corredoraDePropiedadesMain {
    public static void main(String[] args) {
        Trabajador worker1 = new Trabajador("Pedrito", "Alvarez", "17848508-3", 932447901, 32);
        System.out.println(worker1.descomponerRun());
        System.out.println(worker1.nombreCompleto());
        System.out.println(worker1);
    }

}
