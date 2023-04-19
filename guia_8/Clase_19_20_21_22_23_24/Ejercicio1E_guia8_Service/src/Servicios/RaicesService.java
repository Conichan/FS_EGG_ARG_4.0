package Servicios;

import Entidad.Raices;


/*Vamos a realizar una clase llamada Raices, donde representaremos los valores
de una ecuación de 2º grado. Tendremos los 3 coeficientes como atributos, 
llamémosles a, b y c. Hay que insertar estos 3 valores para construir el objeto
a través de un método constructor. Luego, en RaicesServicio las operaciones que
se podrán realizar son las siguientes:
a) Método getDiscriminante(): devuelve el valor del discriminante (double).
El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
b) Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones,
para que esto ocurra, el discriminante debe ser mayor o igual que 0.
c) Método tieneRaiz(): devuelve un booleano indicando si tiene una única
solución, para que esto ocurra, el discriminante debe ser igual que 0.
d) Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime
las 2 posibles soluciones.
e) Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una
única raíz. Es en el caso en que se tenga una única solución posible.
f) Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y 
mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con
los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros
métodos y en caso de no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía
el signo delante de -b*/

public class RaicesService {
  
    Raices eq = new Raices(1,-2,1);
    
    /* Método getDiscriminante(): devuelve el valor del discriminante (double).
El discriminante tiene la siguiente fórmula: (b^2)-4*a*c*/
    
    private double getDiscriminante(){
        
        return (Math.pow(eq.getB(), 2)-(4*eq.getA()*eq.getC()));
    }
    
    /* Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones,
para que esto ocurra, el discriminante debe ser mayor o igual que 0. */
    
    private boolean tieneRaices(){
        
        if(getDiscriminante() > 0){
            return true;            
        }
        
        return false;       
    }
    
    /*Método tieneRaiz(): devuelve un booleano indicando si tiene una única
solución, para que esto ocurra, el discriminante debe ser igual que 0.*/
    
    private boolean tieneRaiz(){
        
        if(getDiscriminante() == 0){
            return true;            
        }
        
        return false;
    }
    
    /*Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime
las 2 posibles soluciones.*/
    
    private void obtenerRaices(){
        
        System.out.println("X1: " + (-eq.getB()+ Math.pow((Math.pow(eq.getB(), 2))-(4*eq.getA()*eq.getC()),0.5))
                /(2*eq.getA()));
        System.out.println("X2: " + (-eq.getB()- Math.pow((Math.pow(eq.getB(), 2))-(4*eq.getA()*eq.getC()),0.5))
                /(2*eq.getA()));
    }
    
    /*Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una
única raíz. Es en el caso en que se tenga una única solución posible.*/
    
    private void obtenerRaiz(){
        
        System.out.println("X: " + (-eq.getB()+ Math.pow((Math.pow(eq.getB(), 2))-(4*eq.getA()*eq.getC()),0.5))
                /(2*eq.getA()));
    }
    
    /*Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y 
mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con
los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros
métodos y en caso de no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía
el signo delante de -b*/
    
    public void calcular(){
        
        if(tieneRaices()){
            obtenerRaices();
        }else if(tieneRaiz()){
            obtenerRaiz();
        }else{
            System.out.println("No existe solucion para esta ecuacion");
        }
    }
}
