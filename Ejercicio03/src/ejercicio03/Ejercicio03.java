/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio03;

/**
 *
 * @author USUARIO
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        String[][] notasCualitativas = new String[3][3];
        double[][] notasCuantitativas = {{7.1, 8, 10}, {3, 7, 9}, {10, 9, 2.1}};

        for (int fila = 0; fila < notasCuantitativas.length; fila++) {
            for (int columna = 0; columna < notasCuantitativas.length;
                    columna++) {
                if ((notasCuantitativas[fila][columna] >= 0)
                            && (notasCuantitativas[fila][columna] <= 2.9)) {
                    notasCualitativas[fila][columna] = "Insuficiente";
                } else {
                    if ((notasCuantitativas[fila][columna] >= 3)
                            && (notasCuantitativas[fila][columna] <= 4.9)) {
                        notasCualitativas[fila][columna] = "Regular";
                    } else {
                        if ((notasCuantitativas[fila][columna] >= 5)
                            && (notasCuantitativas[fila][columna] <= 7.9)) {
                            notasCualitativas[fila][columna] = "Buena";
                        } else {
                            if ((notasCuantitativas[fila][columna] >= 8)
                             && (notasCuantitativas[fila][columna] <= 9.5)) {
                                notasCualitativas[fila][columna] = "Muy buena";
                            } else {
                                if ((notasCuantitativas[fila][columna] >= 9.6)
                             && (notasCuantitativas[fila][columna]
                                        <= 10)) {
                                    notasCualitativas[fila][columna]
                                            = "Sobresaliente";
                                }
                            }
                        }
                    }
                }

            }
        }

        for (int fila = 0; fila < notasCuantitativas.length; fila++) {
        for (int columna = 0; columna < notasCuantitativas.length; columna++) {
        System.out.printf("Su nota cuantativa es: %s y su nota cualitativa "
                     + "es: %s\n", notasCuantitativas[fila][columna],
                  notasCualitativas[fila][columna]);
            }
        }
    }

}
