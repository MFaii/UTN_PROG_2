/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaexpediciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Maxi
 */
public class AgenciaEspacial {

    private ArrayList<Nave> naves;

    public AgenciaEspacial() {
        naves = new ArrayList<>();
    }

    private boolean existeNave(String nombre, int anio) {
        for (Nave nave : naves) {
            if (nave.getNombre().equals(nombre) && nave.getAnioLanzamiento() == anio) {
                return true;
            }
        }
        return false;
    }

    public void agregarNave(Nave nave) {
        if (existeNave(nave.getNombre(), nave.getAnioLanzamiento())) {
            System.out.println("La nave ya existe!");
        } else {
            naves.add(nave);
            System.out.println("Nave agregada con exito.");
        }
    }

    public void mostrarNaves() {
        for (Nave nave : naves) {
            System.out.println(nave);
        }
    }

    public void iniciarExploraciones() {
        for (Nave nave : naves) {
            if (nave instanceof IExplorable) {
                IExplorable explorable = (IExplorable) nave;
                explorable.iniciarExploracion();
            }
        }
    }

    public void ordenarPorNombre() {
        Collections.sort(naves);
        mostrarNaves();
    }

    public void ordenarPorAnioDesc() {

        Collections.sort(naves, new Comparator<Nave>() {

            @Override
            public int compare(Nave n1, Nave n2) {

                return n2.getAnioLanzamiento()
                        - n1.getAnioLanzamiento();
            }
        });

        mostrarNaves();
    }

    public void ordenarPorTripulacionDesc() {

        Collections.sort(naves, new Comparator<Nave>() {

            @Override
            public int compare(Nave n1, Nave n2) {

                return n2.getCapacidadTripulacion()
                        - n1.getCapacidadTripulacion();
            }
        });

        mostrarNaves();
    }

}
