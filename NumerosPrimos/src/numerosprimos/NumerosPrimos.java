/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosprimos;

import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class NumerosPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un número: ");
        numero = teclado.nextInt();

        System.out.println("Números primos hasta " + numero + ":");
        for (int i = 2; i <= numero; i++) {

            boolean esPrimo = true;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    esPrimo = false;
                }

            }

            if (esPrimo) {
                System.out.println(i);
            }

        }

        teclado.close();
    }

}
