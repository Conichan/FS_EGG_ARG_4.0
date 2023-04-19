package ejercicio3_guia9_utilidades;

import Servicios.ArregloService;
import java.util.Scanner;

/*Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo 
B de 20 números reales. Crear la clase ArregloService, en el paquete servicio, 
con los siguientes métodos:
1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
2) Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
3) Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
4) Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B. */
public class Ejercicio3_guia9_Utilidades {

    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        ArregloService AB = new ArregloService();
        double[] A = new double[50];
        double[] B = new double[20];
        
        //Inicializar arreglo A: 
        AB.inicializarA(A);
        //Muestra el arreglo A:
        System.out.println("Arreglo A: ");
        AB.mostrar(A);
        //Arreglo A ordenado de mayor a menor:
        System.out.println("Arreglo A ordenado de mayor a menor: ");
        AB.ordenar(A);
        
        System.out.println("Inicializar arreglo B: ");
        AB.inicializarB(B, A);
        
    }
    
}
