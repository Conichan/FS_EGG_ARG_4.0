
package clase4;

import java.util.Scanner;
/*Dado un tiempo en minutos, calcular su equivalente en días y horas.
Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular
su equivalente: 1 día, 2 horas.*/

public class ejercicio1E {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tiempo, minutos, horas, dia;
        
        System.out.println("Ingrese la cantidad de minutos: ");
        tiempo = leer.nextInt();
        dia = 0;
        horas = 0;
        minutos = 0;
        while(tiempo > 0){
            if(tiempo >= 1140){
                dia = dia + 1;
                tiempo = tiempo - 1140;
            }else if(tiempo >= 60){
                horas = horas + 1;
                tiempo = tiempo - 60;
                }else{
                     minutos = minutos + 1;
                     tiempo = tiempo - 1;
                } 
        }
        System.out.println("Dias: " + dia);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
    }
    
}
