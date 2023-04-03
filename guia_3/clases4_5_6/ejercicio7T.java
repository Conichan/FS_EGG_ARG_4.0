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
public class ejercicio7T {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tipoMotor;
        System.out.println("Ingrese una opcion entre 1 y 4 inclusibe:");
        tipoMotor = leer.nextInt();
        switch(tipoMotor){
            case 1: 
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigon");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia"); 
                break;
            default: 
                System.out.println("No existe un valor valido para tipo de bomba");
        }
    }
    
}
