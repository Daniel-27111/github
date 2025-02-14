package arrays;

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {

        // ----------------------------------------------
        // Declaración de variables
        // ----------------------------------------------

        // Constantes

        // Variables de entrada
        int valor= 0;

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
         int n_f=teclado.nextInt();
         int n_c=n_f*2;
          int[][] array = new int[n_f][n_c];
          for (int f = 0; f < n_f; f++) {
            for (int c = 0; c < n_c; c++) {
        }
        }
        
     
        
        // ----------------------------------------------
        // Procesamiento
        // ----------------------------------------------
        System.out.println("\nMatriz de 1x2 introducida:");
        for (int f = 0; f < n_f; f++) {
            if(f % 2 == 0){
                valor=1;
            }else {
                valor =2;
            }
            for (int c = 0; c < n_c; c++) {
                array[f][c] = valor;
                System.out.print(array[f][c] );  // Muestra los valores de la matriz
            }
            System.out.println(); 

        // ----------------------------------------------
        // Salida de resultados
        // ----------------------------------------------
     
    }
}
}