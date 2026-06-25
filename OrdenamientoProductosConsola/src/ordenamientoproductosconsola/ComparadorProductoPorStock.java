package ordenamientoproductosconsola;

import java.util.Comparator;

/**
 * Comparador externo para ordenar productos por stock.
 */
public class ComparadorProductoPorStock implements Comparator<Producto> {

    @Override
    public int compare(Producto p1, Producto p2) {
        return Integer.compare(p1.getStock(), p2.getStock());
    }
}
