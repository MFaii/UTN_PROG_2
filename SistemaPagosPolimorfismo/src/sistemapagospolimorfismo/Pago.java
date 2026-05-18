/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemapagospolimorfismo;

/**
 *
 * @author Maxi
 */
public class Pago {

    protected double monto;
    protected String medioPago;
    protected String moneda;

    public Pago() {
        this.monto = 0;
        this.medioPago = "No definido";
        this.moneda = "AR$";
    }

    public Pago(double monto) {
        this.monto = monto;
        this.medioPago = "No definido";
        this.moneda = "AR$";
    }

    public Pago(double monto, String medioPago, String moneda) {
        this.monto = monto;
        this.medioPago = medioPago;
        this.moneda = moneda;
    }

    public void procesarPago() {
        System.out.println("Procesando pago generico...");
        System.out.println("Monto: " + monto + moneda);
    }

    public void mostrarDatos() {
        System.out.println("Monto: " + monto);
        System.out.println("Medio de pago: " + medioPago);
        System.out.println("Moneda: " + moneda);
    }

    public double getMonto() {
        return monto;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public String getMoneda() {
        return moneda;
    }

}
