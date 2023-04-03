
package calse7_8;

import java.util.Scanner;
/*Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden 
ser a dólares, yenes o libras. La función tendrá como parámetros,
la cantidad de euros y la moneda a convertir que será una cadena,
este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
*/

public class ejercicio3P {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float euros;
        String divisa;
        System.out.println("Ingrese la cantidad de euros a convertir: ");
        euros = leer.nextFloat();
        System.out.println("Ingrese la divisa a la cual quiere realizar el cambio: ");
        System.out.println("(dolares, yenes o libras");
        divisa = leer.next();
        pasar( euros, divisa);
    }
    public static void pasar(float euros, String divisa){
        switch(divisa){
            case "dolares":
                System.out.println("Sus euros: " + euros);
                System.out.println("Convertdos a dolares: " + (euros*1.28611));
                break;
            case "yenes":
                System.out.println("Sus euros: " + euros);
                System.out.println("Convertdos a yenes: " + (euros*129.852));
                break;
            case "libras":
                System.out.println("Sus euros: " + euros);
                System.out.println("Convertdos a libras: " + (euros*0.86));
                break;
            default:
                System.out.println("Usted ingreso una opcion invalida");
        }
        
    }  
   
    
}
