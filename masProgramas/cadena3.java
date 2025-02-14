package ejerciciosExtra;

import java.util.Scanner;

public class cadena3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una matricula espanola (4 digitos + 3 letras): ");
        String matricula = teclado.nextLine();
        int longitud = matricula.length() + 2;

        // Generar las líneas del recuadro
        String lineaSuperior = "+";
        for (int i = 0; i < longitud; i++) {
            lineaSuperior += "-";
        }
        lineaSuperior += "+";

        // Mostrar el resultado
        System.out.println(lineaSuperior);
        System.out.println("| " + matricula + " |");
        System.out.println(lineaSuperior);

        teclado.close();
    }
}