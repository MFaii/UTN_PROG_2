/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaexpediciones;

/**
 *
 * @author Maxi
 */
public class Carguero extends Nave implements IExplorable {

    private int capacidadCarga;

    public Carguero(String nombre, int capacidadTripulacion, int anioLanzamiento, int capacidadCarga) {
        super(nombre, capacidadTripulacion, anioLanzamiento);

        if (capacidadCarga < 100) {
            this.capacidadCarga = 100;
        } else if (capacidadCarga > 500) {
            this.capacidadCarga = 500;
        } else {
            this.capacidadCarga = capacidadCarga;
        }
    }

    @Override
    public String toString() {

        return super.toString()
                + " | Carga: "
                + capacidadCarga;
    }

    @Override
    public void iniciarExploracion() {

        System.out.println(
                nombre
                + " inicio exploracion de carga."
        );
    }

}
