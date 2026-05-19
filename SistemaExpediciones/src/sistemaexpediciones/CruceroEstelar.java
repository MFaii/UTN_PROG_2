/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaexpediciones;

/**
 *
 * @author Maxi
 */
public class CruceroEstelar extends Nave {

    private int cantidadPasajeros;

    public CruceroEstelar(String nombre, int capacidadTripulacion, int anioLanzamiento, int cantidadPasajeros) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        if (cantidadPasajeros > 0) {

            this.cantidadPasajeros = cantidadPasajeros;

        } else {

            this.cantidadPasajeros = 1;
        }
    }

    @Override
    public String toString() {

        return super.toString()
                + " | Pasajeros: "
                + cantidadPasajeros;
    }

}
