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
public class ejercicio10T {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1 = 0, n2 = 0, n3 = 0, n4 = 0;
        for(int i = 0; i < 4; i++){
            System.out.println("Ingrese el numero " + (i+1) + ": ");
            switch(i){
                case 0:
                    n1 = leer.nextInt();
                    break;
                case 1:
                    n2 = leer.nextInt();
                    break;
                case 2:
                    n3 = leer.nextInt();
                    break;
                case 3:
                    n4 = leer.nextInt();
                    break;
            }
        }
        for(int i = 0; i < 4; i++){
            switch(i){
                case 0:
                    System.out.print("\n" + n1 + " ");
                    for(int j = 0; j < n1; j++){
                        System.out.print("*");
                    }
                    break;    
                case 1:
                    System.out.print("\n" + n2 + " ");
                    for(int j = 0; j < n2; j++){
                        System.out.print("*");
                    }
                    break;
                case 2:
                    System.out.print("\n" + n3 + " ");
                    for(int j = 0; j < n3; j++){
                        System.out.print("*");
                    }
                    break;
                case 3:
                    System.out.print("\n" + n4 + " ");
                    for(int j = 0; j < n4; j++){
                        System.out.print("*");
                    }
                    System.out.println("\n");
                    break;
            }
        }
    }
    
}
