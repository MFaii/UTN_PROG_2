/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaexpediciones;

/**
 *
 * @author Maxi
 */
public abstract class Nave implements Comparable<Nave> {

    protected String nombre;
    protected int capacidadTripulacion;
    protected int anioLanzamiento;

    public Nave(String nombre, int capacidadTripulacion, int anioLanzamiento) {

        if (nombre != null && !nombre.isEmpty()) {

            this.nombre = nombre;

        } else {

            this.nombre = "Sin nombre asignado";

            System.out.println("Nombre inválido.");
        }

        if (capacidadTripulacion > 0) {

            this.capacidadTripulacion = capacidadTripulacion;

        } else {

            this.capacidadTripulacion = 1;

            System.out.println("Capacidad de tripulación invalida.");
        }

        if (anioLanzamiento >= 1900) {

            this.anioLanzamiento = anioLanzamiento;

        } else {

            this.anioLanzamiento = 1900;

            System.out.println("Año de lanzamiento invalido.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidadTripulacion() {
        return capacidadTripulacion;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    @Override
    public String toString() {
        return "Nave{" + "nombre=" + nombre + ", capacidadTripulacion=" + capacidadTripulacion + ", anioLanzamiento=" + anioLanzamiento + '}';
    }

    @Override
    public int compareTo(Nave otra) {
        return this.nombre.compareTo(otra.nombre);
    }

}
