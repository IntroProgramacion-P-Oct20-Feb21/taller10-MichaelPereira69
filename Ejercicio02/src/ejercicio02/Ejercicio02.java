/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio02;

import java.util.Scanner;

/**

 * @author USUARIO
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] vendedores = new String[2];
        vendedores[0] = "Jessica cole";
        vendedores[1] = "Robert Wallace";
        double[][] ventas = new double[2][5];
        double valor;
        double suma = 0;

        for (int fila = 0; fila < 2; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                System.out.printf("Ingrese  valor de ventas  %s\n",
                        vendedores[fila]);
                valor = entrada.nextDouble();
                ventas[fila][columna] = valor;
                suma = suma + ventas[fila][columna];

            }

        }

        System.out.printf("Vendedor(a) %s\nVendedor(a) %s\nHa"
                + "total de %.2f en ventas.\n",
                vendedores[0], vendedores[1], suma);

    }

}
