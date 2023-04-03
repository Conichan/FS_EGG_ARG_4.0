package ejercicio4e_guia7_poo;

import Entidad.Cuenta;
import java.util.Scanner;

/*Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo
después de realizar una transacción de retiro.*/
public class Ejercicio4E_guia7_POO {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cuenta nueva = new Cuenta(1000, "nico");
        //nueva.setSaldo(1000);
        
        /*System.out.println("Ingrese el tirular: ");
        nueva.setTitular(leer.nextLine());*/
        System.out.println("Ingrese la cantidad a retirar: ");
        nueva.retirar_dinero(leer.nextDouble());
             
        leer.close();
    }
    
}
