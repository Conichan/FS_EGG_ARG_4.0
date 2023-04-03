
package calse7_8;

import java.util.Scanner;
/*Crea un procedimiento EsMultiplo que reciba los dos números pasados
por el usuario, validando que el primer número múltiplo del segundo e
imprima si el primer número es múltiplo del segundo, sino informe que no lo son.*/

public class ejercicio12T {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1, n2;
        System.out.println("Ingrese un numero: ");
        n1 = leer.nextInt();
        System.out.println("Ingrese otro numero: ");
        n2 = leer.nextInt();
        validar(n1, n2);
    }
    
    public static void validar(int n1, int n2){
        if((n1 % n2)==0){
            System.out.println("El primer numero es multiplo del segundo");
        }else{
            System.out.println("El primer numero no es multiplo del segundo");
        }
    }
}
