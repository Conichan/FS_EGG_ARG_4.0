package ejercicio2_guia8_service;

import Servicios.CafeteraServicio;
import java.util.Scanner;

/*Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades
con los atributos capacidadMáxima (la cantidad máxima de café que puede contener
la cafetera) y cantidadActual (la cantidad actual de café que hay en la cafetera).
Agregar constructor vacío y con parámetros así como setters y getters. Crear clase
CafeteraServicio en el paquete Servicios con los siguiente:
a) Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
b) Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada.
Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
c) Método vaciarCafetera(): pone la cantidad de café actual en cero. 
d) Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.*/
public class Ejercicio2_guia8_Service {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CafeteraServicio c1 = new CafeteraServicio();

        menu(leer, c1);

    }

    public static void menu(Scanner leer, CafeteraServicio c1) {

        boolean aux = true;
        do {
            System.out.println("*******************");
            System.out.println("*      MENU       *");
            System.out.println("*1.Llenar cafetera*");
            System.out.println("*2.Servir taza    *");
            System.out.println("*3.Vaciar Cafetera*");
            System.out.println("*4.Agregar Cafe   *");
            System.out.println("*5.Salir          *");
            System.out.println("*******************");

            switch (leer.nextInt()) {
                case 1:
                    c1.llenarCafetera();
                    break;
                case 2:
                    System.out.println("Ingrese el tamaño de la taza en cm cubicos: ");
                    c1.servirTaza(leer.nextInt());
                    break;
                case 3:
                    c1.vaciarCafetera();
                    break;
                case 4:
                    System.out.println("Ingrese una cantidad de cafe para agregar a la cafetera: ");
                    c1.agregarCafe(leer.nextInt());
                    break;
                case 5:
                    aux = false;
            }

        } while (aux);
    }

}
