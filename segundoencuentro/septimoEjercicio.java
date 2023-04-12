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
public class septimoEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int tamaño;
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del cuadrado");
        tamaño=leer.nextInt();
    for (int i = 0; i < tamaño; i++) {    // Ciclo para las filas
        for (int j = 0; j < tamaño; j++) {    // Ciclo para las columnas
            System.out.print("*");
        }
        System.out.println();    // Salto de línea para imprimir la siguiente fila
    }
}
}
   
