/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maximominimopromedio;

import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class MaximoMinimoPromedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        int numero;
        int maximo = 0;
        int minimo = 0;
        int suma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese un numero: ");
            numero = teclado.nextInt();

            if (i == 1) {
                maximo = numero;
                minimo = numero;
            }

            if (numero > maximo) {
                maximo = numero;
            }

            if (numero < minimo) {
                minimo = numero;
            }

            suma = suma + numero;
        }

        double promedio = (double) suma / 5;

        System.out.println("Valor máximo: " + maximo);
        System.out.println("Valor mínimo: " + minimo);
        System.out.println("Promedio: " + promedio);

        teclado.close();
    }

}
