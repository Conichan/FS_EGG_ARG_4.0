package Service;

import Entidades.NIF;
import java.util.Scanner;

public class NIFService {
    
    Scanner leer = new Scanner(System.in);
    NIF n = new NIF();
    
    public long getDNI(){
               
        return n.dni;
    
    }
    
    public String getLetra(){
        
        return n.letra;
        
    }
    
    public void setDNI(long dni){
        
        n.dni = dni;
        
    }
    
    public void setLetra(String letra){
        
        n.letra = letra;
        
    }
            
    public void crearNif(){
        
        System.out.println("Ingrese su DNI: ");
        setDNI(leer.nextLong());
        
        String[] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        
        long a = getDNI() % 23;
        
        for (int i = 0; i < letras.length; i++) {
            if(a == i){
                n.letra = letras[i];
            }
            
        }
    
    }     
    
    public void mostrar(){
        
        System.out.println("DNI: " + getDNI());
        System.out.println("Letra: " + getLetra());
        System.out.println("Modulo: " + (getDNI() % 23));
    }
}
