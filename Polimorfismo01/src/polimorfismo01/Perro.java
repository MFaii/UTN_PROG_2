/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo01;

/**
 *
 * @author Maxi
 */
public class Perro extends Animal {

    @Override
    public void hacerRuido() {
        ruido = "Guah";
        System.out.println(ruido);
    }

}
