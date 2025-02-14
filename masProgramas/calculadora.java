package masEjercicios;
import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes


        // Variables de entrada
        int num1;
        int num2;
        int eleccion;
        // Variables de salida
        int resultado = 0;

        // Variables auxiliares


        // Clase Scanner para petición de datos de entrada
        Scanner teclado= new Scanner (System.in);
        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("PLANTILLA DE PROGRAMA ");
        System.out.println("----------------------");
        System.out.println("Escribe un numero ");
        num1 = teclado.nextInt();
        System.out.println("Escribe otro numero ");
        num2 = teclado.nextInt();
        System.out.println("Escoge una operacion, escribe un numero de los mostrados para seleccionar: ");
        System.out.println("1. Suma ");
        System.out.println("2. Resta ");
        System.out.println("3. Multiplicación ");
        System.out.println("4. División ");
        eleccion = teclado.nextInt();
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        switch(eleccion){
            case 1:
            resultado = num1 + num2;
            break;
            case 2:
            resultado = num1 - num2;
            break;
            case 3:
            resultado = num1 * num2;
            break;
            case 4:
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Error: No se puede dividir por cero.");
                return; 
            }
            break;
        default:
            System.out.println("Opción no válida.");
            return; 
        }

        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println ();
        System.out.println ("RESULTADO");
        System.out.println ("---------");
        System.out.println ();
        System.out.println ("El resultado de la operacion es: " + resultado);
        System.out.println ();
        System.out.println ("Fin del programa.");        
    }    
}