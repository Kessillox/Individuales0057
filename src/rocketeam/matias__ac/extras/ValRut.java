package rocketeam.matias__ac.extras;

import java.util.Scanner;

public class ValRut {

 public static boolean ValRut(String rut){
  rut = rut.replace(".", "").replace("-", "");

  if (rut.length() < 2){
   return false;
  }
  int rutNum = Integer.parseInt(rut.substring(0, rut.length() - 1));
  char digitoVer = rut.charAt(rut.length() - 1);
  int suma = 0;
  int multiplicar = 2;

  while (rutNum != 0) {
   suma += (rutNum % 10) * multiplicar;
   rutNum /= 10;
   multiplicar++;
   if (multiplicar > 7) {
    multiplicar = 2;
   }
  }
  int resto = 11 - (suma % 11);
  char digVerEs = (resto == 11) ? '0': ((resto == 10) ? 'K' : (char) ('0' + resto));

  return digitoVer == digVerEs;

 }
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.print("Ingrese Rut: ");
  String rut = scanner.nextLine();
  boolean esValido = ValRut(rut);

  if (esValido) {
   System.out.print("El Rut " + rut + " es válido");
  } else {
   System.out.print("El Rut " + rut + " no es correcto.");
  }
 }
}