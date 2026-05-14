/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appsmarttvcontrolremoto;

/**
 *
 * @author Maxi
 */
public class SmartTv {

    private String marca;
    private boolean encendido;
    private int canalActual;
    private int volumenActual;

    private int volumenAnterior;

    public SmartTv(String marca) {
        this.marca = marca;
        this.encendido = false;
        this.canalActual = 1;
        this.volumenActual = 10;
        this.volumenAnterior = 10;
    }

    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("El Smart TV se encendio.");
        } else {
            System.out.println("El Smart TV ya estaba encendido.");
        }
    }

    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println("El Smart TV se apago.");
        } else {
            System.out.println("El Smart TV ya estaba apagado.");
        }
    }

    public void subirVolumen() {
        if (encendido) {
            if (volumenActual < 100) {
                volumenActual++;
                System.out.println("Volumen actual: " + volumenActual);
            } else {
                System.out.println("El volumen esta al maximo.");
            }
        } else {
            System.out.println("No se puede subir el volumen.El tv esta apagado.");
        }
    }

    public void bajarVolumen() {
        if (encendido) {
            if (volumenActual > 0) {
                volumenActual--;
                System.out.println("Volumen actual: " + volumenActual);
            } else {
                System.out.println("El volumen esta al minimo.");
            }
        } else {
            System.out.println("No se puede subir el volumen.El tv esta apagado.");
        }
    }

    public void cambiarCanal(int nuevoCanal) {
        if (encendido) {
            if (nuevoCanal >= 1 && nuevoCanal <= 999) {
                canalActual = nuevoCanal;
                System.out.println("Canal cambiado al: " + canalActual);
            } else {
                System.out.println("Canal invalido, debe estar entre 1 y 999");
            }
        } else {
            System.out.println("No se puede cambiar el canal.El tv esta apagado.");
        }
    }

    public void mostrarEstado() {
        System.out.println("--- Estado del SmartTv ---");
        System.out.println("Marca: " + marca);
        System.out.println("Encendido: " + encendido);
        System.out.println("Canal actual: " + canalActual);
        System.out.println("Volumen actual: " + volumenActual);
    }

    public boolean estaEncendido() {
        return encendido;
    }

    public void mutear() {
        if (encendido) {
            if (volumenActual != 0) {
                volumenAnterior = volumenActual;
                volumenActual = 0;
            } else {
                volumenActual = volumenAnterior;
            }
            System.out.println("Smart TV muteado." + volumenActual);
        } else {
            System.out.println("No se puede mutear la tv esta apagada.");
        }
    }
}
