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
public class sextoEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcionMenu=0;
        
        
        do { 
            System.out.println("****************");
            System.out.println("Elija una opcion");
            System.out.println("1:Sumar");
            System.out.println("2:Restar");
            System.out.println("3:Multiplicar");
            System.out.println("4:Dividir");
            System.out.println("5: Salir");
            System.out.println("****************");
            opcionMenu=leer.nextInt();
            
            
            switch(opcionMenu){
                case 1:
                    System.out.println("Ingrese dos numeros");
                    int num1,num2;
                    num1=leer.nextInt();
                    num2=leer.nextInt();
                    System.out.println("La suma total es: " + (num1+num2));
                    break;
                case 2:
                    
                    System.out.println("Ingrese dos numeros");
                    int num3,num4;
                    num3=leer.nextInt();
                    num4=leer.nextInt();
                    System.out.println("La resta entre esos dos numeros es: " + (num3-num4));
                    break;
                case 3:
                    System.out.println("Ingrese dos numeros"); 
                    int num5,num6;
                    num5=leer.nextInt();
                    num6=leer.nextInt();
                    System.out.println("La multiplicacion entre " + num5 + num6 + " es: " + (num5*num6));
                break;
                case 4: 
                    System.out.println("Ingrese dos numeros");
                    int num7,num8;
                    num7=leer.nextInt();
                    num8=leer.nextInt();
                    if(num8 == 0 || num7 ==0){
                        System.out.println("*ERROR* No se puede dividir por 0");
                    }else{
                        System.out.println(num7 + " Dividido " + num8 +" es:"+(num7/num8));
                    }
                    break;
                case 5:
                    System.out.println("Esta seguro que desea salir? (S/N)");
                    String confirmacion=leer.next();
                    if(confirmacion.equalsIgnoreCase("S")){
                        System.out.println("Saliendo del prgrama...");
                        System.exit(0);
                    }
                        
            }
        }while(opcionMenu !=5);
    }
    
}
