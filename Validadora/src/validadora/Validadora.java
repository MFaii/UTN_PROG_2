/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validadora;

import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class Validadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        int numero;
        int suma = 0;

        do {

            System.out.print("Ingrese un número entero: ");
            numero = teclado.nextInt();

            suma += numero;

        } while (ValidarRespuesta.validarS_N());

        System.out.println("La suma total es: " + suma);

        teclado.close();
    }

}
