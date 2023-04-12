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
public class SegundoEjercicioGuiaEncuentro2 {

    /**
     * Considera que estás desarrollando una web para una empresa que fabrica
     * motores (suponemos que se trata del tipo de motor de una bomba para mover
     * fluidos). Definir una variable tipoMotor y permitir que el usuario ingrese 
     * un valor entre 1 y 4. El programa debe mostrar lo siguiente:

     */
    public static void main(String[] args) {
        int tipoMotor;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 4");
        System.out.println("Ingrese una opcion");
        tipoMotor=leer.nextInt();
        switch (tipoMotor){
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigon");
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
                
            default:
                System.out.println("No existe un valor válido para el tipo de bomba");
                
            
        }
    }
    
}
