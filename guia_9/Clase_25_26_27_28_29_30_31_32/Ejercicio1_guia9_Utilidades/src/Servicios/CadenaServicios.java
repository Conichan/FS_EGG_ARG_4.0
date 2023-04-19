/*Crear una clase CadenaServicio en el paquete servicios que implemente los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales 
que tiene la frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla 
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el
usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
d) Método compararLongitud(String frase), deberá comparar la longitud de la
frase que compone la clase con otra nueva frase ingresada por el usuario.
e) Método unirFrases(String frase), deberá unir la frase contenida en la clase
Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
f) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que
se encuentren en la frase, por algún otro carácter seleccionado por el usuario
y mostrar la frase resultante.
g) Método contiene(String letra), deberá comprobar si la frase contiene una 
letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.*/
package Servicios;
import Entidades.Cadena;
import java.util.Scanner;

public class CadenaServicios {
    
    
public Cadena ingresarFrase(){
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    System.out.println("Ingrese una frase: ");
    Cadena frase = new Cadena(leer.next());
    return frase;
}

/*Método mostrarVocales(), deberá contabilizar la cantidad de vocales 
que tiene la frase ingresada.*/
public void mostrarVocales(Cadena frase){
    frase.setFrase(frase.getFrase().toLowerCase());
    int contVocales = 0;
    for (int i = 0; i < frase.getFrase().length(); i++) {
        if (frase.getFrase().charAt(i) == 'a' || frase.getFrase().charAt(i) == 'e' || frase.getFrase().charAt(i) == 'i' || frase.getFrase().charAt(i) == 'o' || frase.getFrase().charAt(i) == 'u'){
            contVocales++;            
        }
    }
    System.out.println("La cantidad de vocales es: " + contVocales);
}
/*Método invertirFrase(), deberá invertir la frase ingresada y mostrarla 
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".*/
    public void invertirFrase(Cadena frase){
        System.out.println("Frase invertida: ");        
        for (int i = frase.getFrase().length(); i > 0; i--) {
            System.out.print(frase.getFrase().substring(i-1, i));           
        }
        System.out.println(" ");
    }
/*Método vecesRepetido(String letra), recibirá un carácter ingresado por el
usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.*/    
    public void vecesRepetido(String letra, Cadena frase){
        int cont = 0;
        for (int i = 0; i < frase.getFrase().length(); i++) {
            if (frase.getFrase().charAt(i) == letra.charAt(0)){
                cont++;            
            }
        }
        System.out.println("El caracter "+letra+" se repite "+cont+" veces");
    }
/*Método compararLongitud(String frase), deberá comparar la longitud de la
frase que compone la clase con otra nueva frase ingresada por el usuario.*/
    public void compararLongitud(Cadena frase, String frase1){
        
        if(frase1.equals(frase.getFrase())){
            System.out.println("las cadenas son iguales");
        }else{
            System.out.println("Las cadenas no son iguales");
        }
    }
/*Método unirFrases(String frase), deberá unir la frase contenida en la clase
Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.*/    
    public void unirFrases(String frase1, Cadena frase){
        System.out.println(frase.getFrase().concat(" " + frase1));
    }
/*Método reemplazar(String letra), deberá reemplazar todas las letras “a” que
se encuentren en la frase, por algún otro carácter seleccionado por el usuario
y mostrar la frase resultante.*/
    public void reemplazar(String letra, Cadena frase){
        frase.setFrase(frase.getFrase().replaceAll(letra, "a"));
        System.out.println("Frase reemplazada: " + frase.getFrase());
    }
/*Método contiene(String letra), deberá comprobar si la frase contiene una 
letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no*/    
   public boolean contiene(String letra, Cadena frase){
       for (int i = 0; i < frase.getFrase().length(); i++) {
           if(frase.getFrase().charAt(i) == letra.charAt(0)){
               return true;
           }
       }
       return false;
   } 
}
