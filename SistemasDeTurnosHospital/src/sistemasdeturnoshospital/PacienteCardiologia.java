/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemasdeturnoshospital;

/**
 *
 * @author Maxi
 */
public class PacienteCardiologia {

    private String nombre;
    private String estudio;

    public PacienteCardiologia(String nombre, String estudio) {
        this.nombre = nombre;
        this.estudio = estudio;
    }

    @Override
    public String toString() {
        return nombre + " - " + estudio;
    }

}
