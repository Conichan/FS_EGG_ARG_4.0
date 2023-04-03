package ejercicio2_guia7_poo;

import Entidad.Circunferencia;
import java.util.Scanner;

/*Declarar una clase llamada Circunferencia que tenga como atributo privado el
radio de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
e) Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
*/
public class Ejercicio2_guia7_POO {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Circunferencia c1 = new Circunferencia();
        crearCircunferencia(c1);  
        System.out.println(c1.toString());
    }
    
    public static void crearCircunferencia(Circunferencia c1){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia: ");
        c1.setRadio(leer.nextFloat()); 
    }
}
