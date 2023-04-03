
package clase4;

import java.util.Scanner;
/*Elaborar un algoritmo en el cuál se ingrese una letra y se
detecte si se trata de una vocal. Caso contrario mostrar un mensaje.
Nota: investigar la función equals() de la clase String.*/

public class ejercicio3E {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String letra;
        System.out.println("Ingrese una letra: ");
        letra = leer.next();
        if(letra.equals("a")){
            System.out.println("ES UNA VOCAL");
        }else if(letra.equals("e")){
            System.out.println("ES UNA VOCAL");
        }else if(letra.equals("i")){
            System.out.println("ES UNA VOCAL");
        }else if(letra.equals("o")){
            System.out.println("ES UNA VOCAL");
        }else if(letra.equals("u")){
            System.out.println("ES UNA VOCAL");
        }else{
            System.out.println("NO ES UNA VOCAL");
        }                                    
    }
}
