/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package torneo;

import java.time.LocalDateTime;

/**
 *
 * @author Maxi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Torneo<EquipoFutbol> torneoFutbol
                = new Torneo<>("Liga Profesional");

        Torneo<EquipoBasquet> torneoBasquet
                = new Torneo<>("NBA");

        EquipoFutbol boca = new EquipoFutbol(
                "Boca Juniors",
                LocalDateTime.of(1905, 4, 3, 0, 0));

        EquipoFutbol river = new EquipoFutbol(
                "River Plate",
                LocalDateTime.of(1901, 5, 25, 0, 0));

        EquipoFutbol racing = new EquipoFutbol(
                "Racing Club",
                LocalDateTime.of(1903, 3, 25, 0, 0));

        EquipoBasquet lakers = new EquipoBasquet(
                "Los Angeles Lakers",
                LocalDateTime.of(1947, 1, 1, 0, 0));

        EquipoBasquet bulls = new EquipoBasquet(
                "Chicago Bulls",
                LocalDateTime.of(1966, 1, 1, 0, 0));

        EquipoBasquet celtics = new EquipoBasquet(
                "Boston Celtics",
                LocalDateTime.of(1946, 1, 1, 0, 0));

        torneoFutbol.agregar(boca);
        torneoFutbol.agregar(river);
        torneoFutbol.agregar(racing);

        torneoBasquet.agregar(lakers);
        torneoBasquet.agregar(bulls);
        torneoBasquet.agregar(celtics);

        System.out.println("¿Se pudo agregar Boca nuevamente?");
        System.out.println(torneoFutbol.agregar(boca));

        System.out.println("\n==============================");
        System.out.println(torneoFutbol.mostrar());

        System.out.println("==============================");
        System.out.println(torneoBasquet.mostrar());

        System.out.println("\nPARTIDOS DE FÚTBOL");

        for (int i = 0; i < 3; i++) {
            System.out.println(torneoFutbol.jugarPartido());
        }

        System.out.println("\nPARTIDOS DE BÁSQUET");

        for (int i = 0; i < 3; i++) {
            System.out.println(torneoBasquet.jugarPartido());
        }
    }

}
