/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package nico.clase2_3;
/*Escribir un programa que pida dos números
enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el 
resultado de la suma*/
import java.util.Scanner;

/**
 *
 * @author Conichan
 */
public class ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);   
        int n1, n2, suma;
        System.out.println("Ingrese un numero: ");
        n1 = leer.nextInt();
        System.out.println("Ingrese otro numero: ");
        n2 = leer.nextInt();
        suma = n1 + n2;
        System.out.println("La suma de los dos numeros es: " + suma);
        leer.close();
        
    }
}
