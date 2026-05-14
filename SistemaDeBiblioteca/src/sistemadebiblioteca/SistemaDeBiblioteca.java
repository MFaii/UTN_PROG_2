/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadebiblioteca;

/**
 *
 * @author Maxi
 */
public class SistemaDeBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Autor autor1 = new Autor("Jose","Peruano",30);
        
        Libro libro1 = new Libro("Cien años", true);

        libro1.autor = autor1;


        System.out.println(libro1.toString());
    }

}
