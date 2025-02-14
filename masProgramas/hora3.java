package ejerciciosExtra;
import java.util.Scanner;
public class hora3 {
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
        System.out.print("Ingrese el primer número: ");
        int num1 = teclado.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = teclado.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int num3 = teclado.nextInt();
        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        int mayor, medio, menor;
        
        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
            if (num2 >= num3) {
                medio = num2;
                menor = num3;
            } else {
                medio = num3;
                menor = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
            if (num1 >= num3) {
                medio = num1;
                menor = num3;
            } else {
                medio = num3;
                menor = num1;
            }
        } else {
            mayor = num3;
            if (num1 >= num2) {
                medio = num1;
                menor = num2;
            } else {
                medio = num2;
                menor = num1;
            }
        }
        
        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println ();
        System.out.println ("RESULTADO");
        System.out.println ("---------");
        System.out.println("Números ordenados de mayor a menor: " + mayor + ", " + medio + ", " + menor);
        
    
        System.out.println("Números ordenados de menor a mayor: " + menor + ", " + medio + ", " + mayor);

        
        System.out.println ();
        System.out.println ("Fin del programa.");        
    }    
}