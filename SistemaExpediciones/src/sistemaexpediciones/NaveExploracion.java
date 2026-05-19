/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaexpediciones;

/**
 *
 * @author Maxi
 */
public class NaveExploracion extends Nave implements IExplorable {

    private String tipoMision;

    public NaveExploracion(String nombre, int capacidadTripulacion, int anioLanzamiento, String tipoMision) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        if (tipoMision != null
                && !tipoMision.isEmpty()) {

            this.tipoMision = tipoMision;

        } else {

            this.tipoMision = "DESCONOCIDA";
        }
    }

    @Override
    public String toString() {

        return super.toString()
                + " | Mision: "
                + tipoMision;
    }

    @Override
    public void iniciarExploracion() {
        System.out.println(
                nombre
                + " inicio mision de "
                + tipoMision
        );
    }

}
