/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase4;

import java.util.Scanner;

/**
 *
 * @author Conichan
 */
public class ejercicio8T {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nota;
        System.out.println("Ingrese una nota: ");
        nota = leer.nextInt();
        while(nota < 0 || nota > 10){
            System.out.println("La nota ingresada no esta permitida");
            System.out.println("Ingresela de nuevo: ");
            nota = leer.nextInt();
        }
    }
    
}
