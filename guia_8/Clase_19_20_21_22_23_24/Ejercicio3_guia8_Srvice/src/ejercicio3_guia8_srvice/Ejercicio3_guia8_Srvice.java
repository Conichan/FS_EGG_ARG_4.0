package ejercicio3_guia8_srvice;

import Servicio.PersonaService;

/*Realizar una clase llamada Persona en el paquete de entidades que tengan los
siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ 
para otro), peso y altura. Si desea añadir algún otro atributo, puede hacerlo. 
Agregar constructores, getters y setters.
En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La función 
devuelve un booleano.
b) Metodo crearPersona(): el método crear persona, le pide los valores de los
atributos al usuario y después se le asignan a sus respectivos atributos para
llenar el objeto Persona. Además, comprueba que el sexo introducido sea correcto,
es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
c) Método calcularIMC(): calculara si la persona está en su peso ideal 
(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor
que 20, significa que la persona está por debajo de su peso ideal y la función
devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos),
significa que la persona está en su peso ideal y la función devuelve un 0. Finalmente,
si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene
sobrepeso, y la función devuelve un 1.
A continuación, en la clase main hacer lo siguiente:
* Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos
todos los métodos para cada objeto, deberá comprobar si la persona está en su peso
ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto
si la persona es mayor de edad.
* Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables(arrays), para después calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos,
por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores. Para esto, podemos crear unos métodos adicionales.*/
public class Ejercicio3_guia8_Srvice {

    public static void main(String[] args) {

        PersonaService p1 = new PersonaService();
        PersonaService p2 = new PersonaService();
        PersonaService p3 = new PersonaService();
        PersonaService p4 = new PersonaService();

        int peso[] = new int[4];
        boolean edad[] = new boolean[4];
        int cont = 0;

        p1.crearPersona();
        estado(p1, peso, edad, cont);
        cont++;
        System.out.println("*****************************");
        p2.crearPersona();
        estado(p2, peso, edad, cont);
        cont++;
        System.out.println("*****************************");
        p3.crearPersona();
        estado(p3, peso, edad, cont);
        cont++;
        System.out.println("*****************************");
        p4.crearPersona();
        estado(p4, peso, edad, cont);
        cont++;

        System.out.println(peso[0] + " " + peso[1] + " " + peso[2] + " " + peso[3]);
        System.out.println(edad[0] + " " + edad[1] + " " + edad[2] + " " + edad[3]);
        pesoMostrar(peso);
        edadMayorMenor(edad);

    }

    public static void edadMayorMenor(boolean[] edad) {

        int mayor = 0, menor = 0;

        for (int i = 0; i < edad.length; i++) {
            if (edad[i] == true) {
                mayor++;
            } else {
                menor++;
            }
        }

        float porcentajeMayor = (float) mayor / edad.length * 100;
        float porcentajeMenor = (float) menor / edad.length * 100;

        System.out.printf("El porcentaje de personas mayores de edad es: %.2f%%\n", porcentajeMayor);
        System.out.printf("El porcentaje de personas menores de edad es: %.2f%%\n", porcentajeMenor);
    }

    public static void pesoMostrar(int[] peso) {

        int menos = 0, igual = 0, mas = 0;

        for (int i = 0; i < peso.length; i++) {
            switch (peso[i]) {
                case -1:
                    menos++;
                    break;
                case 0:
                    igual++;
                    break;
                case 1:
                    mas++;
                    break;
            }
        }

        float porcentajeMenos = (float) menos / peso.length * 100;
        float porcentajeIgual = (float) igual / peso.length * 100;
        float porcentajeMas = (float) mas / peso.length * 100;

        System.out.printf("El porcentaje de personas con un peso por debajo del normal es: %.2f%%\n", porcentajeMenos);
        System.out.printf("El porcentaje de personas con un peso normal es: %.2f%%\n", porcentajeIgual);
        System.out.printf("El porcentaje de personas con un peso por encima del normal es: %.2f%%\n", porcentajeMas);
    }

    public static void estado(PersonaService a, int[] peso, boolean[] edad, int cont) {

        switch (a.calcularIMC()) {
            case -1:
                System.out.println("Usted esta por debajo de su peso normal");
                break;
            case 0:
                System.out.println("Usted tiene un peso ideal");
                break;
            case 1:
                System.out.println("Ustd esta por ensima de su peso normal");
                break;
        }

        if (a.esMayorDeEdad()) {
            System.out.println("Mayor de edad: Si");
        } else {
            System.out.println("Mayor de edad: No");
        }

        peso[cont] = a.calcularIMC();
        edad[cont] = a.esMayorDeEdad();

    }

}
