/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemapagospolimorfismo;

/**
 *
 * @author Maxi
 */
public class PagoTransferencia extends Pago {

    private String cbuOrigen;
    private String aliasDestino;

    public PagoTransferencia(double monto) {
        super(monto, "Transferencia Bancaria", "AR$");
        this.cbuOrigen = "no informado";
        this.aliasDestino = "no informado";
    }

    public PagoTransferencia(String cbuOrigen, String aliasDestino, double monto, String moneda) {
        super(monto, "Transferencia Bancaria", moneda);
        this.cbuOrigen = cbuOrigen;
        this.aliasDestino = aliasDestino;
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando pago por transferencia");
        System.out.println("Monto a pagar: " + monto + " " + moneda);
        System.out.println("CBU Origen: " + cbuOrigen);
        System.out.println("Alias destino: " + aliasDestino);

        if (!cbuOrigen.equals("no informado") && !aliasDestino.equals("no informado")) {
            System.out.println("Transferencia realizada correctamente");
        } else {
            System.out.println("Transferencia pendiente. Faltan datos");
        }
    }

    public void generarComprobanteTransferencia() {
        System.out.println("Comprobante trasnferencia generado");
    }

}
