/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ingresarvalidar;

import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class IngresarValidar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        String nombre;
        char genero;
        int edad;

        String nombreMayor = "";
        char generoMayor = ' ';
        int edadMayor = 0;

        int sumaEdades = 0;

        String nombre1 = "", nombre2 = "", nombre3 = "",
                nombre4 = "", nombre5 = "", nombre6 = "";

        char genero1 = ' ', genero2 = ' ', genero3 = ' ',
                genero4 = ' ', genero5 = ' ', genero6 = ' ';

        int edad1 = 0, edad2 = 0, edad3 = 0,
                edad4 = 0, edad5 = 0, edad6 = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.println("Persona " + i);
            System.out.print("Nombre: ");
            nombre = teclado.next();

            do {
                System.out.print("Edad: ");
                edad = teclado.nextInt();

            } while (edad <= 0);

            do {
                System.out.print("Genero (M/F/X): ");
                genero = teclado.next().toUpperCase().charAt(0);

            } while (genero != 'M'
                    && genero != 'F'
                    && genero != 'X');

            sumaEdades += edad;

            if (i == 1 || edad > edadMayor) {
                nombreMayor = nombre;
                edadMayor = edad;
                generoMayor = genero;
            }

            switch (i) {
                case 1:
                    nombre1 = nombre;
                    edad1 = edad;
                    genero1 = genero;
                    break;

                case 2:
                    nombre2 = nombre;
                    edad2 = edad;
                    genero2 = genero;
                    break;

                case 3:
                    nombre3 = nombre;
                    edad3 = edad;
                    genero3 = genero;
                    break;

                case 4:
                    nombre4 = nombre;
                    edad4 = edad;
                    genero4 = genero;
                    break;

                case 5:
                    nombre5 = nombre;
                    edad5 = edad;
                    genero5 = genero;
                    break;

                case 6:
                    nombre6 = nombre;
                    edad6 = edad;
                    genero6 = genero;
                    break;
            }

        }

        double promedio = (double) sumaEdades / 6;

        System.out.println("\nPersona con mayor edad:");
        System.out.println("Nombre: " + nombreMayor);
        System.out.println("Edad: " + edadMayor);
        System.out.println("Genero: " + generoMayor);
        System.out.println("\nGeneros con edad por debajo del promedio:");

        if (edad1 < promedio) {
            System.out.println(genero1);
        }

        if (edad2 < promedio) {
            System.out.println(genero2);
        }

        if (edad3 < promedio) {
            System.out.println(genero3);
        }

        if (edad4 < promedio) {
            System.out.println(genero4);
        }

        if (edad5 < promedio) {
            System.out.println(genero5);
        }

        if (edad6 < promedio) {
            System.out.println(genero6);
        }

        teclado.close();
    }

}
