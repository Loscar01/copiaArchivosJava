
package miproyectopoo;

import java.util.Scanner;

public class Libro {
    private String ISBN;
    private String Titulo;
    private String Autor;
    private int NumeroDePaginas;
    
    public Libro(){
        
    }
//incializar variables con el constructor "control + insert"
    public Libro(String ISBN, String Titulo, String Autor, int NumeroDePaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroDePaginas = NumeroDePaginas;
    }
    public void cargarLibro(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de ISBN: ");
        this.ISBN=leer.nextLine();
        System.out.println("Ingrese el Titulo del Libro:");
        this.Titulo=leer.nextLine();
        System.out.println("Ingrese el autor del libro:");
        this.Autor=leer.nextLine();
        System.out.println("Ingrese el numero de paginas del libro:");
        this.NumeroDePaginas=leer.nextInt();
        
    }
    public void informarLibro(){
        System.out.println("Numero de ISBN: "+ this.ISBN);
        System.out.println("Titulo: " + this.Titulo);
        System.out.println("Autor:" + this.Autor);
        System.out.println("Numero de Paginas:" + this.NumeroDePaginas);
    }
}
