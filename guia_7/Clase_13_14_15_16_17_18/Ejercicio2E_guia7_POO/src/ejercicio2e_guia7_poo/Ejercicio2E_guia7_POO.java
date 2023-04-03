package ejercicio2e_guia7_poo;

import Entidad.Puntos;
import java.util.Scanner;

public class Ejercicio2E_guia7_POO {

    /*Definir una clase llamada Puntos que contendrá las coordenadas
    de dos puntos, sus atributos serán, x1, y1, x2, y2, siendo cada
    x e y un punto. Generar un objeto puntos usando un método crearPuntos()
    que le pide al usuario los dos números y los ingresa en los atributos
    del objeto. Después, a través de otro método calcular y devolver
    la distancia que existe entre los dos puntos que existen en la clase
    Puntos. Para conocer como calcular la distancia entre dos puntos consulte
    el siguiente link:
    http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html*/
    
    public static void main(String[] args) {
        
        Puntos puntos = new Puntos();
        
        crearPuntos(puntos);
        
        System.out.println("La distancia entre los puntos es: " + distanciaEntrePuntos(puntos));
        
    }
    
    public static void crearPuntos(Puntos puntos){
        
        Scanner leer = new Scanner(System.in);
                
        System.out.println("Ingrese las coordenadas del primer punto: ");
        System.out.println("X1: ");
        puntos.setX1(leer.nextFloat());
        System.out.println("Y1: ");
        puntos.setY1(leer.nextFloat());
        System.out.println("-----------------------------");
        System.out.println("Ingrese las coordenadas del segundo punto: ");
        System.out.println("X2: ");
        puntos.setX2(leer.nextFloat());
        System.out.println("Y2: ");
        puntos.setY2(leer.nextFloat());
        
        leer.close();
    }
    
    public static double distanciaEntrePuntos(Puntos puntos){
        
        return Math.sqrt(Math.pow((puntos.getX2()-puntos.getX1()), 2)+Math.pow((puntos.getY2()-puntos.getY1()), 2));
    }
}
