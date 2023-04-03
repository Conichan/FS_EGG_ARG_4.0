package Entidad;

/*Declarar una clase llamada Circunferencia que tenga como atributo privado el
radio de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
e) Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).*/

public class Circunferencia {
    
    private float radio;

    public Circunferencia(float radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
   
    public float area(){
        return (float) (Math.PI*Math.pow(radio, 2));
    }
    
    public float perimetro(){
        return (float) (Math.PI*2*radio);
    }

        @Override
    public String toString() {
        return "Circunferencia{" + " radio=" + radio + " area=" + area() + " perimetro=" + perimetro() + "}";
    } 
}
