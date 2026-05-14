/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appsmarttvcontrolremoto;

/**
 *
 * @author Maxi
 */
public class ControlRemoto {

    private SmartTv tv;

    public ControlRemoto(SmartTv tv) {
        this.tv = tv;
    }

    public void presionarBotonPower() {
        if (tv.estaEncendido()) {
            tv.apagar();
        } else {
            tv.encender();
        }
    }

    public void presionarBotonSubirVolumen() {
        tv.subirVolumen();
    }

    public void presionarBotonBajarVolumen() {
        tv.bajarVolumen();
    }

    public void presionarBotonCanal(int canal) {
        tv.cambiarCanal(canal);
    }

    public void presionarBotonMutear() {
        tv.mutear();
    }

    public void presionarBotonInfo() {
        tv.mostrarEstado();
    }
}
