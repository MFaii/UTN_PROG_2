/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulacion;

/**
 *
 * @author Maxi
 */
public class CuentaBancaria {

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        } else {
            System.out.println("El monto debe ser positivo.");
        }
    }

    public void extraer(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Fondos insuficientes o monto invalido.");
        }
    }
    
    
}
