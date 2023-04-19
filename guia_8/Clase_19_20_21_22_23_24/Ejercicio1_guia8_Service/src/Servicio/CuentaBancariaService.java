package Servicio;

import Entidad.CuentaBancaria;
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
public class CuentaBancariaService {

    Scanner leer = new Scanner(System.in);
    CuentaBancaria c1 = new CuentaBancaria();

    //Método para crear cuenta pidiéndole los datos al usuario.
    public void crearCuenta() {

        c1.setNumeroCuenta(0001);
        System.out.println("Ingrese su DNI: ");
        c1.setDniCliente(leer.nextLong());
        c1.setSaldoActual(0);
    }

    //Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
    public void ingresar(double ingreso) {

        c1.setSaldoActual(c1.getSaldoActual() + ingreso);
        
    }

    //Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual.
    public void retirar(double retiro) {

        double aux;
        String o;
        if (c1.getSaldoActual() == 0) {
            System.out.println("No puede realizar extracciones, saldo: 0");
        } else if (retiro > c1.getSaldoActual()) {
            System.out.println("Usted solo puede retirar: " + c1.getSaldoActual());
            System.out.println("Desea retirarlo? s(SI)/n(NO)");
            o = leer.next();
            if (o.equals("s") || o.equals("S")) {
                aux = retiro - c1.getSaldoActual();
                retiro = retiro - aux;
                c1.setSaldoActual(c1.getSaldoActual() - retiro);
            }
        } else {
            c1.setSaldoActual(c1.getSaldoActual() - retiro);
        }        
    }
    
    /*Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario
    no saque más del 20%.*/
    public void extraccionRapida(){
        
        String o;
        System.out.println("Solo puede extrar: " + (c1.getSaldoActual()*0.2) + " de " + c1.getSaldoActual());
        System.out.println("Desea retirarlo? s(SI)/n(NO)");
        o = leer.next();
        if (o.equals("s") || o.equals("S")){
            c1.setSaldoActual(c1.getSaldoActual()-(c1.getSaldoActual()*0.2));
        }        
    }
    
    //Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
    public void consultarSaldo(){
        
        System.out.println("Saldo: " + c1.getSaldoActual());
    }
    
    //Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
    public void consultarDatos() {
        
        System.out.println("Propietarios de la cuenta: " + c1.getDniCliente());
        System.out.println("Numero de cuenta: " + c1.getNumeroCuenta());
        System.out.println("Saldo: " + c1.getSaldoActual());
    }
}
