package ejerciciosExtra;
import java.util.Scanner;
public class cadena8 {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
    
            // Solicitar la matrícula
            System.out.println("Introduce una matricula espanola (4 digitos + 3 letras): ");
            String matricula = teclado.nextLine();
    
            // Invertir la matrícula
            String matriculaInvertida = new StringBuilder(matricula).reverse().toString();
    
            // Mostrar la matrícula invertida
            System.out.println("Matricula invertida: " + matriculaInvertida);
    
            teclado.close();
        }
    }
