package ejercicio3_gui7_poo;

import Entidad.Operacion;
import java.util.Scanner;

public class Ejercicio3_gui7_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacion op = new Operacion();
        crearOperacion(op);
        System.out.println(op.toString());
        
    }
    public static void crearOperacion(Operacion op){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero 1: ");
        op.setNumero1(leer.nextFloat());
        System.out.println("Ingrese el numero 2: ");
        op.setNumero2(leer.nextFloat());
        
    }
}
