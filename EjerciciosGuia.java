
package cuartoencuentroarreglos;

import java.util.Scanner;

/**
 *
 * Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros 
 * de equipo y define su tipo de dato de tal manera que te permita alojar sus nombres 
 * más adelante.

 */
public class EjerciciosGuia {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Cuantos compañeros son?");
        int dimension=sc.nextInt();
        String[] Equipo= new String[dimension];
        for (int i = 0; i < Equipo.length; i++) {
            System.out.println("Ingrese el nombre del compañero"+(i+1)+":");
            Equipo[i]=sc.next();
            
        }
         System.out.println("Los nombres de los compañeros son:");
        for (int i = 0; i < Equipo.length; i++) {
            System.out.println(Equipo[i]);
            
        }
    }
    
}
