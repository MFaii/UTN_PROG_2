/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validadorderangos;

import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class ValidadorDeRangos {

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
        int contadorValidos = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.print("Ingrese un número: ");
            numero = teclado.nextInt();

            if (Validadora.validar(numero, -100, 100)) {

                if (contadorValidos == 0) {
                    maximo = numero;
                    minimo = numero;
                }

                if (numero > maximo) {
                    maximo = numero;
                }

                if (numero < minimo) {
                    minimo = numero;
                }

                suma += numero;
                contadorValidos++;

            } else {

                System.out.println(
                        "Número inválido. Debe estar entre -100 y 100");

            }
        }

        if (contadorValidos > 0) {

            double promedio
                    = (double) suma / contadorValidos;

            System.out.println("Valor máximo: " + maximo);
            System.out.println("Valor mínimo: " + minimo);
            System.out.println("Promedio: " + promedio);

        } else {

            System.out.println("No se ingresaron números válidos.");

        }

        teclado.close();
    }

}
