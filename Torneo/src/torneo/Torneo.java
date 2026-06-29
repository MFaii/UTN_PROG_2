/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package torneo;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Maxi
 */
public class Torneo<T extends Equipo> {

    private String nombre;
    private ArrayList<T> equipos;
    private Random random;

    public Torneo(String nombre) {
        this.nombre = nombre;
        this.equipos = new ArrayList<>();
        this.random = new Random();
    }

    public boolean agregar(T equipo) {

        if (!equipos.contains(equipo)) {
            equipos.add(equipo);
            return true;
        }

        return false;
    }

    public String mostrar() {

        StringBuilder sb = new StringBuilder();

        sb.append("Torneo: ").append(nombre).append("\n");
        sb.append("Equipos participantes:\n");

        for (T equipo : equipos) {
            sb.append(equipo.getFicha()).append("\n");
        }

        return sb.toString();
    }

    private String calcularPartido(T equipo1, T equipo2) {

        int resultado1 = random.nextInt(6);
        int resultado2 = random.nextInt(6);

        return "[" + equipo1.getNombre() + "][" + resultado1 + "] - [" + resultado2 + "][" + equipo2.getNombre() + "]";
    }

    public String jugarPartido() {

        if (equipos.size() < 2) {
            return "No hay suficientes equipos para jugar.";
        }

        int indice1 = random.nextInt(equipos.size());

        int indice2;

        do {
            indice2 = random.nextInt(equipos.size());
        } while (indice1 == indice2);

        T equipo1 = equipos.get(indice1);
        T equipo2 = equipos.get(indice2);

        return calcularPartido(equipo1, equipo2);
    }

}
