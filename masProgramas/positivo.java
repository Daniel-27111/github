package ejerciciosExtra;
import java.util.Scanner;
public class positivo {
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
        if(num <0){
            System.out.println("Es un numero negativo ");   
        }else if(num > 0){
            System.out.println("Es un numero positivo ");
        }else{
            System.out.println("Es cero");
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