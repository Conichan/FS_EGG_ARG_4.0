
package clase4;

import java.util.Scanner;
/*Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre
los números del 0-0-0 al 9-9-9, con la particularidad que cada vez que
aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
*/

public class ejercicio12E {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1 = 0, n2 = 0, n3 = 0;
        String c, d, u;
                      
        do{           
            if(n2 > 9 && n3 > 9){
                n1++;
            }
            c = Integer.toString(n1);
            if(c.equals("3")){
                System.out.print("E");
            }else{
                System.out.print(n1);
            }
            if(n2 > 9 && n3 > 9){
                n2 = 0;                    
                //n1++;
            }
                
            
            System.out.print(" - ");
            if(n3 > 9){
                n2++;
            }   
            d = Integer.toString(n2);
            if(d.equals("3")){
                System.out.print("E");
            }else{
                  System.out.print(n2);
                 }
            if(n3 > 9){
                n3 = 0;
                //n2++;
            }
                
            System.out.print(" - ");
            
            u = Integer.toString(n3);
            if(u.equals("3")){
            System.out.println("E");
            }else{
                  System.out.println(n3);
                }
            n3++;
            
        }while(n1 < 10);
        
        
    }
    
}
