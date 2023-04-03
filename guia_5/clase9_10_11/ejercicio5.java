package guia5_clases9_10_11;

/*Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia
traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT.
La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando
sus filas por columnas (o viceversa).*/
public class ejercicio5 {

    public static void main(String[] args) {
        int[][] A = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        int[][] AT = new int[A.length][A[0].length];
        int cont = 0;
        for(int i = 0; i < A.length; i++){
            for (int j = 0; j < A[0].length; j++) {
                AT[j][i] = A[i][j];
            }
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if(AT[i][j] == ((A[i][j])*(-1))){
                    cont++;
                }
                
            }
            
        }
        if(cont == 9){
            System.out.println("La matriz es antisimetrica");
        }else{
            System.out.println("La matriz no es antisimetrica");
        }
    }
    
}
