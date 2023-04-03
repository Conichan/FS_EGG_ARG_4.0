package ejercicio1e_guia7_poo;

import Entidad.Cancion;
import java.util.Scanner;

public class Ejercicio1E_guia7_POO {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cancion obra = new Cancion();
        
        System.out.println("Ingrese el titulo de la cancion: ");
        obra.setTitulo(leer.nextLine());
        System.out.println("Ingrese el Autor de la cancion: ");
        obra.setAutor(leer.nextLine());
        System.out.println("Autor: " + obra.getAutor());
        System.out.println("Tiulo: " + obra.getTitulo());
        
        System.out.println(obra.toString());
        
        obra.close();
        leer.close();
    }
    
}
