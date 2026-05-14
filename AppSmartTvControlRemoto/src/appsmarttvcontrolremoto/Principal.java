/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appsmarttvcontrolremoto;

import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creamos y asociamos 
        SmartTv unTv = new SmartTv("Samsung");
        ControlRemoto control = new ControlRemoto(unTv);

        int opcion;

        do {
            mostrarMenu();
            System.out.println("Seleccione una opcion:");

            // Validacion de ingreso de entero
            while (!scanner.hasNextInt()) {
                System.out.println("Error debe ingresar un numero: ");
                scanner.next();
            }

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    control.presionarBotonPower();
                    break;
                case 2:
                    System.out.println("Ingrese canal (1-999): ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Error: debe ingresar un numero.");
                        System.out.println("Ingrese canal (1-999): ");
                        scanner.next();
                    }
                    int canal = scanner.nextInt();
                    control.presionarBotonCanal(canal);
                    break;
                case 3:
                    control.presionarBotonSubirVolumen();
                    break;
                case 4:
                    control.presionarBotonBajarVolumen();
                    break;
                case 5:
                    control.presionarBotonInfo();
                    break;
                case 6:
                    control.presionarBotonMutear();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema.");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            System.out.println();
        } while (opcion != 0);
        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("--- Control Remoto ---");
        System.out.println("1.Encender/Apagar");
        System.out.println("2.Cambiar canal");
        System.out.println("3.Subir volumen");
        System.out.println("4.Bajar volumen");
        System.out.println("5.Mostrar estado del Tv");
        System.out.println("6.Mutear");
        System.out.println("0.Salir");
    }
}
