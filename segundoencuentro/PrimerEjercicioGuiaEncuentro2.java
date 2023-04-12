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
public class PrimerEjercicioGuiaEncuentro2 {

    /**
     * Implementar un programa que le pida dos números enteros al usuario y 
     * determine si ambos o alguno de ellos es mayor a 25.

     */
    public static void main(String[] args) {
        int num1,num2;
        Scanner leer = new Scanner(System.in);
        num1=leer.nextInt();
        num2=leer.nextInt();
        if (num1 >= 25 || num2 >= 25){
            System.out.println("los numeros introducidos son mayores a 25");
    }else{
            System.out.println("Alguno de los numeros es menor a 25");  
        }
    
}
}
