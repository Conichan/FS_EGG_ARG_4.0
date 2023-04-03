/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nico.clase2_3;

import java.util.Scanner;
/*Dada una cantidad de grados centígrados se debe mostrar
su equivalente en grados Fahrenheit. La fórmula correspondiente
es: F = 32 + (9 * C / 5).*/
/*
 *
 * @author Conichan
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double grados;
        System.out.println("Ingrese una cantidad en grados Centigrados: ");
        grados = leer.nextDouble();
        System.out.println("En Fahrenheit: " + (32 + (9 * grados / 5)));
        leer.close();        
    }
    
}
