package ordenamientoproductosconsola;

import java.util.Scanner;

/**
 * Clase principal del programa.
 */
public class OrdenamientoProductosConsola {    
   

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InicializadorProductos productoService = new InicializadorProductos();
        
        int opcion;
    
        do {
            mostrarMenu();
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    productoService.listarProductos();
                    break;

                case 2:
                    cargarProducto(scanner, productoService);
                    break;

                case 3:
                    productoService.ordenarPorPrecio();
                    productoService.listarProductos();
                    break;

                case 4:
                    productoService.ordenarPorNombre();
                    productoService.listarProductos();
                    break;

                case 5:
                    productoService.ordenarPorStock();
                    productoService.listarProductos();
                    break;

                case 6:
                    buscarProducto(scanner, productoService);
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

        } while (opcion != 0);

        scanner.close();
    }


    public static void mostrarMenu() {
        System.out.println("\n====================================");
        System.out.println(" SISTEMA DE PRODUCTOS");
        System.out.println("====================================");
        System.out.println("1. Listar productos");
        System.out.println("2. Cargar nuevo producto");
        System.out.println("3. Ordenar por precio");
        System.out.println("4. Ordenar por nombre");
        System.out.println("5. Ordenar por stock");
        System.out.println("6. Buscar producto por código");
        System.out.println("0. Salir");
        System.out.println("====================================");
    }

    public static void cargarProducto(Scanner scanner, InicializadorProductos productoService) {
        System.out.println("\nCarga de nuevo producto");

        System.out.print("Código: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Precio: ");
        double precio = scanner.nextDouble();

        System.out.print("Stock: ");
        int stock = scanner.nextInt();
        scanner.nextLine();

        Producto producto = new Producto(codigo, nombre, precio, stock);
        productoService.agregarProducto(producto);

        System.out.println("Producto agregado correctamente.");
    }

    public static void buscarProducto(Scanner scanner, InicializadorProductos productoService) {
        System.out.print("Ingrese el código del producto a buscar: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        Producto productoEncontrado = productoService.buscarPorCodigo(codigo);

        if (productoEncontrado != null) {
            System.out.println("Producto encontrado:");
            System.out.println(productoEncontrado);
        } else {
            System.out.println("No se encontró ningún producto con ese código.");
        }
    }
}