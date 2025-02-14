package arrays;
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes
         

        // Variables de entrada
        int[] array = new int[8];
        
        // Variables de salida


        // Variables auxiliares


        // Clase Scanner para petición de datos de entrada
        Scanner teclado= new Scanner (System.in);
        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("PLANTILLA DE PROGRAMA ");
        System.out.println("----------------------");
        System.out.println("Introduce 8 numeros");
        for(int i = 0;i<array.length;i++){
        System.out.println("Numero " + (i+1) + ":");  
        array[i]=teclado.nextInt();
        }

        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        System.out.println("\nLos numeros almacenados son");
         for(int numero : array){
            System.out.println(numero);
        }

        
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