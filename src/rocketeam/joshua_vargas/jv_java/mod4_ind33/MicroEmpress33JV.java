package rocketeam.joshua_vargas.jv_java.mod4_ind33;

import java.time.Month;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MicroEmpress33JV {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

        Vendedor_JV vendedor1 = new Vendedor_JV("Joshua","Vargas",41,500000,LocalDate.of(2023, Month.SEPTEMBER,23));
        Repartidor_JV repartidor1 = new Repartidor_JV("Pedro","Carcuro",32,590000,"todo el día");
        System.out.println("La fecha de inicio del vendedor es "+ vendedor1.getFechaInicio());
        System.out.println("La disponibilidad horaria del repartidor es "+ repartidor1.getDisponibilidadHoraria());

        int bono = 0;



       /* if(this.edad >40){
            int sueldoFinal = this.salario += bono;
            return sueldoFinal;*/
    }
}
