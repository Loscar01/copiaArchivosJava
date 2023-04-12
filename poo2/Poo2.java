
package poo2;

public class Poo2 {

    public static void main(String[] args) {
      Circunferencia circunferencia = new Circunferencia(0); // Creamos un objeto de la clase Circunferencia con radio inicial 0
    circunferencia.crearCircunferencia(); // Pedimos al usuario el valor del radio y lo guardamos en el objeto
    System.out.println("El radio de la circunferencia es: " + circunferencia.getRadio()); // Imprimimos el valor del radio
    System.out.println("El área de la circunferencia es: " + circunferencia.area()); // Calculamos e imprimimos el área de la circunferencia
    System.out.println("El perímetro de la circunferencia es: " + circunferencia.perimetro()); // Calculamos e imprimimos el perímetro de la circunferencia
    }
    
}
