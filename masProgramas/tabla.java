package ejerciciosExtra;
import java.util.Scanner;
public class tabla {
 
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
            System.out.println("Escribe un numero");
            num= teclado.nextInt();
            
            //----------------------------------------------
            //                 Procesamiento 
            //----------------------------------------------
            for(int i=1;i<11;i++){
                System.out.println (num+" x "+i+" = "+i*num);  
            }
           

            
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