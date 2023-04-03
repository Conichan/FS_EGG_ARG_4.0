
package clase4;

import java.util.Scanner;
/*Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.*/

public class ejercicio6E {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, i = 0, cont = 0;
        float estatura, suma160 = 0, sumageneral = 0;
        System.out.println("Ingrese la cantidad de personas estudiadas: ");
        n = leer.nextInt();
        while(i < n){
            System.out.println("Ingrese la estatura de la persona n° " + (i+1) + ": ");
            estatura = leer.nextFloat();
            if(estatura < 1.60){
                suma160 = suma160 + estatura;
                cont++;                
            }
            sumageneral = sumageneral + estatura;
            i++;
        }
        System.out.println("El promedio de personas mas bajas de 1.60 es: " + (suma160/cont));
        System.out.println("El promedio de estaturas general es: " + (sumageneral/n));
    }
    
}
