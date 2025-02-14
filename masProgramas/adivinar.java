package masEjercicios;
import java.util.Scanner;
import java.util.Random;
public class adivinar {
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes


        // Variables de entrada
        Random rand = new Random();  
        int numeroSecreto = rand.nextInt(11) + 10;
        int intento;
        
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

        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        System.out.println("¡Adivina el numero secreto entre 10 y 20!");

        do {
            System.out.print("Ingresa tu intento: ");
            intento = teclado.nextInt();
            if(intento < 10){
             System.out.println("Rango no válido, el numero debe ser entre 10 y 20. Intenta de nuevo.");
            
            }else if (intento < numeroSecreto) {
                System.out.println("Demasiado bajo. Intenta de nuevo.");
            } else if (intento > numeroSecreto) {
                System.out.println("Demasiado alto. Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el numero.");
            }
        } while (intento != numeroSecreto);


        
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