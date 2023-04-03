
package clase4;

import java.util.Scanner;
/*Una obra social tiene tres clases de socios:
--Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento
en todos los tipos de tratamientos.
--Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
para los mismos tratamientos que los socios del tipo A.
--Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
dichos tratamientos.
--Solicite una letra (carácter) que representa la clase de un socio, y luego un
valor real que represente el costo del tratamiento (previo al descuento)
y determine el importe en efectivo a pagar por dicho socio.*/

public class ejercicio5E {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double costo;
        String letra;
        do{
            System.out.println("Ingrese que categoria de socio es (A-B-C): ");
            letra = leer.next();
        }while(letra.length() != 1);
        
        System.out.println("Ingrese el importe a abonar: ");
        costo = leer.nextDouble();
        
        switch(letra){
            case "A":
                System.out.println("Usted recibe un descuento del 50%");
                System.out.println("Por lo tanot abonara: " + (costo*0.5));
                break;
            case "B":
                System.out.println("Usted recibe un descuento del 35%");
                System.out.println("Por lo tanot abonara: " + (costo-(costo*0.35)));
                break; 
            case "C":
                System.out.println("Usted no recibe un descuento");
                System.out.println("Por lo tanot abonara: " + costo);
                break;
            default:
                System.out.println("No existe este tipo de asociado en la empresa");
        }
        
    }
    
}
