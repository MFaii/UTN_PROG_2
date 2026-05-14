/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        double numero1;
        double numero2;
        double resultado;

        char operacion;
        char continuar;

        do {
            System.out.print("Ingrese el primer número: ");
            numero1 = teclado.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            numero2 = teclado.nextDouble();

            System.out.print("Ingrese operación (+,-,*,/): ");
            operacion = teclado.next().charAt(0);

            resultado = Calculadora.calcular(
                    numero1,
                    numero2,
                    operacion
            );
            System.out.println("Resultado: " + resultado);

            System.out.print("¿Desea continuar? (S/N): ");
            continuar = teclado.next().toUpperCase().charAt(0);

        } while (continuar == 'S');
        teclado.close();
    }

}
