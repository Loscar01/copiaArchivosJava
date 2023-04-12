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
public class primerEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
int numero;
System.out.println("Ingrese un numero");
numero = leer.nextInt();
while (numero !=0) {
if(numero % 2 == 0){
System.out.println("El numero es par");
}else{
System.out.println("El numero es impar");
}
System.out.println("Ingrese otro numero o ingrese 0 para salir");
numero = leer.nextInt();
}

}
}
