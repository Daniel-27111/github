package ejerciciosExtra;

import java.util.Scanner;

public class MatrizNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[10][2];
        int suma = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        
        // Introducir los 20 números en la matriz
        System.out.println("Introduce 20 números:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Número en posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                suma += matriz[i][j];
                
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                }
                if (matriz[i][j] < min) {
                    min = matriz[i][j];
                }
            }
        }
        scanner.close();
        
        // Calcular la media
        double media = suma / 20.0;
        
        // Mostrar resultados
        System.out.println("\nLa media de los números es: " + media);
        System.out.println("La diferencia entre el mayor y el menor número es: " + (max - min));
    }
}
