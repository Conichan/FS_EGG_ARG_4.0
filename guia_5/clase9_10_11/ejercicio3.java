/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia5_clases9_10_11;

import java.util.Scanner;

/*Recorrer un vector de N enteros contabilizando cuántos
números son de 1 dígito, cuántos de 2 dígitos, etcétera
(hasta 5 dígitos).*/
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, s1 = 0, s2 = 0, s3 = 0, s4 = 0, s5 = 0;
        int[] vector; 
        System.out.println("Ingrese el tamaño del vector: ");
        n = leer.nextInt();
        vector = new int[n];
        
        for(int i = 0; i < vector.length; i++){
            vector[i] = (int)(Math.random()*99999);
        }
        
        for(int i = 0; i < vector.length; i++){
            if(vector[i] < 10){
                s1++;
            }else if(vector[i] < 100){
                s2++;
            }else if(vector[i] < 1000){
                s3++;
            }else if(vector[i] < 10000){
                s4++;                
            }else if(vector[i] < 100000){
                s5++;
            }
            
        }
        System.out.println("numeros de 1 cifra: " + s1);
        System.out.println("numeros de 2 cifra: " + s2);
        System.out.println("numeros de 3 cifra: " + s3);
        System.out.println("numeros de 4 cifra: " + s4);
        System.out.println("numeros de 5 cifra: " + s5);
    }
    
}
