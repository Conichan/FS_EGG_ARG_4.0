
package calse7_8;

import java.util.Scanner;
/*Escribir un programa que procese una secuencia de caracteres ingresada
por teclado y terminada en punto, y luego codifique la palabra o frase
ingresada de la siguiente manera: cada vocal se reemplaza por el carácter
que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.
a   e   i   o   u
@   #   $   %   *
Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
.*/

public class ejercicio11T {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char caracter; 
        System.out.print("Introduce un carácter: ");
        caracter = sc.next().charAt(0);  //se obtiene el primer carácter del String introducido por teclado       
        System.out.println("Carácter introducido -> " + caracter); 
    }
}
        /*Scanner leer = new Scanner(System.in).useDelimiter(".");
        //String prueba = cambioDeLetra(frase.subcadena(0,0));
        //prueba = prueba.concat("L");
        
        
        System.out.println("Introducir una frase");
     
        String frase = leer.nextLine();
        
        int pos = frase.indexOf('.');
        
        if(pos > 0){
            frase = frase.substring(0,pos);
        }
        System.out.println(frase);

        String fraseNueva = cambioDeLetra(frase.substring(0,1));
        
       
        for(int i = 1 ; i < frase.length(); i++){
            fraseNueva = fraseNueva.concat(cambioDeLetra(frase.substring(i,i+ 1)));
        }
        
        System.out.println(fraseNueva);
        
    }
    public static String cambioDeLetra(String letra){
        
        switch (letra){
            case "a":
                return "@";
            case "A":
                return "@";
            case "e":
                return "#";
            case "i":
                return "$";
                
            case "o":
                return "%";
                
            case "u":
                return "*";
            default:
                return letra;
        }
        
    }
}
*/
