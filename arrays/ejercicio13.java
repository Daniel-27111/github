package arrays;

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {

        // ----------------------------------------------
        // Declaración de variables
        // ----------------------------------------------

        // Constantes

        // Variables de entrada
       int[][] matriz = new int [5][2];
        // Variables de salida

        // Variables auxiliares

        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);

        // ----------------------------------------------
        // Entrada de datos
        // ----------------------------------------------
        System.out.println("PLANTILLA DE PROGRAMA ");
        System.out.println("----------------------");
        System.out.println(" Escribe un valor: ");
        for (int f = 0; f < 5; f++) {
            for (int c = 0; c < 2; c++) {
                System.out.print("Introduce el valor para la posición [" + f + "][" + c + "]: ");
                matriz[f][c]= teclado.nextInt();
        }
        }
     
        
        // ----------------------------------------------
        // Procesamiento
        // ----------------------------------------------
        System.out.println("\nFilas pares de la matriz:");
        for (int f = 0; f < 5; f++) {
            if (f % 2 == 0) {  
                for (int c = 0; c < 2; c++) {
                    System.out.print(matriz[f][c] + " ");  
                }
                System.out.println();
            }
        // ----------------------------------------------
        // Salida de resultados
        // ----------------------------------------------
     
    }
}
}
