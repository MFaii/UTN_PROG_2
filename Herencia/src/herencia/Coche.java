/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author Maxi
 */
public class Coche extends Vehiculo {

    private int cantidadPuertas;

    public Coche(int cantidadPuertas, String marca, String modelo) {
        super(marca, modelo); // llamada al constructor de la clase padre
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Cantidad de puertas: " + cantidadPuertas);
    }

}
