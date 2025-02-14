package arrays;
import java.util.Scanner;
public class ejercicio5 {

    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes


        // Variables de entrada
        int[] array = new int[9];
        
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
        System.out.println("Escribe 9 numeros: ");
        for(int i = 0;i<array.length;i++){
            System.out.println("Numero " + (i+1) + ":");  
            array[i]=teclado.nextInt();
   
        }
        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        for(int i = 0; i< array.length; i++){
            array[i]*=2;
        }

        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println ();
        System.out.println ("RESULTADO");
        System.out.println ("\nArray multiplicado x2");
        for(int i = 0; i< array.length;i++){
            System.out.println ("numero " + (i+1) + ": " + array[i]);
        }
        
        
        System.out.println ("Fin del programa.");        
    }    
}