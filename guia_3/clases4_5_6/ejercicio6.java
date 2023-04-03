
package clase4;

import java.util.Scanner;


public class ejercicio6 {

/*Realizar un programa que pida dos números enteros positivos
 por teclado y muestre por pantalla el siguiente menú:El usuario
 deberá elegir una opción y el programa deberá mostrar el resultado
 por pantalla y luego volver al menú. El programa deberá ejecutarse
 hasta que se elija la opción 5. Tener en cuenta que, si el usuario 
 selecciona la opción 5, en vez de salir del programa directamente,
 se debe mostrar el siguiente mensaje de confirmación:
 ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona
el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
    MENU
    1.SUMAR
    2.RESTAR
    3.MULTIPLICAR
    4.DIVIDIR
    5.SALIR
    ELIJA UNA OPCION*/
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1, n2, opcion;
        System.out.println("Ingrese un numero entero: ");
        n1 = leer.nextInt();
        System.out.println("Ingrese otro numero entero: ");
        n2 = leer.nextInt();
        do{
            System.out.println("MENU");
            System.out.println("1.SUMAR");
            System.out.println("2.RESTAR");
            System.out.println("3.MULTIPLICAR");
            System.out.println("4.DIVIDIR");
            System.out.println("5.SALIR");
            System.out.println("ELIJA UNA OPCION");
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Suma = " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("Resta = " + (n1 - n2));
                    break;    
                case 3:
                    System.out.println("Multiplicacion = " + (n1 * n2));
                    break;    
                case 4:
                    System.out.println("Division = " + (n1 / n2));
                    break;
                default:
                    if(opcion != 5){
                        System.out.println("Opcion invalida");
                        break;
                    }else{
                        break;
                    }
                    
            }
        }while(opcion != 5);
    }
    
}
