package ejerciciosExtra;
import java.util.Scanner;
public class cadena2 {
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Variables de entrada
        String nombre;
        String apellido1;
        String apellido2;

        // Variables de salida
        int longitud2;

        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("PLANTILLA DE PROGRAMA ");
        System.out.println("----------------------");
        System.out.println("Introduce tu nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Introduce tu primer apellido: ");
        apellido1 = teclado.nextLine();
        System.out.println("Introduce tu segundo apellido: ");
        apellido2 = teclado.nextLine();

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        longitud2 = apellido2.length();

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.println("D./Dña. " + nombre + " con primer apellido " + apellido1 + 
                           " ha sido seleccionado por tener como segundo apellido " + apellido2 + 
                           ", que tiene " + longitud2 + " letras.");
        System.out.println();
        System.out.println("Fin del programa.");
    }
}   