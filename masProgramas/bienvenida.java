package ejerciciosExtra;
import java.util.Scanner;
public class bienvenida {
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes


        // Variables de entrada
        String Nombre;
        int edad;
        // Variables de salida


        // Variables auxiliares


        // Clase Scanner para petición de datos de entrada
        Scanner teclado= new Scanner (System.in);
        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("PLANTILLA DE PROGRAMA ");
        System.out.println("----------------------");
        System.out.println("Escribe tu Nombre ");
        Nombre = teclado.nextLine();
        System.out.println("Escribe tu edad ");
        edad = teclado.nextInt();

        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        

        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println ();
        System.out.println ("RESULTADO");
        System.out.println ("---------");
        
        
        System.out.println ("Hola " + Nombre + " tu edad es de " + edad) ;
        System.out.println ("Fin del programa.");        
    }    
}