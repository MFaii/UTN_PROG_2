package ordenamientoproductosconsola;

import java.util.Comparator;

/**
 * Comparador externo para ordenar productos por nombre.
 */
public class ComparadorProductoPorNombre implements Comparator<Producto> {

    @Override
    public int compare(Producto p1, Producto p2) {
        return p1.getNombre().compareToIgnoreCase(p2.getNombre());
    }
}