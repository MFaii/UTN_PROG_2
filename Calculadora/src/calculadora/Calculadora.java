/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author Maxi
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora c = new Calculadora();

        System.out.println("Suma de 2 enteros");
        System.out.println(c.sumar(5, 3));

        System.out.println("Suma de 3 enteros");
        System.out.println(c.sumar(5, 3, 10));

        System.out.println("Suma de 2 doubles");
        System.out.println(c.sumar(5.25, 3.25));

    }

    //METODO 1 SOBRECARGA
    int sumar(int a, int b, int c) {
        return a + b + c;
    }

    int sumar(int a, int b) {
        return a + b;
    }

    double sumar(double a, double b) {
        return a + b;
    }
}
