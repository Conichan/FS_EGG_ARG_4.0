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
public class ejercicio9T {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, suma = 0, cont = 0;
        do{
            System.out.println("Ingrese un numero, 0 para terminar");
            n = leer.nextInt();
            if(n > 0){
                suma = suma + n;
            }
            if(n == 0){
                System.out.println("Se capturo el numero cero");
                break;
            }
            cont = cont + 1;
        }while(n == 0 || cont < 20);
        System.out.println("La suma de los numeros ingresados positivos es: " + suma);
    }
    
}
