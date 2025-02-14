package ejerciciosExtra;

import java.util.Scanner;

public class comprobarDigito {
    public static void main(String[] args) {

        // ----------------------------------------------
        // Declaración de variables
        // ----------------------------------------------

        // Variables de entrada
        char caracter;

        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);

        // ----------------------------------------------
        // Entrada de datos
        // ----------------------------------------------
        System.out.println("PLANTILLA DE PROGRAMA ");
        System.out.println("----------------------");
        System.out.print("Introduce un caracter: ");
        caracter = teclado.next().charAt(0);

        // ----------------------------------------------
        // Salida de resultados
        // ----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");
        if (Character.isDigit(caracter)) {
            System.out.println("El carácter ingresado es un dígito.");
        } else {
            System.out.println("El carácter ingresado NO es un dígito.");
        }

        System.out.println();
        System.out.println("Fin del programa.");

        // Cerrar Scanner
        teclado.close();
    }
}
