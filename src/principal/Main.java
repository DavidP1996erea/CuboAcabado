package principal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        /*
           Scanner sc = new Scanner(System.in);

        int lados;

        System.out.println("Introduzca el lado");
        lados= sc.nextInt();


        for(int i=0; i<lados;i++){

            System.out.println(" ");

          for (int j=0 ; j<lados ; j++){

              System.out.print(" * ");

          }

        }



         */
        Scanner sc = new Scanner(System.in);


        String material;
        String color;
        boolean asa;
        int capacidadMaxima;
        int contenidoActual;



        Cubo cubo1 = new Cubo();

        Cubo cuboCopia= new Cubo(cubo1);

        Cubo cubo2 = new Cubo();
/*
        System.out.println("CUBO 5 " + cubo1.getContenidoActual());
        System.out.println(cubo1.getColor());

        System.out.println("Introduzca el material");
        material=sc.nextLine();

        System.out.println("Introduzca el color");
        color=sc.nextLine();

        System.out.println("Introduzca si tiene asa");
        asa= sc.nextBoolean();

        System.out.println("Introduzca la capacidad máxima");
        capacidadMaxima=sc.nextInt();

        System.out.println("Introduzca la capacidad actual");
        contenidoActual=sc.nextInt();


        cubo2.setMaterial(material);
        cubo2.setColor(color);
        cubo2.setAsa(asa);
        cubo2.setCapacidadMaxima(capacidadMaxima);
        cubo2.setContenidoActual(contenidoActual);


        System.out.println("cubo 2 tiene " + cubo2.getContenidoActual());

        cubo1.llenar(50);

        System.out.println("cubo 1 tiene tras llenarlo " + cubo1.getContenidoActual());



        cubo2.vaciar(40);

        System.out.println("afasfasfasf" + cubo2.getContenidoActual());


        cubo2.volcar(cubo1, 6);

        System.out.println("El cuvo 1 tiene estos lriasfafasfasf " + cubo1.getContenidoActual());
        System.out.println("comrpobar litros del que se vcacia " + cubo2.getContenidoActual());


 */

        cubo2.cubito();







    }
}
