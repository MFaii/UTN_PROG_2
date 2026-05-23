/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestiontransporte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Maxi
 */
public class AgenciaTurismo {

    private ArrayList<Vehiculo> vehiculos;

    public AgenciaTurismo() {
        vehiculos = new ArrayList<>();
    }

    private boolean existeVehiculo(String patente) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPatente().equals(patente)) {
                return true;
            }
        }
        return false;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        if (existeVehiculo(vehiculo.getPatente())) {
            System.out.println("El vehiculo ya existe!");
        } else {
            vehiculos.add(vehiculo);
            System.out.println("Vehiculo agregado con exito.");
        }
    }

    public void mostrarVehiculos() {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
    }

    public void iniciarServiciosTuristicos() {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo instanceof ITurismo) {
                ITurismo turismo = (ITurismo) vehiculo;
                turismo.iniciarServiciosTuristicos();
            }
        }
    }

    public void ordenarPorAnioFabricacionDesc() {

        Collections.sort(vehiculos, new Comparator<Vehiculo>() {

            @Override
            public int compare(Vehiculo v1, Vehiculo v2) {

                return v2.getAnioFabricacion()
                        - v1.getAnioFabricacion();
            }
        });

        mostrarVehiculos();
    }

    public void ordenarPorCapacidadPasajerosDesc() {

        Collections.sort(vehiculos, new Comparator<Vehiculo>() {

            @Override
            public int compare(Vehiculo v1, Vehiculo v2) {

                return v2.getCapacidadPasajeros()
                        - v1.getCapacidadPasajeros();
            }
        });

        mostrarVehiculos();
    }
}
