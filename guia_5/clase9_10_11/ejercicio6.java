package guia5_clases9_10_11;

import java.util.Random;

/*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números 
del 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales
son idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa deberá
comprobar que los números introducidos son correctos, es decir, están entre el 1 y el 9.*/
public class ejercicio6 {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int [] vectorF = new int [matriz.length];
        int [] vectorC = new int [matriz[0].length];
        int diagonal1 = 0;
        int diagonal2 = 0;
        boolean band = true;
        
        matriz = rellenar(3);
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
               vectorF[i] += matriz[i][j]; 
               vectorC[j] += matriz[j][i];
                if (i==j) {
                    diagonal1 += matriz[i][j];
                }
                if ((i+j)==matriz.length-1) {
                    diagonal2 += matriz[i][j];
                }  
            } 
        }
        
        if (diagonal1 == diagonal2) {
            for (int i = 0; i < vectorF.length; i++) {
                if (!((vectorF[i]==vectorC[i]) && (vectorF[i]==diagonal1))) {
                   band = false; 
                   break; 
                } 
                
            }
            
        } else {
            band = false;
        }
        
        if (band) {
            System.out.println("La matriz es magica");
            System.out.println("La suma de sus valores es: "+diagonal1);
        } else {
            System.out.println("La matriz no es magica");
        }

        
    }
    
    public static int [][] rellenar(int tamano){
        Random aleatorio = new Random();
        int [][] matrizFuncion = new int [tamano] [tamano];
        for (int i = 0; i < matrizFuncion.length; i++) {
            for (int j = 0; j < matrizFuncion[0].length; j++) {
                matrizFuncion[i][j] = 1;
            }  
        }
        return matrizFuncion;
    }
    
       
}
    
    
}
