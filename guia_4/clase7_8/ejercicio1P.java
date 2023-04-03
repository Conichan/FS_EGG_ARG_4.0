
package calse7_8;

import java.util.Scanner;

/*Crea una aplicación que le pida dos números al usuario y
este pueda elegir entre sumar, restar, multiplicar y dividir.
La aplicación debe tener una función para cada operación matemática
y deben devolver sus resultados para imprimirlos en el main. */

public class ejercicio1P {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1, n2, op;
        System.out.println("Ingrese un numero: ");
        n1 = leer.nextInt();
        System.out.println("Ingrese otro numero: ");
        n2 = leer.nextInt();
        System.out.println("MENU");
        System.out.println("1. SUMAR");
        System.out.println("2. RESTAR");
        System.out.println("3. MULTIPLICAR");
        System.out.println("4. DIVIDIR");
        System.out.println("Ingrese una opcion: ");
        op = leer.nextInt();
        switch(op){
            case 1:
                System.out.println("SUMA: " + suma(n1, n2));
                break;
            case 2:
                System.out.println("RESTA: " + resta(n1, n2));
                break;    
            case 3:
                System.out.println("MULTIPLICAR: " + mult(n1, n2));
                break; 
            case 4:
                System.out.println("DIVIDIR: " + (float)div(n1, n2));
                break;    
            default:
                System.out.println("Ingreso una opcion invalida");
        }
    }
 
public static int suma(int n1, int n2){
    return n1 + n2;
}    

public static int resta(int n1, int n2){
    if(n1 > n2){
        return (n1 - n2);
    }else {
        return n2 - n1;
    }
}

public static int mult(int n1, int n2){
    return n1 * n2;
}

public static float div(float n1, float n2){
    if(n1 > n2){
        return n1 / n2;
    }else{
        return n2 / n1;
    }
}
}
