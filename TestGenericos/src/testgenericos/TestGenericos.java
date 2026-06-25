/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testgenericos;

/**
 *
 * @author Maxi
 */
public class TestGenericos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* 
        Caja<String> caja = new Caja();

        caja.setDato("Daniel"); // STRING

        String nombre = caja.getDato();
        System.out.println("Nombre: " + nombre);

        // Error en tiempo de ejecucion
        Caja<Integer> otraCaja = new Caja();

        otraCaja.setDato(100); // INT

        Integer numero = otraCaja.getDato();
        System.out.println("Numero: " + numero);
         */
        mostrar("Hola");
        mostrar(123);
        mostrar(3.1416);
        mostrar(true);

    }

    // Sobrecarga de metodos
//    public static void mostrar(String parametro) {
//        System.out.println(parametro);
//    }
//
//    public static void mostrar(Integer parametro) {
//        System.out.println(parametro);
//    }
//
//    public static void mostrar(Double parametro) {
//        System.out.println(parametro);
//    }
//
//    public static void mostrar(Boolean parametro) {
//        System.out.println(parametro);
//    }

    // Generico
    public static <T> void mostrar(T parametro) {
        System.out.println(parametro);
    }

}
