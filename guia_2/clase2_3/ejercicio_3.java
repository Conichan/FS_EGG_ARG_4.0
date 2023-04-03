/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nico.clase2_3;
/*Escribir un programa que pida una frase y
la muestre toda en mayúsculas y después toda
en minúsculas.
Nota: investigar la función toUpperCase() y 
toLowerCase() en Java.*/
import java.util.Scanner;
/**
 *
 * @author Conichan
 */
public class ejercicio3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase, mayuscula, minuscula;
        System.out.println("Ingrese una frase: ");
        frase = leer.nextLine();
        System.out.println("Mayuscula: " + frase.toUpperCase());
        System.out.println("Minuscula: " + frase.toLowerCase());
        leer.close();
                
                
    }

    
    
}
