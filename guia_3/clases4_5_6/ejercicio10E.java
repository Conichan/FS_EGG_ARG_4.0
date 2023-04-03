
package clase4;
import java.util.Scanner;

/*Realice un programa para que el usuario adivine el resultado
de una multiplicación entre dos números generados aleatoriamente
entre 0 y 10. El programa debe indicar al usuario si su respuesta 
es o no correcta. En caso que la respuesta sea incorrecta se debe
permitir al usuario ingresar su respuesta nuevamente. Para realizar
este ejercicio investigue como utilizar la función Math.random() de Java.*/

public class ejercicio10E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1, n2, entrada;
        n1 = (int)(Math.random()*10);
        n2 = (int)(Math.random()*10);
        
        do{
            System.out.println("Adivine el numero (1-10): ");
            entrada = leer.nextInt();
            if(entrada == (n1*n2)){
                System.out.println("******Acerto******");
            }else{
                System.out.println("Lastima, siga participando");
            }
        }while(entrada != (n1*n2));
    }
    
}
