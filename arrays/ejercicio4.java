package arrays;
import java.util.Scanner;
public class ejercicio4 {

    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes


        // Variables de entrada
        int[] array = new int[20];
        
        // Variables de salida
        int contadoSiete = 0;
        int menorSiete = 0;
        int mayorSiete = 0;
        // Variables auxiliares


        // Clase Scanner para petición de datos de entrada
        Scanner teclado= new Scanner (System.in);
        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("PLANTILLA DE PROGRAMA ");
        System.out.println("----------------------");
        System.out.println("Escribe 20 numeros: ");
        for(int i = 0;i<array.length;i++){
            System.out.println("Numero " + (i+1) + ":");  
            array[i]=teclado.nextInt();
            if(i==7){
                contadoSiete++;
            }else if(i< 7){
              menorSiete++;
            }else{
                mayorSiete++;
            }
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
        System.out.println ("Hay un total de " + contadoSiete + " de sietes.");
        System.out.println ("Hay " + menorSiete + " numeros menores de siete");
        System.out.println ("Hay " + mayorSiete + " numeros mayores de siete");
        System.out.println ();
        System.out.println ("Fin del programa.");        
    }    
}
