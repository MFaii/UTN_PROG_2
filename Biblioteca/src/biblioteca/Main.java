/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Maxi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Autor autor1 = new Autor("Allende", "España");
        Autor autor2 = new Autor("Gabriel Garcia Marquez", "Colombia");

        Libro libro1 = new Libro("Programacion Java", autor1);
        Libro libro2 = new Libro("Cien años de soledad", autor2);

        Biblioteca biblioteca = new Biblioteca("UTN Fra - Biblioteca central");
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro1);

        Usuario usuario = new Usuario("Daniel");

        biblioteca.mostrarLibros();

        System.out.println("\n--- Prestamo ---");
        Libro libroBuscado = biblioteca.buscarLibro("Programacion Java");

        if (libroBuscado != null) {
            usuario.tomarLibro(libroBuscado);
        }

        System.out.println("\n --- Estado ---");
        biblioteca.mostrarLibros();

        usuario.mostrarLibros();

        System.out.println("\n --- Devolucion ---");
        usuario.devolverLibro(libroBuscado);

        System.out.println("\n --- Estado final ---");
        biblioteca.mostrarLibros();
    }

}
