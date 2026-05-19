package sistemaexpediciones;

import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class SistemaExpediciones {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        AgenciaEspacial agencia = new AgenciaEspacial();

        int opcion;

        do {
            System.out.println();
            System.out.println("=== MENU DE GESTION DE EXPEDICIONES ESPACIALES ===");
            System.out.println("1. Agregar nave");
            System.out.println("2. Mostrar todas las naves");
            System.out.println("3. Iniciar exploracion");
            System.out.println("4. Mostrar naves ordenadas por nombre");
            System.out.println("5. Mostrar naves ordenadas por anio de lanzamiento(desc)");
            System.out.println("6. Mostrar naves ordenadas por tripulacion(desc)");
            System.out.println("7. Salir");

            System.out.print("Seleccione una opcion: ");
            while (!scanner.hasNextInt()) {

                System.out.println("Error. Ingrese un número.");

                scanner.nextLine();

                System.out.print("Seleccione una opción: ");
            }

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:

                    System.out.println("--- Tipo de nave ---");
                    System.out.println("1. Nave de exploracion");
                    System.out.println("2. Carguero");
                    System.out.println("3. Crucero estelar");

                    System.out.print("Seleccione tipo de nave: ");
                    while (!scanner.hasNextInt()) {

                        System.out.println("Error. Ingrese un numero.");

                        scanner.nextLine();

                        System.out.print("Seleccione tipo de nave: ");
                    }

                    int tipo = scanner.nextInt();

                    if (tipo < 1 || tipo > 3) {

                        System.out.println("Tipo invalido.");

                        break;
                    }

                    scanner.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    if (nombre.trim().isEmpty()) {

                        System.out.println("Nombre invalido. Debe ingresar un nombre");

                        break;
                    }

                    System.out.print("Capacidad de tripulacion: ");
                    while (!scanner.hasNextInt()) {

                        System.out.println("Error. Ingrese un numero.");

                        scanner.nextLine();

                        System.out.print("Capacidad de tripulacion: ");
                    }

                    int tripulacion = scanner.nextInt();

                    System.out.print("Año de lanzamiento: ");
                    while (!scanner.hasNextInt()) {

                        System.out.println("Error. Ingrese un numero.");

                        scanner.nextLine();

                        System.out.print("Anio de lanzamiento: ");
                    }

                    int anio = scanner.nextInt();

                    if (tripulacion <= 0) {

                        System.out.println("Tripulacion invalida.");

                        break;
                    }

                    if (anio < 1900) { // 1900 como año minimo

                        System.out.println("Anio invalido.");

                        break;
                    }

                    Nave nave = null;

                    switch (tipo) {

                        case 1:

                            scanner.nextLine();

                            System.out.print("Tipo de mision: ");
                            String mision = scanner.nextLine();

                            if (mision.trim().isEmpty()) {

                                System.out.println("Mision invalida.");

                                break;
                            } else if (!mision.equalsIgnoreCase("CARTOGRAFIA")
                                    && !mision.equalsIgnoreCase("INVESTIGACION")
                                    && !mision.equalsIgnoreCase("CONTACTO")) {

                                System.out.println("Tipo de mision invalido.");

                                break;
                            }

                            nave = new NaveExploracion(nombre, tripulacion, anio, mision);

                            break;

                        case 2:

                            System.out.print("Capacidad de carga (100 a 500): ");
                            while (!scanner.hasNextInt()) {

                                System.out.println("Error. Ingrese un número.");

                                scanner.nextLine();

                                System.out.print("Capacidad de carga: ");
                            }

                            int carga = scanner.nextInt();

                            if (carga < 100 || carga > 500) {

                                System.out.println("Carga invalida.");

                                break;
                            }

                            nave = new Carguero(nombre, tripulacion, anio, carga);

                            break;

                        case 3:

                            System.out.print("Cantidad de pasajeros: ");
                            while (!scanner.hasNextInt()) {

                                System.out.println("Error. Ingrese un número.");

                                scanner.nextLine();

                                System.out.print("Cantidad de pasajeros: ");
                            }

                            int pasajeros = scanner.nextInt();

                            if (pasajeros <= 0) {

                                System.out.println("Cantidad invalida.");

                                break;
                            }

                            nave = new CruceroEstelar(nombre, tripulacion, anio, pasajeros);

                            break;

                        default:

                            System.out.println("Tipo invalido.");
                    }

                    if (nave != null) {

                        agencia.agregarNave(nave);

                    }

                    break;
                case 2:
                    agencia.mostrarNaves();
                    break;
                case 3:
                    agencia.iniciarExploraciones();
                    break;
                case 4:
                    agencia.ordenarPorNombre();
                    break;
                case 5:
                    agencia.ordenarPorAnioDesc();
                    break;
                case 6:
                    agencia.ordenarPorTripulacionDesc();
                    break;
                case 7:
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Opcion invalida, ingrese 1-7");
            }
            System.out.println();
        } while (opcion != 7);
        scanner.close();
    }

}
