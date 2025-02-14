package ejerciciosExtra;
import java.util.Scanner;
public class primos {
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes


        // Variables de entrada
        int num;
        
        // Variables de salida


        // Variables auxiliares


        // Clase Scanner para petición de datos de entrada
        Scanner teclado= new Scanner (System.in);
        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("PLANTILLA DE PROGRAMA ");
        System.out.println("----------------------");
        System.out.println("Introduce un numero ");
        num = teclado.nextInt();
        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        boolean esPrimo = true;
        if (num <= 1) {
            esPrimo = false; 
        } else {
            for (int i = 2; i < num; i++) { 
                if (num % i == 0) {
                    esPrimo = false; 
                    break; 
                }
            }
        }



        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println ();
        System.out.println ("RESULTADO");
        System.out.println ("---------");
        if (esPrimo) {
            System.out.println("El numero " + num + " es primo.");
        } else {
            System.out.println("El numero " + num + " NO es primo.");
        }
        
        System.out.println ();
        System.out.println ("Fin del programa.");        
    }    
}