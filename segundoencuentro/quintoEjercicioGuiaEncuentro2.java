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
public class quintoEjercicioGuiaEncuentro2 {

    /**
     * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e
     * imprima el número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **

     */
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 4; i++) {
            System.out.print("Ingresa el número " + i + " entre 1 y 20: ");
            int numero = scanner.nextInt();
            if (numero < 1 || numero > 20) {
                System.out.println("El número ingresado no está entre 1 y 20.");
                return;
            }
            System.out.print(numero + ": ");
            for (int j = 1; j <= numero; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

