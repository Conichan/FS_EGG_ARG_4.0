
package clase4;

import java.util.Scanner;
/*Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el residuo
usando sólo restas. Método: Restar el dividendo del divisor hasta obtener
un resultado menor que el divisor, este resultado es el residuo, y el número
de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
*/

public class jercicio9E {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1, n2, resto, cont = 1;
        System.out.println("Ingrese un numero: ");
        n1 = leer.nextInt();
        do{
            System.out.println("Ingrese un numero menor al primero: ");
            n2 = leer.nextInt();
        }while(n2 > n1);
        
        resto = n1 - n2;
        
        while(resto > n2){
            resto = resto - n2;
            cont++;
        }
        
        System.out.println("El resto es : " + resto);
        System.out.println("El resultado es: " + cont);
    }
    
}
