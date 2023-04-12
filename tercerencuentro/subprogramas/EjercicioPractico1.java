/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tercerencuentro.subprogramas;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class EjercicioPractico1 {

    /**
     *Diseñe una función que pida el nombre y la edad de N personas e imprima los
     * datos de las personas ingresadas por teclado e indique si son mayores o menores 
     * de edad. Después de cada persona, el programa debe preguntarle al usuario si quiere 
     * seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”
     */
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nPersonas;
    System.out.println("Indique la cantidad de personas a identificar:");
    while (!sc.hasNextInt()) {
        System.out.println("El valor ingresado no es un número entero.");
        System.out.print("Ingrese un número entero: ");
        sc.next();
    }
    nPersonas = sc.nextInt();
    String nombresSalida = nombresyedad(nPersonas);
    System.out.println("Las personas mayores de edad son: " + nombresSalida);

}

public static String nombresyedad(int nPersonas) {
    Scanner sc = new Scanner(System.in);
    String salida = "";
    String mayoresEdad = "";
    System.out.println("Cantidad de personas introducidas: " + nPersonas);
    for (int i = 0; i < nPersonas; i++) {
        System.out.println("Indique el nombre de la persona " + (i + 1) + ":");
        String nombre = sc.nextLine();
        System.out.println("Indique la edad de la persona " + (i + 1) + ":");
        while (!sc.hasNextInt()) {
            System.out.println("El valor ingresado no es un número entero.");
            System.out.print("Ingrese un número entero: ");
            sc.next();
        }
        int edad = sc.nextInt();
        sc.nextLine();
        salida += "Nombre: " + nombre + ", Edad: " + edad + "\n";
        if (edad >= 18) {
            mayoresEdad += nombre + " ";
        }
    }
    System.out.println(salida);
    return mayoresEdad;
}
}



