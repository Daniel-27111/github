package ejerciciosExtra;
import java.util.Scanner;
public class mayoromenor {
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
        System.out.println(" ");
        System.out.print("Ingrese el primer numero: ");
        int num1 = teclado.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = teclado.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        int num3 = teclado.nextInt();
        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        int mayor = num1;
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }

        int menor = num1;
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }

        int suma = num1 + num2 + num3;
        int producto = num1 * num2 * num3;
        double media = suma / 3.0;

        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println ();
        System.out.println ("RESULTADO");
        System.out.println ("---------");
        
   
        System.out.println("El mayor numero es: " + mayor);
        System.out.println("El menor numero es: " + menor);
        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("El producto de los numeros es: " + producto);
        System.out.printf("La media de los numeros es: %.2f%n", media);

        
        System.out.println ();
        System.out.println ("Fin del programa.");        
    }    
}