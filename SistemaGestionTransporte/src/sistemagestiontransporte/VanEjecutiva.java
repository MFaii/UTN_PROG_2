/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestiontransporte;

/**
 *
 * @author Maxi
 */
public class VanEjecutiva extends Vehiculo implements ITurismo {

    private boolean aireAcondicionado;

    public VanEjecutiva(String patente, String marca, int capacidadPasajeros, int anioFabricacion, boolean aireAcondicionado) {
        super(patente, marca, capacidadPasajeros, anioFabricacion);

        this.aireAcondicionado = aireAcondicionado;
    }

    @Override
    public String toString() {
        return super.toString()
                + " | aire acondicionado: "
                + aireAcondicionado;
    }

    @Override
    public void iniciarServiciosTuristicos() {
        System.out.println("El vehiculo con patente: " + patente + " Inicio el servicio turistico");
    }
}
