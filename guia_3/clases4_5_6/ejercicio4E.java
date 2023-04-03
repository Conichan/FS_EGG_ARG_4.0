
package clase4;

import java.util.Scanner;
/*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10
y se muestre su equivalente en romano.*/

public class ejercicio4E {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1;
        
        System.out.println("Ingrese un numero entre 1 y 10: ");
        n1 = leer.nextInt();
        switch(n1){
            case 1: 
                System.out.println("En romano: I");
                break;
            case 2: 
                System.out.println("En romano: II");
                break;
            case 3: 
                System.out.println("En romano: III");
                break;
            case 4: 
                System.out.println("En romano: IV");
                break;    
            case 5: 
                System.out.println("En romano: V");
                break;   
            case 6: 
                System.out.println("En romano: VI");
                break;    
            case 7: 
                System.out.println("En romano: VII");
                break;    
            case 8: 
                System.out.println("En romano: VIII");
                break;
            case 9: 
                System.out.println("En romano: IX");
                break;    
            case 10: 
                System.out.println("En romano: X");
                break;    
            default:
                System.out.println("Numero invalido");
        }
        
    }
    
}
