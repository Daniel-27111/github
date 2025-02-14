package arrays;

import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {

        // ----------------------------------------------
        // Declaración de variables
        // ----------------------------------------------

        // Variables de entrada
        int[][] matriz = new int[5][2];
        
        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);

        // ----------------------------------------------
        // Entrada de datos
        // ----------------------------------------------
        System.out.println("PLANTILLA DE PROGRAMA ");
        System.out.println("----------------------");
        for (int f = 0; f < 5; f++) {
            for (int c = 0; c < 2; c++) {
                System.out.print("Introduce el valor para la posición [" + f + "][" + c + "]: ");
                matriz[f][c] = teclado.nextInt();
            }
        }

        // ----------------------------------------------
        // Procesamiento
        // ----------------------------------------------
        System.out.println("\nColumnas impares de la matriz:");
        for (int c = 0; c < 2; c++) {
            if (c % 2 == 1) {  // Verifica si la columna es impar
                for (int f = 0; f < 5; f++) {
                    System.out.print(matriz[f][c] + " ");  // Muestra la columna impar
                }
                System.out.println();  // Salto de línea al final de cada columna
            }
        }

        // ----------------------------------------------
        // Salida de resultados
        // ----------------------------------------------
    }
}