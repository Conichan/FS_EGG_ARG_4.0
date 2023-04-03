package guia5_clases9_10_11;
/*Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.*/
public class ejercicio1 {

  
    public static void main(String[] args) {
       
        int[] numerosEnteros;
        numerosEnteros = new int[100];
        llenarVector(numerosEnteros);
        mostrarVector(numerosEnteros);
        /*for(int i = 0; i < 100; i++){
            numerosEnteros[i] = (i+1);
        }
        for(int i = 0; i < 100; i++){
            System.out.println((i+1));
        }*/
    }
    
    public static void llenarVector(int[] numerosEnteros){
        for(int i = 0; i < 100; i++){
            numerosEnteros[i] = (i+1);
        }       
    }
    
    public static void mostrarVector(int[] numerosEnteros){
        for(int i = 0; i < 100; i++){
            System.out.println((i+1));
        }
    }
}
