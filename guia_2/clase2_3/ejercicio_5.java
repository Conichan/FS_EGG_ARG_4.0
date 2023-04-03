/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nico.clase2_3;
/*Escribir un programa que lea un número
entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de
ese número. 
Nota: investigar la función Math.sqrt().*/
import java.util.Scanner;

/**
 *
 * @author Conichan
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double n;
        System.out.println("Ingrese un numero: ");
        n = leer.nextDouble();
        System.out.println("El doble del numero: " + (n *2));
        System.out.println("El triple del numero es: " + (n * 3));
        System.out.println("La raiz cuadrada del numero es: " + Math.sqrt(n));
        leer.close();
    }
    
}
