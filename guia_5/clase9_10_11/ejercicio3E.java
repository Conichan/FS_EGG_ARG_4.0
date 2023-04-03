package guia5_clases9_10_11;

/*Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o procedimiento
que imprima el vector.*/
public class ejercicio3E {

    public static void main(String[] args) {
        int[] vector = new int[5];
        vector = rellene(vector);
        mostrar(vector);
    }
    
    public static int[] rellene(int[] vector){
        for(int i = 0; i < vector.length; i++){
            vector[i] = (int)(Math.random()*99);
        }
        return vector;
    }
    
    public static void mostrar(int[] vector){
        System.out.println("Vector: ");
        for(int elemento: vector){
            System.out.println(elemento);
        }
    }
}
