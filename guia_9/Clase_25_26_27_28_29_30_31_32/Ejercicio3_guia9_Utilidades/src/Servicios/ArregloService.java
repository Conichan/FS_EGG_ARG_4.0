package Servicios;

import java.util.Arrays;

/*Crear la clase ArregloService, en el paquete servicio, 
con los siguientes métodos:
1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
2) Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
3) Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
4) Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
Luego llenar las últimas 10 posiciones del arreglo B con 0.5.*/
public class ArregloService {
    //Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
    public void inicializarA(double[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (Math.random()*10);
        }
    }
    
    //Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
    public void mostrar(double[] arreglo){
        for (int i = 0; i < arreglo.length; i=i+5) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arreglo[i]+" ");
            }
            System.out.println("");
        }
    }
    
    //Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
    public void ordenar(double[] arreglo){
        Arrays.sort(arreglo);
        double[] arregloInvertido = new double[arreglo.length];
        int j = 0;
        for (int i = arreglo.length-1; i >= 0; i--) {
            arregloInvertido[j] = arreglo[i];
            j++;
        }
        for (int i = 0; i < arregloInvertido.length; i++) {
            arreglo[i] = arregloInvertido[i];
        }
        for (int i = 0; i < arreglo.length; i=i+5){
            for (j = 0; j < 5; j++) {
                System.out.print(arreglo[i]+" ");
            }
            System.out.println("");
        }
    }
    
    /*Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
Luego llenar las últimas 10 posiciones del arreglo B con 0.5.*/
    public void inicializarB(double[] arreglo1, double[] arreglo2){
        for (int i = 0; i < 10; i++) {
            arreglo1[i] = arreglo2[i];
        }
        Arrays.fill(arreglo1, 10, arreglo1.length, 0.5);
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.print(arreglo1[i]+" ");
        }
    }
}
