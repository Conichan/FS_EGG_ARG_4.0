package guia5_clases9_10_11;

import java.util.Scanner;

/*Los profesores del curso de programación de Egg necesitan llevar
un registro de las notas adquiridas por sus 10 alumnos para luego 
obtener una cantidad de aprobados y desaprobados. Durante el período
de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos 
y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
Al final del programa los profesores necesitan obtener por pantalla la cantidad
de aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos
con promedio mayor o igual al 7 de sus notas del curso.*/
public class ejercicio4E {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int ap = 0, nap = 0;
        int[][] alumnos = new int[10][4];
        float[] promedio = new float[10];
        for (int i = 0; i < alumnos.length; i++) {
            promedio[i] = 0;
            System.out.println("Ingrese las notas del alumno " + (i + 1) + ":");
            for (int j = 0; j < alumnos[0].length; j++) {
                switch (j) {
                    case 0:
                        System.out.println("Nota Primer TP Evaluativo: ");
                        alumnos[i][j] = leer.nextInt();
                        promedio[i] = promedio[i] + (float) (alumnos[i][j] * 0.10);
                        break;
                    case 1:
                        System.out.println("Nota Segundo TP Evaluativo: ");
                        alumnos[i][j] = leer.nextInt();
                        promedio[i] = promedio[i] + (float) (alumnos[i][j] * 0.15);
                        break;
                    case 2:
                        System.out.println("Nota Primer Integrador: ");
                        alumnos[i][j] = leer.nextInt();
                        promedio[i] = promedio[i] + (float) (alumnos[i][j] * 0.25);
                        break;
                    case 3:
                        System.out.println("Nota Segundo Integrador: ");
                        alumnos[i][j] = leer.nextInt();
                        promedio[i] = promedio[i] + (float) (alumnos[i][j] * 0.50);
                        break;
                }

            }
        }
        for (int i = 0; i < promedio.length; i++) {
            if (promedio[i] < 7) {
                nap++;
            } else {
                ap++;
            }

        }

    }
}
