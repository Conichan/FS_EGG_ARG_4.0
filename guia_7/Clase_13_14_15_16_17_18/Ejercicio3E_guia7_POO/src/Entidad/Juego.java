package Entidad;

import java.util.Scanner;

/*Crea una clase "Juego" que tenga un método "iniciar_juego"
que permita a dos jugadores jugar un juego de adivinanza de números.
El primer jugador elige un número y el segundo jugador intenta adivinarlo.
El segundo jugador tiene un número limitado de intentos y recibe una pista
de "más alto" o "más bajo" después de cada intento. El juego termina cuando 
el segundo jugador adivina el número o se queda sin intentos. Registra el
número de intentos necesarios para adivinar el número y el número de veces
que cada jugador ha ganado.*/

public class Juego {

    private int jugaor1;
    private int jugador2;

    public Juego() {
    }

    public Juego(int jugaor1, int jugador2) {
        this.jugaor1 = jugaor1;
        this.jugador2 = jugador2;
    }

    public int getJugaor1() {
        return jugaor1;
    }

    public void setJugaor1(int jugaor1) {
        this.jugaor1 = jugaor1;
    }

    public int getJugador2() {
        return jugador2;
    }

    public void setJugador2(int jugador2) {
        this.jugador2 = jugador2;
    }

    public void iniciar_juego() {

        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa un numero ");
        this.jugaor1 = leer.nextInt();

        for (int i = 0; i < 4; i++) {
            System.out.println("ingrese un numero");
            this.jugador2 = leer.nextInt();
            if (this.jugaor1 == this.jugador2) {
                System.out.println("adivinaste!!");
                break;
            } else {
                if (this.jugador2 > this.jugaor1){
                System.out.println("el numero es menor, ingrese otro ");
                    
            }
                if (this.jugador2 < this.jugaor1){
                System.out.println("el numero es mayor, ingrese otro ");
            }
            }
        }
    }
                
}
    
    
   
   
    
    
   
    
    
    
    
    
