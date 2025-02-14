package arrays;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {

        // ----------------------------------------------
        // Declaración de variables
        // ----------------------------------------------

        // Constantes

        // Variables de entrada
        /*En Java, cuando creas un array de tipo entero (por ejemplo, int[]), sus elementos se inicializan automáticamente a 0 por defecto.*/
        int[][] array = new int[10][5];

        // Variables de salida

        // Variables auxiliares

        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);

        // ----------------------------------------------
        // Entrada de datos
        // ----------------------------------------------
        System.out.println("PLANTILLA DE PROGRAMA ");
        System.out.println("----------------------");
        System.out.println(" ");

        // ----------------------------------------------
        // Procesamiento
        // ----------------------------------------------
        for (int f = 0; f < array.length; f++) {
            for (int c = 0; c < array[f].length; c++) {
                System.out.print(array[f][c] + "\t");
            }
            System.out.println(""); //Para provocar el salto de línea una vez ha rellenado la fila.
        }

        // ----------------------------------------------
        // Salida de resultados
        // ----------------------------------------------
        System.out.println();
        System.out.println("Fin del programa.");
    }
}