/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasesabstractas01;

/**
 *
 * @author Maxi
 */
public class ClasesAbstractas01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Abstracta no puede instarciarse
        PersonaUniversitaria pu;
        pu = new Estudiante("Daniel", "1234", "email@dominio.com", "Programacion 2");

        ((Estudiante) pu).realizarActividadPrincipal();

        PersonaUniversitaria pu2 = new Docente("Daniel", "4432", "email@email2.com", "Ingenieria");
        pu2.realizarActividadPrincipal();

        System.out.println(pu.toString());
    }

}
