package Entidades;
/*Realizar una clase llamada ParDeNumeros que tenga como atributos dos números
reales con los cuales se realizarán diferentes operaciones matemáticas.
La clase debe tener un constructor vacío, getters y setters.  En el constructor
vacío se usará el Math.random para generar los dos números.*/
public class ParDeNumeros {
    
    private Integer num1;
    private Integer num2;

    public ParDeNumeros() {
        this.num1 = (int)(Math.random()*10);
        this.num2 = (int)(Math.random()*10);
    }

    public Integer getNum1() {
        return num1;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }
}
