/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tercerencuentro.subprogramas;

/**
 *
 * @author carlo
 */
import java.util.Scanner;

public class Ejerciciospracticos3 {
    public static void convertirMoneda(double cantidadEuros, String monedaDestino) {
        double tipoCambio = 0.0;
        String simboloMoneda = "";
        
        switch(monedaDestino.toLowerCase()) {
            case "dolares":
                tipoCambio = 1.18;
                simboloMoneda = "$";
                break;
            case "yenes":
                tipoCambio = 130.51;
                simboloMoneda = "¥";
                break;
            case "libras":
                tipoCambio = 0.86;
                simboloMoneda = "£";
                break;
            default:
                System.out.println("La moneda destino indicada no es válida.");
                return;
        }
        
        double cantidadDestino = cantidadEuros * tipoCambio;
        System.out.printf("%.2f euros equivalen a %.2f %s\n", cantidadEuros, cantidadDestino, simboloMoneda);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cantidad de euros a convertir: ");
        double cantidadEuros = scanner.nextDouble();
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Indica la moneda a la que deseas convertir (dolares, yenes o libras): ");
        String monedaDestino = scanner.nextLine();
        convertirMoneda(cantidadEuros, monedaDestino);
    }
}

