
package clase4;

import java.util.Scanner;
/*Declarar cuatro variables de tipo entero A, B, C y D y asignarle
un valor diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome el
valor de D y D tome el valor de B. Mostrar los valores iniciales y los valores
finales de cada variable. Utilizar sólo una variable auxiliar.*/

public class ejercicio2E {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int A = 1, B = 25, C = 123, D = 40, aux;
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
        aux = D;
        D = B;
        B = C;
        C = A;
        A = aux;
        System.out.println("=====================================");
        System.out.println("=====================================");
            
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
        
    }
    
}