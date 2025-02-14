package masEjercicios;

import java.util.Arrays;
import java.util.Scanner;

public class palabras {
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Array para almacenar las palabras
        String[] palabras = new String[10];

        // Scanner para entrada de datos
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("PLANTILLA DE PROGRAMA ");
        System.out.println("----------------------");
        System.out.println();

        for (int i = 0; i < palabras.length; i++) { 
            System.out.print("Ingrese una palabra: ");
            String pal = teclado.nextLine(); 

       
            if (Arrays.stream(palabras, 0, i).anyMatch(x -> x != null && x.equals(pal))) {
                System.out.println("Palabra repetida, ingrese otra.");
                i--; 
            } else {
                palabras[i] = pal; 
            }
        }
        Arrays.sort(palabras);

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");

        for (String palabra : palabras) {
            System.out.println(palabra);
        }
      

        System.out.println();
        System.out.println("Fin del programa.");

   
    }    
}
