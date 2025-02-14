package arrays;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {

        // ----------------------------------------------
        // Declaración de variables
        // ----------------------------------------------

        // Constantes

        // Variables de entrada
        /*En Java, cuando creas un array de tipo entero (por ejemplo, int[]), sus elementos se inicializan automáticamente a 0 por defecto.*/
        int[][] array = new int[4][2];

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
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 2; c++) {
        System.out.print("Introduce el valor para la posición [" + f + "][" + c + "]: ");
        array[f][c]=teclado.nextInt();
            }
        }
        
        // ----------------------------------------------
        // Procesamiento
        // ----------------------------------------------
        System.out.println("\nMatriz de 4x2 introducida:");
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 2; c++) {
                System.out.print(array[f][c] + " ");  // Muestra los valores de la matriz
            }
            System.out.println(); 

        // ----------------------------------------------
        // Salida de resultados
        // ----------------------------------------------
     
    }
}
}