/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemagestiontransporte;

import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class SistemaGestionTransporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        AgenciaTurismo agencia = new AgenciaTurismo();

        int opcion;

        do {
            System.out.println();
            Utilidades.mostrarTitulo("Sistema de Gestion de Transporte Turistico");
            Utilidades.mostrarOpcion("1. Agregar vehiculo.");
            Utilidades.mostrarOpcion("2. Mostrar todos los vehiculos.");
            Utilidades.mostrarOpcion("3. Realizar servicios turisticos.");
            Utilidades.mostrarOpcion("4. Buscar vehiculo por patente.");
            Utilidades.mostrarOpcion("5. Mostrar vehiculos con capacidad mayor a un valor ingresado.");
            Utilidades.mostrarOpcion("6. Mostrar vehiculos ordenados por anio de fabricacion descendente.");
            Utilidades.mostrarOpcion("7. Mostrar vehiculos ordenados por capacidad de pasajeros descendente.");
            Utilidades.mostrarOpcion("8. Salir.");

            opcion = Utilidades.pedirOpcionMenu(scanner, 1, 8);

            switch (opcion) {

                case 1:

                    Utilidades.mostrarTitulo("Tipo de vehiculo");
                    Utilidades.mostrarOpcion("1. Colectivo Turistico");
                    Utilidades.mostrarOpcion("2. Van Ejecutiva");
                    Utilidades.mostrarOpcion("3. Lancha Turistica");
                    int tipo = Utilidades.pedirEnteroEnRango(scanner, "Seleccione el tipo de vehiculo: ", 1, 3);

                    String patente = Utilidades.pedirTexto(scanner, "Patente: ");
                    String marca = Utilidades.pedirTexto(scanner, "Marca: ");
                    int capacidadPasajeros = Utilidades.pedirEnteroPositivo(scanner, "Capacidad de pasajeros: ");
                    int anioFabricacion = Utilidades.pedirEnteroEnRango(scanner, "Anio de fabricacion", 1990, 2026);

                    Vehiculo vehiculo = null;

                    switch (tipo) {

                        case 1:
                            int cantidadPisos = Utilidades.pedirEnteroEnRango(scanner, "Cantidad de pisos", 1, 2);
                            vehiculo = new ColectivoTuristico(patente, marca, capacidadPasajeros, anioFabricacion, cantidadPisos);
                            break;

                        case 2:
                            boolean aireAcondicionado = Utilidades.pedirBoolean(scanner, "Ingrese true si tiene aire acondicionado, de caso contrario ingrese false.");
                            vehiculo = new VanEjecutiva(patente, marca, capacidadPasajeros, anioFabricacion, aireAcondicionado);
                            break;

                        case 3:
                            String tipoMotor = Utilidades.pedirTexto(scanner, "Tipo de motor: ");
                            if (!Utilidades.validarOpcionTexto3(tipoMotor, "NAFTA", "DIESEL", "ELECTRICO")) {
                                System.out.println("Tipo de motor invalido.");
                                break;
                            }
                            vehiculo = new LanchaTuristica(patente, marca, capacidadPasajeros, anioFabricacion, tipoMotor);
                            break;

                        default:

                            System.out.println("Vehiculo invalido.");

                    }

                    if (vehiculo != null) {
                        agencia.agregarVehiculo(vehiculo);
                    }

                    break;

                case 2:
                    agencia.mostrarVehiculos();
                    break;

                case 3:
                    agencia.iniciarServiciosTuristicos();
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    agencia.ordenarPorAnioFabricacionDesc();
                    break;

                case 7:
                    agencia.ordenarPorCapacidadPasajerosDesc();
                    break;

                case 8:
                    Utilidades.apagarPrograma("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion invalida, ingrese 1-8");

            }
            System.out.println();
        } while (opcion != 8);
        scanner.close();
    }

}
