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
public class Ejercicio6T {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1, n2;
        System.out.println("Ingrese un numero entero: ");
        n1 = leer.nextInt();
        System.out.println("Ingrese otro numero entero: ");
        n2 = leer.nextInt();
        if ((n1 > 25)&&(n2 > 25)){
            System.out.println("Los nueros ingresados son mayores a 25");
        }
        if ((n1 > 25) || (n2 > 25)){
            System.out.println("Uno de los numeros ingresados es mayor a 25");
        }else{
            System.out.println("Los numeros ingresados son menores a 25");
        }
    }
    
}
