package bibliotecauniversitaria;

import java.util.Scanner;

public class BibliotecaUniversitaria {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\n===== BIBLIOTECA UNIVERSITARIA =====");
            System.out.println("1. Alta de libro");
            System.out.println("2. Alta de usuario");
            System.out.println("3. Buscar libro por ISBN");
            System.out.println("4. Registrar préstamo");
            System.out.println("5. Registrar devolución");
            System.out.println("6. Mostrar catálogo ordenado por título");
            System.out.println("7. Mostrar libros prestados");
            System.out.println("8. Mostrar usuarios registrados");
            System.out.println("9. Estadísticas de préstamos");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {

                case 1 -> {
                    System.out.print("ISBN: ");
                    String isbn = sc.nextLine();

                    System.out.print("Título: ");
                    String titulo = sc.nextLine();

                    System.out.print("Autor: ");
                    String nombreAutor = sc.nextLine();

                    System.out.print("Nacionalidad autor: ");
                    String nacionalidad = sc.nextLine();

                    Autor autor = new Autor(nombreAutor, nacionalidad);
                    Libro libro = new Libro(isbn, titulo, autor);

                    biblioteca.agregarLibro(libro);

                    System.out.println("Libro agregado correctamente");
                }

                case 2 -> {
                    System.out.print("Legajo: ");
                    int legajo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    Usuario usuario = new Usuario(legajo, nombre);
                    biblioteca.registrarUsuario(usuario);

                    System.out.println("Usuario registrado correctamente");
                }

                case 3 -> {
                    System.out.print("ISBN: ");
                    String isbn = sc.nextLine();

                    Libro libro = biblioteca.buscarLibroPorISBN(isbn);

                    System.out.println(libro != null ? libro : "Libro no encontrado");
                }

                case 4 -> {
                    System.out.print("ISBN del libro: ");
                    String isbn = sc.nextLine();

                    System.out.print("Legajo usuario: ");
                    int legajo = sc.nextInt();
                    sc.nextLine();

                    Usuario usuario = new Usuario(legajo, ""); // se usa equals por legajo

                    try {
                        Prestamo p = biblioteca.prestarLibro(isbn, usuario);
                        System.out.println("Préstamo realizado: " + p);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }

                case 5 -> {
                    System.out.print("ISBN del libro a devolver: ");
                    String isbn = sc.nextLine();

                    try {
                        biblioteca.devolverLibro(isbn);
                        System.out.println("Libro devuelto correctamente");
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }

                case 6 -> {
                    System.out.println("\nCatálogo ordenado:");
                    for (Libro l : biblioteca.obtenerCatalogoOrdenado()) {
                        System.out.println(l);
                    }
                }

                case 7 -> {
                    System.out.println("\nLibros prestados:");
                    for (Libro l : biblioteca.librosPrestados()) {
                        System.out.println(l);
                    }
                }

                case 8 -> {
                    System.out.println("\nUsuarios registrados:");
                    for (Usuario u : biblioteca.obtenerUsuarios()) {
                        System.out.println(u);
                    }
                }

                case 9 -> {
                    System.out.println("\nEstadísticas:");
                    System.out.println("Total préstamos: " + biblioteca.totalPrestamos());
                }

                case 0 -> System.out.println("Saliendo...");

                default -> System.out.println("Opción inválida");
            }

        } while (opcion != 0);

        sc.close();
    }
}
