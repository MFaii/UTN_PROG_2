package ordenamientoproductosconsola;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author daniel
 */
public class InicializadorProductos {
    private ArrayList<Producto> productos;

    public InicializadorProductos() {
        productos = new ArrayList<>();
        cargarProductosIniciales();
    }

    private void cargarProductosIniciales() {
        productos.add(new Producto(1, "Notebook", 1200000, 5));
        productos.add(new Producto(2, "Mouse", 15000, 30));
        productos.add(new Producto(3, "Teclado", 35000, 15));
        productos.add(new Producto(4, "Monitor", 250000, 8));
        productos.add(new Producto(5, "Impresora", 180000, 3));
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos cargados.");
            return;
        }

        System.out.println("\nListado de productos:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public void ordenarPorPrecio() {
        Collections.sort(productos);
        System.out.println("Productos ordenados por precio de menor a mayor.");
    }

    public void ordenarPorNombre() {
        Collections.sort(productos, new ComparadorProductoPorNombre());
        System.out.println("Productos ordenados por nombre alfabéticamente.");
    }

    public void ordenarPorStock() {
        Collections.sort(productos, new ComparadorProductoPorStock());
        System.out.println("Productos ordenados por stock de menor a mayor.");
    }

    public Producto buscarPorCodigo(int codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo() == codigo) {
                return producto;
            }
        }
        return null;
    }
}
    
