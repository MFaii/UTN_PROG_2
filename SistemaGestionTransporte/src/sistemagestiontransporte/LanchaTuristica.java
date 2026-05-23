/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestiontransporte;

/**
 *
 * @author Maxi
 */
public class LanchaTuristica extends Vehiculo implements ITurismo {

    private String tipoMotor;

    public LanchaTuristica(String patente, String marca, int capacidadPasajeros, int anioFabricacion, String tipoMotor) {
        super(patente, marca, capacidadPasajeros, anioFabricacion);

        if (tipoMotor != null && !tipoMotor.isEmpty()) {
            this.tipoMotor = tipoMotor;
        } else {
            this.tipoMotor = "Motor no valido";
        }
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Tipo de motor: "
                + tipoMotor;
    }

    @Override
    public void iniciarServiciosTuristicos() {
        System.out.println("El vehiculo con patente: " + patente + " Inicio el servicio turistico");
    }

}
