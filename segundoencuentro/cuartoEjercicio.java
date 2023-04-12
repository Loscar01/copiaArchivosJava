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
public class cuartoEjercicio {

    /**
     * Escriba un programa que pida una frase o palabra y valide si la primera 
     * letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá 
     * de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario,
     * se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y 
     * equals() de Java
     */
    public static void main(String[] args) {
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println(" Ingrese una palabra o frase");
        frase=leer.nextLine();
        String primeraLetra = frase.substring(0, 1);
        if (primeraLetra.equals("A") || primeraLetra.equals("a")  ){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
            
                
    }
    
}
