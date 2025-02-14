package ejerciciosExtra;
import java.util.Scanner;

public class letra {

    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes


        // Variables de entrada
        
        
        // Variables de salida


        // Variables auxiliares


        // Clase Scanner para petición de datos de entrada
        Scanner teclado= new Scanner (System.in);
        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("PLANTILLA DE PROGRAMA ");
        System.out.println("----------------------");
        System.out.println("Introduce un ano ");
        System.out.print("Ingrese una letra: ");
        char letra = teclado.next().charAt(0);

       
          

        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------

         if (Character.isLetter(letra)) {
            char anterior1 = (char) (letra - 1);
            char anterior2 = (char) (letra - 2);
            char posterior1 = (char) (letra + 1);
            char posterior2 = (char) (letra + 2);


        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println ();
        System.out.println ("RESULTADO");
        System.out.println ("---------");

          System.out.println("Letras anteriores: " + anterior2 + " " + anterior1);
          System.out.println("Letras posteriores: " + posterior1 + " " + posterior2);
      } else {
          System.out.println("Debe ingresar una letra.");
      }
        
        System.out.println ();
        System.out.println ("Fin del programa.");        
    }    
}