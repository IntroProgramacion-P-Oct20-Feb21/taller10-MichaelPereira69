/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio06;

/**
 *
 * @author USUARIO
 */
public class Ejercicio06 {

    public static void main(String[] args) {
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };
        String cadena_final = "";
        for (int fila = 0; fila < estudiantes.length; fila++) {
            for (int columna = 0; columna < 2; columna++) {
                if (estudiantes[fila][columna].length() == 11) {
                    cadena_final = String.format("%s%s\n", cadena_final,
                            estudiantes[fila][columna]);

                }
            }

        }
        System.out.printf("%s", cadena_final);

    }

}

