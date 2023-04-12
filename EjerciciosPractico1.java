
package cuartoencuentroarreglos;

import java.util.Scanner;

public class EjerciciosPractico1 {

    /**
     * 
Realizar un algoritmo que llene un vector con los 100 primeros números enteros 
* y los muestre por pantalla en orden descendente.

     */
    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        int[] arreglo = new int[100];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i + 1;
        }
        System.out.println("Mostrando números del 1 al 100 en orden descendente:");
        for (int i = arreglo.length - 1; i >= 0; i--) {
            System.out.println(arreglo[i]+" ");
        }
    }
}
 