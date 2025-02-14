package arrays;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        // ----------------------------------------------
        // Declaración de variables
        // ----------------------------------------------

        // Constantes
        int[] array = new int[10];

        // Variables de entrada

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
        for(int i = 0;i< array.length;i++){
        System.out.println("Elemento " + i + " : " + array[i]);
        }

        // ----------------------------------------------
        // Salida de resultados
        // ----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");

        System.out.println();
        System.out.println("Fin del programa.");
    }

}