/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

/**
 *
 * @author Maxi
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche coche = new Coche(5, "VW", "Suran");
        System.out.println(coche.getMarca());
        coche.mostrarInformacion();
    }

}
