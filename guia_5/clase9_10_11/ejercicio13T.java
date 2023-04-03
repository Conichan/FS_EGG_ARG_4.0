package guia5_clases9_10_11;

import java.util.Scanner;

/*ejercicio 13
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de
compañeros de equipo y define su tipo de dato de tal manera que te 
permita alojar sus nombres más adelante.
ejercicio 14
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de
tus compañeros de equipo*/
public class ejercicio13T {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] equipo;
        equipo = new String [10];
               
        for(int i = 0; i < 10; i++){
            System.out.println("Integrante " + (i+1) + ": ");
            equipo[i] = leer.next();
        }
    }
    
}
