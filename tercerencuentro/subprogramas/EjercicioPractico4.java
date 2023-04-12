/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tercerencuentro.subprogramas;

import java.util.Scanner;

public class EjercicioPractico4 {

    /**
     * Crea una aplicación que nos pida un número por teclado y con una función
     * se lo pasamos por parámetro para que nos indique si es o no un número primo,
     * debe devolver true si es primo, sino false.

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Introduzca el numero");
        numero=sc.nextInt();
       if(esPrimo(numero)){
           System.out.println(true);
           
       }else{
           System.out.println(false);
       }
    }
    public static boolean esPrimo(int numero){
        if(numero<=1){
            return false;
        }else if(numero==2 || numero==3){
            return true;
        }else if(numero % 2==0 || numero % 3==0){
        return false;
    }else{
            int i = 5;
        while (i * i <= numero) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        return true;
       
    }
}
}

