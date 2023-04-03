
package clase4;

import java.util.Scanner;

/*Escribir un programa que lea un número entero y devuelva el número
de dígitos que componen ese número. Por ejemplo, si introducimos el número
12345, el programa deberá devolver 5. Calcular la cantidad de dígitos
matemáticamente utilizando el operador de división. Nota: recordar que las
variables de tipo entero truncan los números o resultados.*/

public class ejercicio11E {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1, cont = 0;
        System.out.println("Ingrese un numero entero: ");
        n1 = leer.nextInt();
        while(n1 != 0){
            n1 = n1 / 10;
            cont++;
        }
        System.out.println("El numero teien " + cont + " digitos");
    }
    
}
