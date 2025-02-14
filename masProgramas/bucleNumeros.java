package masEjercicios;

import java.util.Arrays;
import java.util.Scanner;

public class bucleNumeros {
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        int[] numeros = new int[10];

        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("PLANTILLA DE PROGRAMA ");
        System.out.println("----------------------");
        System.out.println();

        for (int i = 0; i < numeros.length; i++) { 
            System.out.print("Ingrese un numero: ");
            int num = teclado.nextInt(); 

            //----------------------------------------------
            //                 Procesamiento 
            //----------------------------------------------
            if (Arrays.stream(numeros, 0, i).anyMatch(x -> x == num)) {
                System.out.println("Numero repetido, ingrese otro.");
                i--; 
            } else {
                numeros[i] = num;
            }
        }

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");

        Arrays.sort(numeros); 
        System.out.println("Numeros ordenados: " + Arrays.toString(numeros));

        System.out.println();
        System.out.println("Fin del programa.");
    }   
}
