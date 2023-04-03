package clase4;

import java.util.Scanner;

/*Se dispone de un conjunto de N familias, cada una de las cuales tiene
una M cantidad de hijos. Escriba un programa que pida la cantidad de familias
y para cada familia la cantidad de hijos para averiguar la media de edad de los
hijos de todas las familias.*/
public class ejercicio14E {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, m, cont = 0;
        double media = 0;
        System.out.println("Ingrese la cantidad de familias: ");
        n = leer.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Ingrese la cantidad de hijos de la familia " + (i+1) + ":");
            m = leer.nextInt();
            for(int j = 0; j < m; j++){
                System.out.println("Edad hijo " + (j+1) + ":");
                media = media + leer.nextDouble();
                cont++;
            }
        }
        System.out.println("La media de edad de hijos es: " + media/cont);
    }
    
}
