package masEjercicios;
import java.util.Scanner;
public class mayus {
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes


        // Variables de entrada
        String nom;
        
        // Variables de salida


        // Variables auxiliares


        // Clase Scanner para petición de datos de entrada
        Scanner teclado= new Scanner (System.in);
        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("PLANTILLA DE PROGRAMA ");
        System.out.println("----------------------");
        System.out.println("Escribe tu nombre ");
        nom = teclado.nextLine();
        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        String mayus = nom.toUpperCase();

        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println ();
        System.out.println ("RESULTADO");
        System.out.println ("---------");
        
        
        System.out.println ("Tu nombre en mayuscula es " + mayus );
        System.out.println ("Fin del programa.");        
    }    
}