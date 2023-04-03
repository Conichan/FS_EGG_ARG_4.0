package clase4;

import java.util.Scanner;
/*Crear un programa que pida una frase y si esa frase es igual a 
“eureka” el programa pondrá un mensaje de Correcto, sino mostrará un
mensaje de Incorrecto. Nota: investigar la función equals() en Java.*/
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase: ");
        frase = leer.next();
        if(frase.equals("eureka")){
            System.out.println("Correto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
