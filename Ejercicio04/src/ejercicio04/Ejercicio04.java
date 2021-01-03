/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio04;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double notasEstudiantes[][] = new double[2][2];

        double valor;

        for (int fila = 0; fila < notasEstudiantes.length; fila++) {
            for (int columna = 0; columna < notasEstudiantes.length; columna++){
                System.out.printf("Ingrese el valor para %s %s\n", fila, 
                        columna);
                valor = entrada.nextDouble();
                notasEstudiantes[fila][columna] = valor;

            }

        }
        for (int fila = 0; fila < notasEstudiantes.length; fila++) {
            for (int columna = 0; columna < notasEstudiantes.length; columna++){
                System.out.printf("%s %s valor: %s\n", fila, columna, 
                        notasEstudiantes[fila][columna]);

            }

        }

    }

}