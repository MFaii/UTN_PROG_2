/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enfoquesinpolimorfismo;

/**
 *
 * @author Maxi
 */
public class EnfoqueSinPolimorfismo {

    public static final int EMAIL = 1;
    public static final int SMS = 2;
    public static final int APP = 3;

    public void enviarMensaje(int tipo, String mensaje) {
        if (tipo == EMAIL) {
            System.out.println("Enviando mail: " + mensaje);
        } else if (tipo == SMS) {
            System.out.println("Enviando sms: " + mensaje);
        } else if (tipo == APP) {
            System.out.println("Enviando app: " + mensaje);
        } else {
            System.out.println("Tipo de notif no valida");
        }
    }

    public static void main(String[] args) {
        EnfoqueSinPolimorfismo sistema = new EnfoqueSinPolimorfismo();

        sistema.enviarMensaje(EMAIL, "Reunion 10 hrs");
        sistema.enviarMensaje(SMS, "Recordatorio sms");
        sistema.enviarMensaje(APP, "Msj app");

    }

}
