/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package potencias;

import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class Potencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        double numero;

        System.out.print("Ingrese un número: ");
        numero = teclado.nextDouble();
        if (numero > 0) {

            double cuadrado = Math.pow(numero, 2);
            double cubo = Math.pow(numero, 3);

            System.out.println("Cuadrado: " + cuadrado);
            System.out.println("Cubo: " + cubo);

        } else {

            System.out.println("Error. Reingresar número");

        }

        teclado.close();
    }

}
