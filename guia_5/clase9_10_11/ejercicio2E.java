package guia5_clases9_10_11;

import java.util.Scanner;

/*Escriba un programa que averigüe si dos vectores de N enteros
son iguales (la comparación deberá detenerse en cuanto se detecte
alguna diferencia entre los elementos).*/
public class ejercicio2E {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] v1;
        int[] v2;
        int n1;
        boolean b = true;
        System.out.println("Ingrese el largo del vector los vectores: ");
        n1 = leer.nextInt();
        v1 = new int[n1];
        v2 = new int[n1];
        cargar(v1);
        cargar(v2);
        for (int i = 0; i < v1.length; i++) {
            System.out.println(v1[i] + " " + v2[i]);
            if (v1[i] != v2[i]) {
                b = false;
                break;
            }

        }
        if (b) {
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("Los vectores no son iguales");
        }

        //   System.out.println("Los vectores no son iguales");
    }

    public static void cargar(int[] v) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < v.length; i++) {
            System.out.println("ingrese un elemento del vector: ");
            v[i] = leer.nextInt();
        }
        System.out.println("=================================");
    }
}
