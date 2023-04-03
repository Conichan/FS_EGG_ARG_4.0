
package calse7_8;

import java.util.Scanner;

/*Diseñe una función que pida el nombre y la edad de N personas
e imprima los datos de las personas ingresadas por teclado e indique
si son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.*/

public class ejercicio2P {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String continuar = "Si", nombre;
        int edad;
        do{
            nombre = nombreP();
            edad = edadP();
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            if(edad < 18){
                System.out.println("Usted es menor de edad");
            }else{
                System.out.println("Usted es mayor de edad");
            }
            
            System.out.println("Para seguir cargando personas ingrese SI, para terminar ingrese NO");
            continuar = leer.next();
        }while(continuar.equals("Si"));
        
    }
    
    public static String nombreP(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        return leer.next();       
    }
    
    public static int edadP(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        return leer.nextInt();
    }
}
