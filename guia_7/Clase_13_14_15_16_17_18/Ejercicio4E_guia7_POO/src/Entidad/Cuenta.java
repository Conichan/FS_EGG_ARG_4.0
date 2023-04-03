package Entidad;

/*Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo
después de realizar una transacción de retiro.*/

public class Cuenta {
    
    private double saldo;
    private String titular;

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public void retirar_dinero(double saldo){
        
        System.out.println("Titular: " + this.titular);
        if ((this.saldo - saldo) > 0){
            
            System.out.println("Transaccion realizada");
            this.saldo = this.saldo - saldo;
            System.out.println("Su saldo es: " + this.saldo);
            
        }else{
            System.out.println("No puede retirar esa cantidad, fondos insuficientes");
            System.out.println("Saldo en la cuenta: " + this.saldo);
        }
    }
}
