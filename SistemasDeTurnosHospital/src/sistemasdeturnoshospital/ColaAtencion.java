/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemasdeturnoshospital;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maxi
 */
public class ColaAtencion<T> {
    
    private List<T> cola;
    
    public ColaAtencion(){
        cola = new ArrayList<>();
    }
    
    public void agregar(T elemento){
        cola.add(elemento);
    }
    
    public T atender(){
        if(cola.isEmpty()){
            return null;
        }
        return cola.remove(0);
    }
    
    public void mostrarPaciente(){
        for (T elemento: cola){
            System.out.println(elemento);
        }
    }
}
