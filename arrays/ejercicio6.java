package arrays;
import java.util.Scanner;

public class ejercicio6 {

    public static void main(final String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes


        // Variables de entrada
        final int[] array = new int[20];
        
        // Variables de salida
        int mayoresEdad = 0;
        // Variables auxiliares


        // Clase Scanner para petición de datos de entrada
        final Scanner teclado = new Scanner(System.in);
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("PLANTILLA DE PROGRAMA ");
        System.out.println("----------------------");
        System.out.println("Escribe 20 edades: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Numero " + (i + 1) + ":");  
            array[i] = teclado.nextInt();
            if (array[i] >= 18) {  // Corregido: comprobamos la edad, no el índice
                mayoresEdad++;
            }
        }

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.println("Hay un total de " + mayoresEdad + " personas mayores de edad.");
        System.out.println();
        System.out.println("Fin del programa.");        
    }    
}