package ejerciciosExtra;
import java.util.Scanner;
public class cadena1 {

 
        public static void main(String[] args) {
    
            //----------------------------------------------
            //          Declaración de variables 
            //----------------------------------------------
    
            // Constantes
    
    
            // Variables de entrada
            String nombre;
            String apellido1;
            String apellido2;
            
            // Variables de salida
    
    
            // Variables auxiliares
    
    
            // Clase Scanner para petición de datos de entrada
            Scanner teclado= new Scanner (System.in);
            
            
            //----------------------------------------------
            //                Entrada de datos 
            //----------------------------------------------
            System.out.println("PLANTILLA DE PROGRAMA ");
            System.out.println("----------------------");
            System.out.println("Introduce tu nombre ");
            nombre=teclado.nextLine();
            System.out.println("Introduce tu apellido ");
            apellido1=teclado.nextLine();
            System.out.println("Introduce tu segundo apellido ");
            apellido2=teclado.nextLine();
            
            //----------------------------------------------
            //                 Procesamiento 
            //----------------------------------------------
            
    
            
            //----------------------------------------------
            //              Salida de resultados 
            //----------------------------------------------
            System.out.println ();
            System.out.println ("RESULTADO");
            System.out.println ("---------");
            
            
            System.out.println ( "Bienvenido Sr./Sra. " +  apellido1 + "  " + apellido2 + "  "  + nombre);
            System.out.println ();
            System.out.println ("Fin del programa.");        
        }    
    }
