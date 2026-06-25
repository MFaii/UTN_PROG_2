/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemasdeturnoshospital;

/**
 *
 * @author Maxi
 */
public class PacienteGuardia {
    
    private String nombre;
    private String motivo;

    public PacienteGuardia(String nombre, String motivo) {
        this.nombre = nombre;
        this.motivo = motivo;
    }
    
    @Override
    public String toString(){
        return nombre + " - " + motivo;
    }
    
}
