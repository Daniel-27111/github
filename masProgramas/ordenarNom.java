package masEjercicios;
import java.util.Scanner;
import java.util.Arrays;
public class ordenarNom {
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes
        String[] nombres = new String[5];

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
        System.out.println(" ");
        System.out.println("Ingrese 5 nombres:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese un nombre: ");
            String nombre = teclado.nextLine();
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        
        if (Arrays.stream(nombres, 0, i).anyMatch(x -> x != null && x.equals(nombre))) {
            System.out.println("Palabra repetida, ingrese otra.");
            i--; 
        } else {
            nombres[i] = nombre; 
        }
    }
    Arrays.sort(nombres);

        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println ();
        System.out.println ("RESULTADO");
        System.out.println ("---------");
        
        for (String nom : nombres) {
            System.out.println(nom);
        }
      
        System.out.println ();
        System.out.println ("Fin del programa.");        
    }    
}