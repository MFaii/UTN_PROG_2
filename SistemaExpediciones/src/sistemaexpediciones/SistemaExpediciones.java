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
            Utilidades.mostrarTitulo("MENU DE GESTION DE EXPEDICIONES ESPACIALES");
            Utilidades.mostrarOpcion("1. Agregar nave");
            Utilidades.mostrarOpcion("2. Mostrar todas las naves");
            Utilidades.mostrarOpcion("3. Iniciar exploracion");
            Utilidades.mostrarOpcion("4. Mostrar naves ordenadas por nombre");
            Utilidades.mostrarOpcion("5. Mostrar naves ordenadas por anio de lanzamiento(desc)");
            Utilidades.mostrarOpcion("6. Mostrar naves ordenadas por tripulacion(desc)");
            Utilidades.mostrarOpcion("7. Salir");

            opcion = Utilidades.pedirOpcionMenu(scanner, 1, 7);

            switch (opcion) {

                case 1:

                    Utilidades.mostrarTitulo("TIPO DE NAVE");
                    Utilidades.mostrarOpcion("1. Nave de exploracion");
                    Utilidades.mostrarOpcion("2. Carguero");
                    Utilidades.mostrarOpcion("3. Crucero estelar");

                    int tipo = Utilidades.pedirEnteroEnRango(scanner, "Seleccione el tipo de nave: ", 1, 3);

                    String nombre = Utilidades.pedirTexto(scanner, "Nombre: ");

                    int tripulacion = Utilidades.pedirEnteroPositivo(scanner, "Capacidad de tripulacion: ");

                    int anio = Utilidades.pedirEnteroEnRango(scanner, "Anio de lanzamiento", 1900, 4000);

                    Nave nave = null;

                    switch (tipo) {

                        case 1:

                            String mision = Utilidades.pedirTexto(scanner, "Tipo de mision: ");

                            if (!Utilidades.validarOpcionTexto3(mision, "CARTOGRAFIA", "INVESTIGACION", "CONTACTO")) {
                                System.out.println("Tipo de mision invalida.");
                                break;
                            }

                            nave = new NaveExploracion(nombre, tripulacion, anio, mision);
                            break;

                        case 2:

                            int carga = Utilidades.pedirEnteroEnRango(scanner, "Capacidad de carga(100-500): ", 100, 500);

                            nave = new Carguero(nombre, tripulacion, anio, carga);

                            break;

                        case 3:

                            int pasajeros = Utilidades.pedirEnteroPositivo(scanner, "Cantidad de pasajeros: ");

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
                    Utilidades.apagarPrograma("Programa finalizado");
                    break;
                default:
                    System.out.println("Opcion invalida, ingrese 1-7");
            }
            System.out.println();
        } while (opcion != 7);
        scanner.close();
    }

}
