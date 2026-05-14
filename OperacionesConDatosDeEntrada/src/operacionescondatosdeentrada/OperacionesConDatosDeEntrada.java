/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionescondatosdeentrada;

import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class OperacionesConDatosDeEntrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        int numeroEntero;
        double numeroDecimal;
        char caracter;

        System.out.print("Ingrese un número entero: ");
        numeroEntero = teclado.nextInt();

        System.out.print("Ingrese un número decimal: ");
        numeroDecimal = teclado.nextDouble();

        System.out.print("Ingrese un caracter: ");
        caracter = teclado.next().charAt(0);

        double suma = numeroEntero + numeroDecimal;

        int valorNumerico = (int) caracter;

        double promedio = (numeroEntero + numeroDecimal + valorNumerico) / 3;

        System.out.println("Suma: " + suma);

        System.out.println("Valor numérico del caracter: " + valorNumerico);

        System.out.println("Promedio: " + promedio);

        teclado.close();
    }

}
