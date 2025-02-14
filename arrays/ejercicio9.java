package arrays;
import java.util.Scanner;
import java.util.Random;
public class ejercicio9 {
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes
        Random aleatorio= new Random();

        // Variables de entrada
        int[] conteo = new int[6];
        
        // Variables de salida


        // Variables auxiliares


        // Clase Scanner para petición de datos de entrada
        Scanner teclado= new Scanner (System.in);
        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("PLANTILLA DE PROGRAMA ");
        System.out.println("----------------------");
        System.out.println(" ");
        for (int i = 0; i < 30; i++) {
            int lanzamiento = aleatorio.nextInt(6) + 1;
            System.out.println("Lanzamiento " + (i + 1) + ": " + lanzamiento);
        }
        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        

        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println ();
        System.out.println ("RESULTADO");
        System.out.println ("---------");
        
        
        System.out.println ();
        System.out.println ("Fin del programa.");        
    }    
}