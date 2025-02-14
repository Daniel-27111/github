package ejerciciosExtra;
import java.util.Scanner;
public class multiplo {
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
        System.out.println("Escribe un numero ");
        num = teclado.nextInt();

        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        if(num % 5 == 0){
            System.out.println("El numero " + num + " es multiplo de 5" );
        }else{
            
            System.out.println("El numero " + num + " no es multiplo de 5" );
        }

        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println ();
        System.out.println ("---------");
        
        
        System.out.println ();
        System.out.println ("Fin del programa.");        
    }    
}