
package clase4;

import java.util.Scanner;
/*Escriba un programa que lea números enteros. Si el número es múltiplo de
cinco debe detener la lectura y mostrar la cantidad de números leídos,
la cantidad de números pares y la cantidad de números impares. Al igual que
en el ejercicio anterior los números negativos no deben sumarse. Nota: recordar
el uso de la sentencia break.*/

public class ejercicio8E {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, cantnumeros = 0, cantpares = 0, cantimpares = 0;
        
        do{
            System.out.println("Ingrese un entero: ");
            n = leer.nextInt();
            if(((n%5)==0)){
                break;
            }else if(n > 0){
                if((n%2)==0){
                    cantpares++;
                }else{
                    cantimpares++;
                    }
                cantnumeros++;
            }
        }while(!((n%5)== 0));
        
    }
    
}
