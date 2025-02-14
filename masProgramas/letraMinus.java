package ejerciciosExtra;
import java.util.Scanner;
public class letraMinus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una letra minuscula: ");
        char letra = scanner.next().charAt(0);

        if (Character.isLowerCase(letra)) {
            char mayuscula = Character.toUpperCase(letra); 
            System.out.println("La letra mayuscula equivalente es: " + mayuscula);
        } else {
            System.out.println(" ingrese una letra minuscula valida.");
        }
        
    }
}