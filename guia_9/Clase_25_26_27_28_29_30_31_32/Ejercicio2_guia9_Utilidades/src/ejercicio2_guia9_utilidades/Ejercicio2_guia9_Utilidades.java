package ejercicio2_guia9_utilidades;

import Servicios.ParDeNumerosServicios;

/*Realizar una clase llamada ParDeNumeros que tenga como atributos dos números
reales con los cuales se realizarán diferentes operaciones matemáticas.
La clase debe tener un constructor vacío, getters y setters.  En el constructor
vacío se usará el Math.random para generar los dos números. Crear una clase 
ParDeNumerosService, en el paquete Servicios, que deberá además implementar
los siguientes métodos:
a) Método mostrarValores que muestra cuáles son los dos números guardados.
b) Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
c) Método calcularPotencia para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.*/
public class Ejercicio2_guia9_Utilidades {

    public static void main(String[] args) {
        ParDeNumerosServicios servicio = new ParDeNumerosServicios();
        
        servicio.mostrarValores();
        
        System.out.println("El numero mayor es: "+ servicio.devolverMayor());
        
        servicio.calcularPotencia();
        
        servicio.calcularRaiz();
    }
    
}
