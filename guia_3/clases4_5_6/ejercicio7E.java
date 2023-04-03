
package clase4;

import java.util.Scanner;
/*Realice un programa que calcule y visualice el valor máximo, el valor mínimo
y el promedio de n números (n>0). El valor de n se solicitará al principio del
programa y los números serán introducidos por el usuario. Realice dos versiones
del programa, una usando el bucle “while” y otra con el bucle “do - while”.*/

public class ejercicio7E {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, max = 0, min = 0, numeros;
        float aux, suma = 0;
        System.out.println("Ingrese la cantidad de numeros a ingresar: ");
        n = leer.nextInt();
        aux = n;
        while(n > 0){
            System.out.println("Ingrese un numero entero: ");
            numeros = leer.nextInt();
            if(aux == n){
                max = numeros;
                min = numeros;
            }
            if(numeros > max){
                max = numeros;
            }
            if(numeros < min){
                min = numeros;
            }
            suma = suma + numeros;
            n--;
        }
        
        System.out.println("El valor maximo ingresados es: " + max);
        System.out.println("El valor minimo ingresados es: " + min);
        System.out.println("El promedio de los numeros ingresados es: " + (float)(suma/aux));
    }
    
}
