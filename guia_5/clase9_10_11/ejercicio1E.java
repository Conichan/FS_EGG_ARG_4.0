package guia5_clases9_10_11;

import java.util.Scanner;

/*Realizar un algoritmo que calcule la suma de todos los elementos
de un vector de tamaño N, con los valores ingresados por el usuario.*/
public class ejercicio1E {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, suma = 0;
        int[] vector;
        System.out.println("Ingrese el largo de un vector: ");
        n = leer.nextInt();
        vector  = new int[n];
        for(int i = 0; i < vector.length; i++){
            System.out.println("Ingrese el elemento " + (i+1) + " del vector: ");
            vector[i] = leer.nextInt();
            suma += vector[i];
        }
        
        System.out.println("La suma de los elementos del vector es: " + suma);
    }
    
}
