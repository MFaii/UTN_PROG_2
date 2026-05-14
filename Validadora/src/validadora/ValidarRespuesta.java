/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validadora;

import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class ValidarRespuesta {

    public static boolean validarS_N() {

        Scanner teclado = new Scanner(System.in);

        char opcion;

        do {

            System.out.print("¿Continúa? (S/N): ");
            opcion = teclado.next().toUpperCase().charAt(0);

            if (opcion != 'S' && opcion != 'N') {

                System.out.println("Error. Ingrese S o N.");

            }

        } while (opcion != 'S' && opcion != 'N');

        return opcion == 'S';
    }
}
