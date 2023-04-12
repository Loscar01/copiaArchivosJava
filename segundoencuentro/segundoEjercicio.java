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
public class segundoEjercicio {

    /**
     * Crear un programa que pida una frase y si esa frase es igual a “eureka” 
     * el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
     * Nota: investigar la función equals() en Java.

     */
    public static void main(String[] args) {
        String fraseClave="eureka";
        String frase;
        Scanner leerFrase = new Scanner(System.in);
        System.out.println("Ingrese la contraseña");
        frase=leerFrase.nextLine();
        if(frase.equals(fraseClave)){
            System.out.println("Clave correcta");
        }else{
            System.out.println("Clave Incorrecta");
        }
            
    }
    
}
