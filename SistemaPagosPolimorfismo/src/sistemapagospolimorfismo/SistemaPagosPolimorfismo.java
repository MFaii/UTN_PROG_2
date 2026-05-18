/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemapagospolimorfismo;

/**
 *
 * @author Maxi
 */
public class SistemaPagosPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("SISTEMA COMERCIAL DE PAGOS");
        System.out.println("==========================");

        // Sobrecarga de constructores
        Pago pagoGen1 = new Pago(15000);
        Pago pagoGen2 = new Pago(25000, "Medio no especificado", "USD");

        System.out.println("\n --- PAGOS GENERICOS ---");
        pagoGen1.procesarPago();
        System.out.println("");
        pagoGen2.procesarPago();

        // Objetos especificos
        PagoEfectivo pagoEfectivo = new PagoEfectivo(10000, "AR$", 12000);

        PagoTarjetaCredito pagoCredito = new PagoTarjetaCredito(50000, "AR$", "4590123459520800", 9);

        PagoTransferencia pagoTransferencia = new PagoTransferencia("029357", "oro.plata.bronce", 100000, "R$");

        System.out.println("\n --- Polimorfismo ---");

        /*
        Polimorfismo 
        una variable de tipo pago que puede apuntar a objetos de sus clase hijas
         */
        Pago[] pagos = new Pago[3];

        pagos[0] = pagoEfectivo;
        pagos[1] = pagoCredito;
        pagos[2] = pagoTransferencia;

        for (int i = 0; i < pagos.length; i++) {
            System.out.println("\n Pago numero: " + (i + 1));
            pagos[i].procesarPago();
        }

        System.out.println("\n --- Casteo ---");

        /*
        aunque pagos[0] contiene un PagoEfectivo
        la variable es de tipo Pago
        para acceder a los metodos de PagoEfectivo, necesitamos castear
         */
        Pago p = new PagoEfectivo(30000, "AR$", 35000);
        p.procesarPago();

        // CASTEAR
        if (p instanceof PagoEfectivo) {
            PagoEfectivo efectivo = (PagoEfectivo) p;
            efectivo.imprimirReciboEfectivo();
        }

        System.out.println("\n --- Casteo dentro del Array ---");

        for (Pago p1 : pagos) {
            p1.procesarPago();

            if (p1 instanceof PagoEfectivo) {
                PagoEfectivo pe = (PagoEfectivo) p1;
                pe.imprimirReciboEfectivo();
            }

            if (p1 instanceof PagoTarjetaCredito) {
                PagoTarjetaCredito pc = (PagoTarjetaCredito) p1;
                pc.validarTarjeta();
            }

            // Para que realice una excepcion
//            if (p1 instanceof PagoTransferencia) {
//                PagoEfectivo pee = (PagoEfectivo) p1;
//            }

            if (p1 instanceof PagoTransferencia) {
                PagoTransferencia pt = (PagoTransferencia) p1;
                pt.generarComprobanteTransferencia();
            }
        }

        System.out.println("---- Finalizacion ----");
    }

}
