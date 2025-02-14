package masEjercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ListaOrdenada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] valores = new String[5];

        System.out.println("Ingrese 5 valores (pueden ser números o palabras):");

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Ingrese un valor: ");
            String valor = teclado.nextLine();

            if (Arrays.stream(valores, 0, i).anyMatch(x -> x != null && x.equals(valor))) {
                System.out.println("Valor repetido, ingrese otro.");
                i--;
            } else {
                valores[i] = valor;
            }
        }

        boolean todosNumeros = Arrays.stream(valores).allMatch(ListaOrdenada::esNumero);

        if (todosNumeros) {
            int[] numeros = Arrays.stream(valores).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(numeros);
            valores = Arrays.stream(numeros).mapToObj(String::valueOf).toArray(String[]::new);
        } else {
            Arrays.sort(valores);
        }
        System.out.println("\nValores ordenados:");
        for (String valor : valores) {
            System.out.println(valor);
        }

        System.out.println("\nFin del programa.");
        teclado.close();
    }

    private static boolean esNumero(String str) {
        return str.matches("-?\\d+");
    }
}
