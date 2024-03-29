package ejercicio5e_guia7_poo;

import Entidad.Empleado;
import java.util.Scanner;

public class Ejercicio5E_guia7_POO {

    /*Crea una clase "Empleado" que tenga atributos como "nombre", 
    "edad" y "salario". Luego, crea un método "calcular_aumento" que
    calcule el aumento salarial de un empleado en función de su edad 
    y salario actual. El aumento salarial debe ser del 10% si el empleado
    tiene más de 30 años o del 5% si tiene menos de 30 años.*/
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Empleado p = new Empleado();
        
        System.out.println("Ingrese su nombre:");
        p.setNombre(leer.nextLine());
        System.out.println("Ingrese su edad: ");
        p.setEdad(leer.nextInt());
        System.out.println("Ingrese su salario: ");
        p.setSalario(leer.nextDouble());
        System.out.println(p.getSalario());
        System.out.println("Usted resibira un aumento de: " + (p.calcular_aumento() + p.getSalario()));
        
    }
    
}
