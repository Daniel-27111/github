package ejerciciosExtra;
import java.util.Scanner;
public class while1 {
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes


        // Variables de entrada
        int suma = 0;
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
        System.out.println(" ");
        while (true) {
            System.out.print("Ingrese un número (negativo para salir): ");
            num = teclado.nextInt();
            
            if (num < 0) {
                break;
            }
            
            suma += num;
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
        
        System.out.println("La suma total es: " + suma);
        
        System.out.println ();
        System.out.println ("Fin del programa.");        
    }    
}