/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

/**
 *
 * @author Maxi
 */
public class Calculadora {

    public static double calcular(double numero1, double numero2, char operacion) {
        double resultado = 0;

        switch (operacion) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (validar(numero2)) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Error, no se puede dividir por cero.");
                }
                break;
        }
        return resultado;
    }

    private static boolean validar(double numero2) {
        return numero2 != 0;
    }

}
