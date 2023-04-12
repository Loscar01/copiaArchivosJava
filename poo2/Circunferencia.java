
package poo2;

import java.util.Scanner;


public class Circunferencia {
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
    public double getRadio(){
        return radio;
    }
    public void serRadio(double radio){
        this.radio=radio;
    }
    public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia:");
        double radio=leer.nextDouble();
        this.radio=radio;
        
    }
    public double area(){
        return Math.PI * Math.pow(radio, 2);
        
    }
    public double perimetro(){
        return 2*Math.PI*radio;
    }
}
