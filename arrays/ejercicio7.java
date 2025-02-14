package arrays;
import java.util.Scanner;

public class ejercicio7 {

    public static void main(final String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes


        // Variables de entrada
        String[] array = new String[15];
        
        // Variables de salida
        int cantidadDeA = 0;
        // Variables auxiliares


        // Clase Scanner para petición de datos de entrada
        final Scanner teclado = new Scanner(System.in);
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("PLANTILLA DE PROGRAMA ");
        System.out.println("----------------------");
        System.out.println("Escribe 15 letras ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Letra " + (i + 1) + ":");  
            array[i] = teclado.nextLine();
            if (array[i].contains("a")) { 
                cantidadDeA++;
            }
        }

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.println("Hay un total de " + cantidadDeA + " a");
        System.out.println();
        System.out.println("Fin del programa.");        
    }    
}