package bytemaster;

public class ForEachEjemplo {

    public static void main(String[] args) {

        int [] nombreArray = {1,2,3,4,5,6,7,8,9,10};

        for (int resultado: nombreArray){
            System.out.println("Hola voy pasando por el elemento: "+resultado);
        }
    }
}
