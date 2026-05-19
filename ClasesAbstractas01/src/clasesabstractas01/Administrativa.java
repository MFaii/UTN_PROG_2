/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesabstractas01;

/**
 *
 * @author Maxi
 */
public class Administrativa extends PersonaUniversitaria implements FirmaDigital {

    public Administrativa(String nombre, String dni, String email) {
        super(nombre, dni, email);
    }

    @Override
    public void realizarActividadPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
