package Servicios;

import Entidades.Cafetera;

/*Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades
con los atributos capacidadMáxima (la cantidad máxima de café que puede contener
la cafetera) y cantidadActual (la cantidad actual de café que hay en la cafetera).
Agregar constructor vacío y con parámetros así como setters y getters. Crear clase
CafeteraServicio en el paquete Servicios con los siguiente:
a) Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
b) Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada.
Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
c) Método vaciarCafetera(): pone la cantidad de café actual en cero. 
d) Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.*/
public class CafeteraServicio {
    
    Cafetera c1 = new Cafetera(1500, 0);
   
    public void llenarCafetera(){
        
        c1.setCantidadActual(c1.getCapacidadMaxima());
        
    }
    
    public void servirTaza(int taza){
        
        int mediaTaza;
        
        if(c1.getCantidadActual() >= taza){
            c1.setCantidadActual(c1.getCantidadActual()-taza);
            System.out.println("Se sirvio una taza");
        }else{
            mediaTaza = taza - c1.getCantidadActual();
            System.out.println("Se lleno " + (taza - mediaTaza) + " cm cubicos de la taza");
            c1.setCantidadActual(0);
        }
    }
    
    public void vaciarCafetera(){
        
        c1.setCantidadActual(0);
    }
    
    public void agregarCafe(int cafe){
        
        if(c1.getCantidadActual() == c1.getCapacidadMaxima()){
            System.out.println("La cafetera esta llena, no puede agregarle mas.");
        }else if((c1.getCantidadActual()+cafe) > c1.getCapacidadMaxima()){
            System.out.println("No puede agregar esa cantidad de cafe, rebalsaria la cafetera");
        }else{
            c1.setCantidadActual(c1.getCantidadActual()+cafe);
        }
    }
}
