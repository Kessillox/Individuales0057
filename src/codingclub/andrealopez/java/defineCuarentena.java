package codingclub.andrealopez.java;

public class defineCuarentena {
    /*Considere el siguiente enunciado. Determine las unidades al mínimo nivel de detalle, y expréselas
como un conjunto de expresiones lógicas.
“Una persona debe permanecer 14 días en observación únicamente si ha salido del país. La persona
se hará el PCR si quiere volver a la normalidad. Dado que ni la persona ha salido del país ni presenta
contagios cercanos, no tendrá que hacer cuarentena ni se le hará el PCR.”
Recuerde asociar cada frase atómica como una variable, y asignarle un valor de verdad cualquiera,
siempre que aplique al caso. Una vez realizado, evalúe la situación con al menos dos combinaciones
de valores de verdad iniciales, y verifique los cambios en el resultado final.*/

    public static void main(String[] args) {
        boolean salioPais = false;
        boolean seRealizóPCR = true;
        boolean relacionEstrecha= true;

        if (salioPais && !seRealizóPCR) {

            System.out.println("Debe permanecer en cuarentena por 14 días");
        }
        else if(salioPais && seRealizóPCR) {
                System.out.println("Espere el resultado, y si es negativo puede volver a la normalidad");
            }

        else {

            if (relacionEstrecha){
                System.out.println("Debe permanecer en cuarentea");
            }
            else {
                System.out.println("No necesita realizarse PCR ni hacer cuarentena");

            }

        };


    }


}
