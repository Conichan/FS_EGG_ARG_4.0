package clase4;

import java.util.Scanner;
/*Crear un programa que dado un número determine si es par o impar.*/
public class ejercicio1 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int n;
        System.out.println("Ingese un numero: ");
        n = leer.nextInt();
        if(n % 2 == 0){
            System.out.println("El numero ingresados es par");
        }else{
            System.out.println("El numero ingresado es impar");
        }
    }
    
}
