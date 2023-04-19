package ejercicio1_guia8_service;

import Servicio.CuentaBancariaService;
import java.util.Scanner;

/*Realizar una clase llamada CuentaBancaria en el paquete Entidades con los
siguientes atributos: numeroCuenta(entero), dniCliente(entero largo), saldoActual.
Agregar constructor vacío, con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
a) Método para crear cuenta pidiéndole los datos al usuario.
b) Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
c) Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual.
Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar
la cuenta en 0.
d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario
no saque más del 20%.
e) Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
f) Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
*/
public class Ejercicio1_guia8_Service {

   public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        CuentaBancariaService cuenta = new CuentaBancariaService();
        
        menu(leer, cuenta);
        
        
        
        
        
        
    }
    
   public static void menu(Scanner leer, CuentaBancariaService cuenta){
       
       int op;
       boolean salir = true;
       do{
           System.out.println("********************");
           System.out.println("*       MENU       *");
           System.out.println("* 1.Crear Cuenta   *");
           System.out.println("* 2.Ingresar       *");
           System.out.println("* 3.Retirar        *");
           System.out.println("* 4.Retiro Expres  *");
           System.out.println("* 5.Consultar Saldo*");
           System.out.println("* 6.Cosultar Datos *");
           System.out.println("* 7.Salir          *");
           System.out.println("********************");

           do{
               op = leer.nextInt();
               if(op < 1 || op > 7){
                   System.out.println("Usted ingreso una opcion invalida, ingrese otra: ");
               }
           }while(op < 1 || op > 7);
           
           switch(op){
               
               case 1:
                   cuenta.crearCuenta();
                   break;
               case 2: 
                   System.out.println("Cantidad a ingresar: ");
                   cuenta.ingresar(leer.nextDouble());
                   break;
               case 3:
                   System.out.println("Ingrese la cantidad a retirar: ");
                   cuenta.retirar(leer.nextDouble());
                   break;
               case 4:
                   cuenta.extraccionRapida();
                   break;
               case 5:
                   cuenta.consultarSaldo();
                   break;
               case 6: 
                   cuenta.consultarDatos();
                   break;
               case 7:
                   salir = false;                  
           }
           
       }while(salir);   
       
       
      
   }
}
