/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemapagospolimorfismo;

/**
 *
 * @author Maxi
 */
public class PagoEfectivo extends Pago {

    private double dineroRecibido;

    public PagoEfectivo(double monto) {
        super(monto, "Efectivo", "AR$");
        this.dineroRecibido = monto;
    }

    public PagoEfectivo(double monto, String moneda, double dineroRecibido) {
        super(monto, "Efectivo", moneda);
        this.dineroRecibido = dineroRecibido;
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando pago en efectivo");
        System.out.println("Manto a pagar: " + monto + " " + moneda);
        System.out.println("Dinero recibido: " + dineroRecibido + " " + moneda);

        if (dineroRecibido >= monto) {
            double vuelto = dineroRecibido - monto;
            System.out.println("Su vuelto es: " + vuelto + " " + moneda);
        } else {
            System.out.println("Pago rechazado.");
        }
    }

    public void imprimirReciboEfectivo() {
        System.out.println("Recibo de pago en efectivo generado.");
    }

}
