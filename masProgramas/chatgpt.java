package ejerciciosExtra;
import java.util.Scanner;
public class chatgpt {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[50000];
        int mayor, menor, suma = 0;
        long tiempoEnMilisegundos = System.currentTimeMillis();
        // Entrada de datos
        System.out.println("Ingrese 5 números:");

        for (int i = 0; i < 50000; i++) {
            //System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = (int) (Math.random() * 51);//teclado.nextInt();
            suma += numeros[i];
        }

        // Inicializamos mayor y menor con el primer número ingresado
        mayor = menor = numeros[0];

        // Procesamiento: encontrar el mayor y menor
        for (int i = 1; i < 5; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Cálculo del promedio
        double promedio = (double) suma / 5;

        // Salida de resultados
        System.out.println("\nRESULTADOS:");
        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);
        System.out.printf("Promedio: %.2f\n", promedio);

        teclado.close(); // Cerrar Scanner
        long tiempo = System.currentTimeMillis()-tiempoEnMilisegundos;
        System.out.println("tiempo transcurrido: " + tiempo);
    }
}