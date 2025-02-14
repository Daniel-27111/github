package ejerciciosExtra;
import java.util.Scanner;
public class comprobarLetra {
    public static void main(String[] args) {

        // Declaración de variables
        String caracter;

        // Scanner para entrada de datos
        Scanner teclado = new Scanner(System.in);

        // Entrada de datos
        System.out.println("Introduce un carácter: ");
        caracter = teclado.next();

        // Procesamiento y salida
        System.out.println("\nRESULTADO");
        System.out.println("---------");

        if ( Character.isLetter(caracter.charAt(0))) {
            System.out.println("El carácter ingresado es una letra.");
        } else {
            System.out.println("El carácter ingresado NO es una letra.");
        }

    }    
}