/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestiontransporte;

/**
 *
 * @author Maxi
 */
public class ColectivoTuristico extends Vehiculo implements ITurismo {

    private int cantidadPisos;

    public ColectivoTuristico(String patente, String marca, int capacidadPasajeros, int anioFabricacion, int cantidadPisos) {
        super(patente, marca, capacidadPasajeros, anioFabricacion);

        if (cantidadPisos == 1 || cantidadPisos == 2) {
            this.cantidadPisos = cantidadPisos;
        } else {
            this.cantidadPisos = 1; //Def
            System.out.println("Cantidad de pisos invalida. 1 por defecto.");
        }
    }

    @Override
    public String toString() {

        return super.toString()
                + " | cantidad de pisos: "
                + cantidadPisos;
    }

    @Override
    public void iniciarServiciosTuristicos() {
        System.out.println("El vehiculo con patente: " + patente + " Inicio el servicio turistico");
    }

}
