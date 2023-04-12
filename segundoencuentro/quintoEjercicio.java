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
public class quintoEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int limite;
       int numero;
       int suma=0;
       int contador=0;
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor limite positivo");
        limite = leer.nextInt();
        while(suma<=limite){
            System.out.println("Ingrese un numero");
            numero=leer.nextInt();
            suma=suma+numero;
        }
        System.out.println("La suma total de los numeros supero el valor inicial " + limite); 
    }
    
}
