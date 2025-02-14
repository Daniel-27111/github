package ejerciciosExtra;
import java.util.Scanner;
public class do1 {
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes


        // Variables de entrada
        int num;
        int suma = 0;
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
        do {
            System.out.print("Ingrese un número (negativo para salir): ");
            num = teclado.nextInt();
            if (num >= 0) {  
                suma += num;
            }
        } while (num >= 0);

        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println ();
        System.out.println ("RESULTADO");
        System.out.println ("---------");
        System.out.println("La suma total es: " + suma);
        
        
        System.out.println ();
        System.out.println ("Fin del programa.");        
    }    
}