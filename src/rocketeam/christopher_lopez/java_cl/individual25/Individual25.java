package rocketeam.christopher_lopez.java_cl.individual25;

public class Individual25 {

    public static void main(String[] args) {

        Trabajador t1 = new Trabajador("Juan","Perez","123456-7",22331144,30);
        System.out.println(t1.nombreCompleto());
        System.out.println(t1.descomponerRun());
        System.out.println(t1);

        CargaFamiliar carga1 = new CargaFamiliar("111-1","Juan","Perez",t1,'1',50);
        System.out.println(carga1.toString());

    }


}
