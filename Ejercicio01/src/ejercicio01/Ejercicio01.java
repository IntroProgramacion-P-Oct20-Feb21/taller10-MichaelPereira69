/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio01;

/**
 *
 * @author USUARIO
 */
public class  Ejercicio01{

    public static void main(String[] args) {
        double notas[][] = {{9.0, 10.0, 7.0, 8.0}, 
            {10.0, 5.0, 7.0, 9.0}, 
            {7, 9.4, 10, 9}};
        double promedio[] = new double[3];
        String[] estudiantes = new String[3];
        estudiantes[0] = "Jerry Ponce";
        estudiantes[1] = "Gabriela Lewis";
        estudiantes[2] = "David Bell";
        double suma = 0;

        for (int fila = 0; fila < 3; fila++) {
            suma = 0;
            for (int columna = 0; columna < 4; columna++) {
                suma = suma + notas[fila][columna];

            }
            promedio[fila] = suma / 4;

        }
        for (int indice = 0; indice < 3; indice++) {
            System.out.printf("Estudiante: %s tiene un promedio de %.2f\n", 
                    estudiantes[indice], promedio[indice]);

        }
    }

}