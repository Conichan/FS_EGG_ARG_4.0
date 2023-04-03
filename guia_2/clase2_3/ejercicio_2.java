/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nico.clase2_3;
/*Escribir un programa que pida tu nombre,
lo guarde en una variable y lo muestre por
pantalla.*/
import java.util.Scanner;

/**
 *
 * @author Conichan
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);   
        String nombre;
        System.out.println("Ingrese su nombre: ");
        nombre = leer.nextLine();
        System.out.println("Su nombre es: " + nombre);
        leer.close();
          
    }
    
}
