/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemasdeturnoshospital;

import java.util.List;

/*
    Un hospital necesita administrar filas de espera para distitos tipos de pacientes

    Ejemplo:
    Pacientes de guardia, 
    Pacientes de cardiologia,

    En lugar de crear una cola distinta para cada tipo de paciente, se decide
desarrollar una estructura generica llamada ColaAtencion<T> para que pueda trabajar
con cualquier tipo de paciente.
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ColaAtencion<PacienteGuardia> guardia = new ColaAtencion<>();

        guardia.agregar(new PacienteGuardia("Juan Perez", "Dolor abdominal"));
        guardia.agregar(new PacienteGuardia("Ana Gomez", "Fiebre"));

        System.out.println("Atendiendo guardia");

        System.out.println(guardia.atender());

        ColaAtencion<PacienteCardiologia> cardiologia = new ColaAtencion<>();

        cardiologia.agregar(new PacienteCardiologia("Carlos Lopez", "Electrocardiograma"));
        cardiologia.agregar(new PacienteCardiologia("Laura Diaz", "Ergometria"));

        System.out.println("\nAtendiendo cardiologia");
        System.out.println(cardiologia.atender());
        
        System.out.println("*****************************");
        
        Integer[] numeros = {1,2,3,4};
        
        String[] nombres = {"Ana","Juan","Pedro"};
        
        imprimirArray(numeros);
        imprimirArray(nombres);
    }

    public static <T> void imprimirArray(T[] arreglo) {
        for (T elemento : arreglo) {
            System.out.println(elemento);
        }
    }
    
    public static void mostrarLista(List<?> lista){
        // No podemos agregar nuevos elementos a la listam porque el compilador no sabe 
    }

}
