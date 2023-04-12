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
public class tercerEjercicioGuiaEncuentro2 {

    /**
     * Escriba un programa que valide si una nota está entre 0 y 10, sino está
     * entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.

     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
  	 int nota = 0;
        while (!(nota > 0 && nota <= 10)) { // invertir la condición del bucle
        System.out.println("Ingrese la nota");
        nota = leer.nextInt();
         }
   	
    }
    
}