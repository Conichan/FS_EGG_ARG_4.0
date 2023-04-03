
package clase4;


/*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
*/

public class ejercicio8 {

    
    public static void main(String[] args) {
        
        for(int i = 0; i < 4; i++){
            System.out.print("*"); 
        }
        System.out.println();
        for(int i = 0; i < 2; i++){
            System.out.print("*");
            for(int j = 0; j < 2; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int i = 0; i < 4; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
    

