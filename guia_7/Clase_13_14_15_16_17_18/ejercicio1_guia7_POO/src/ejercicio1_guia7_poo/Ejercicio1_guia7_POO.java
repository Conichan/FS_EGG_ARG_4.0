package ejercicio1_guia7_poo;

import Entidad.Libro;
import java.util.Scanner;

/*Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un método
para cargar un libro pidiendo los datos al usuario y luego informar mediante
otro método el número de ISBN, el título, el autor del libro y el número de páginas.*/
public class Ejercicio1_guia7_POO {

    public static void main(String[] args) {
       Libro l1 = new Libro();
       cargarlibro(l1);
       System.out.println(l1.toString());
    }
    
    public static void cargarlibro(Libro book){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese: ");
        System.out.println("ISBN: ");
        book.setISBN(leer.nextInt());
        System.out.println("Titulo: ");
        book.setTitulo(leer.next());
        System.out.println("Autor: ");
        book.setAutor(leer.next());
        System.out.println("Numero de Paginas: ");
        book.setnPag(leer.nextInt());
        
    }
    
    
}
