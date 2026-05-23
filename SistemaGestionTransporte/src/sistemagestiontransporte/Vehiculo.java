/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestiontransporte;

/**
 *
 * @author Maxi
 */
public abstract class Vehiculo {

    protected String patente;
    protected String marca;
    protected int capacidadPasajeros;
    protected int anioFabricacion;

    public Vehiculo(String patente, String marca, int capacidadPasajeros, int anioFabricacion) {

        if (patente != null && !patente.isEmpty()) {
            this.patente = patente;
        } else {
            this.patente = "Sin patente asignada.";
            System.out.println("Patente invalida.");
        }

        if (marca != null && !marca.isEmpty()) {
            this.marca = marca;
        } else {
            this.marca = "Sin patente asignada.";
            System.out.println("Marca invalida.");
        }

        if (capacidadPasajeros > 0) {
            this.capacidadPasajeros = capacidadPasajeros;
        } else {
            this.capacidadPasajeros = 1;
            System.out.println("Capacidad de pasajeros invalida.");
        }

        if (anioFabricacion >= 1990 && anioFabricacion <= 2026) {
            this.anioFabricacion = anioFabricacion;
        } else {
            this.anioFabricacion = 1990;
            System.out.println("Anio de fabricacion invalido.");
        }
    }

    public String getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", marca=" + marca + ", capacidadPasajeros=" + capacidadPasajeros + ", anioFabricacion=" + anioFabricacion + '}';
    }

}
