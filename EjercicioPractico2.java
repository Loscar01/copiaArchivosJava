
package cuartoencuentroarreglos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EjercicioPractico2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         Random random = new Random();
         System.out.println("Ingrese el tamaño del vector");
         int dimension=sc.nextInt();
         int[] vector=new int[dimension];
         for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(100);
            
        }
        System.out.println("Valores del vector generado" + Arrays.toString(vector)+ " "); 
        //Una funcion que convierte el vector en una cadena para mostrar los valores del Arreglo
        System.out.println("Ingres el numero a buscar");
        int buscar=sc.nextInt();
        boolean repetido=false;
        int indice = -1;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]==buscar) {
                if (repetido) {
                    System.out.println("El numero se encuentra repetido en el vector");
                    return;
                }
                repetido=true;
                indice=i;
            }
            
        }
                if (repetido) {
                    System.out.println("El numero se encuentra en el indice " + indice + " del vector");
                    
        }else{
                    System.out.println("El numero no se encuentra en el vector");
                }
    }
    
}
