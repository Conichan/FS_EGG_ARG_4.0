package guia5_clases9_10_11;

import java.util.Scanner;

/*Realizar un algoritmo que llene un vector de tamaño
N con valores aleatorios y le pida al usuario un número
a buscar en el vector. El programa mostrará dónde se encuentra
el numero y si se encuentra repetido*/
public class ejercicio2 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n = 5, buscar, pos = 0, cont = 0;
        int[] vector = new int[n]; 
        for(int i = 0; i < vector.length; i++){
            vector[i] = (int)(Math.random()*99);
            System.out.println(vector[i]);
        }
        System.out.println("Ingrese un un numero a buscar: ");
        buscar = leer.nextInt();
        for(int i = 0; i < vector.length; i++){
            if(buscar == vector[i]){
                if(cont == 0){
                    pos = i+1;
                }
                cont++;
            }
        }
        if(cont > 0){
            System.out.println("Posicion: " + pos);
            System.out.println("Se repite: " + cont);
        }else{
            System.out.println("El numero no se encuentra dentro del vector");
        }
    }
    
}
