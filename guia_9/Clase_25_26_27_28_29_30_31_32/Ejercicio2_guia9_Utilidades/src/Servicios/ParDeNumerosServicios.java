package Servicios;

import Entidades.ParDeNumeros;

/*Crear una claseParDeNumerosService, en el paquete Servicios, que deberá
además implementar los siguientes métodos:
a) Método mostrarValores que muestra cuáles son los dos números guardados.
b) Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
c) Método calcularPotencia para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.*/
public class ParDeNumerosServicios {
    
    ParDeNumeros numeros = new ParDeNumeros();
    
    /*Método mostrarValores que muestra cuáles son los dos números guardados.*/
    public void mostrarValores(){
        System.out.println("Numero 1: " + numeros.getNum1());
        System.out.println("Numero 2: " + numeros.getNum2());
    }
    
    /*Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor*/
    public Integer devolverMayor(){
        if(numeros.getNum1().compareTo(numeros.getNum2())==(-1)){
          return numeros.getNum2();
        }else if(numeros.getNum1().compareTo(numeros.getNum2())==(1)){
            return numeros.getNum1();
        }
        return numeros.getNum1();
    }
    
    /*Método calcularPotencia para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.*/
    public void calcularPotencia(){
        switch (numeros.getNum1().compareTo(numeros.getNum2())) {
            case (-1):
                System.out.println(Math.pow(numeros.getNum2(),numeros.getNum1()));
                break;
            case (1):
                System.out.println(Math.pow(numeros.getNum1(),numeros.getNum2()));
                break;
            default:
                System.out.println(Math.pow(numeros.getNum2(),numeros.getNum1()));
                break;
        }
    }
    
    /*Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.*/
    public void calcularRaiz(){
        System.out.println(Math.sqrt(Math.min(Math.abs(numeros.getNum1()), numeros.getNum2())));
    }
}
