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
public class EjerciciosGuia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese/escriba una palabra o frase");
        String entrada = sc.nextLine().toLowerCase();
     String salida = vocales(entrada);
        System.out.println(salida);
    }
    public static String vocales(String entrada){
        String salida = entrada.replace("a", "@");
        salida = salida.replace("e", "#");
        salida = salida.replace("i", "$");
        salida = salida.replace("o", "%");
        salida = salida.replace("u", "*");
        return salida;
    }
}
