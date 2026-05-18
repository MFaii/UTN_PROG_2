/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemapagospolimorfismo;

/**
 *
 * @author Maxi
 */
public class PagoTarjetaCredito extends Pago {

    private String numeroTarjeta;
    private int cuotas;

    public PagoTarjetaCredito(double monto) {
        super(monto, "Tarjeta de credito", "AR$");
        this.numeroTarjeta = "No informado";
        this.cuotas = 1;
    }

    public PagoTarjetaCredito(double monto, String moneda, String numeroTarjeta, int cuotas) {
        super(monto, "Tarjeta de credito", moneda);
        this.numeroTarjeta = numeroTarjeta;
        this.cuotas = cuotas;
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando pago en tarjeta de credito");
        System.out.println("Manto a pagar: " + monto + " " + moneda);
        System.out.println("Tarjeta: **** **** ****" + obtenerUltimosCuatroDijitos());
        System.out.println("Cuotas: " + cuotas);

        if (cuotas > 0 && cuotas < 12) {
            System.out.println("Pago aceptado");
        } else {
            System.out.println("Pago rechazado.Cantidad de cuotas invalida");
        }
    }

    public void validarTarjeta() {
        System.out.println("Validando tarjeta.");
        System.out.println("Tarjeta validada.");
    }

    public String obtenerUltimosCuatroDijitos() {
        if (numeroTarjeta.length() >= 4) {
            return numeroTarjeta.substring(numeroTarjeta.length() - 4);
        }
        return "XXXX";
    }
}
