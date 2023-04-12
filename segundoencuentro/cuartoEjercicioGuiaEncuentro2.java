/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoencuentro;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class cuartoEjercicioGuiaEncuentro2 {

    /**
     *Escriba un programa que lea 20 números. Si el número leído es igual a cero
     * se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". 
     * El programa deberá calcular y mostrar el resultado de la suma de los números 
     * leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.

     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numeros;
        
       do {
           System.out.println("Ingrese los numeros ");
           numeros=leer.nextInt();
          
       } while (numeros != 0);
        System.out.println("Se capturo el numero 0!!!!");
    }
    
}
