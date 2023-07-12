package losprofes.polimorfismo;

import java.util.Scanner;

public class MainAnimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Perro perro1 = new Perro("Perro", "Fido", 3, "dalmata");
        Perro perro2 = new Perro();
        Gato gato1 = new Gato();
        gato1.setNombre("Ori");
        gato1.setEspecie("gato");
        gato1.setEdad(1);
        gato1.setRaza("angora");
        String nombre ="";
        int vida=0;

        gato1.imprimir();
        perro1.imprimir();
        perro2.imprimir();

        Animal animal1;
        animal1 = new Perro("Per", "Fid", 3, "dalma");
        animal1.imprimir();
        Animal animal2 = new Gato("Gar", "Did", 4, "ango");
        animal2.imprimir();


        //Como setear datos con scanner de usuario
        /*System.out.println("****** Crea tu perro gato");
        System.out.println("Ingresa el nombre de tu animal");
        nombre = scanner.nextLine();
        System.out.println("Ingresa la vida de tu animal");
        vida = scanner.nextInt();
        System.out.println("La raza es al azar");
        perro2.setEspecie("Perruna");
        perro2.setNombre(nombre);
        perro2.setEdad(vida);
        perro2.setRaza("quilterrier");
        System.out.println("toma tu perro ");
        perro2.imprimir();*/
    }
}
