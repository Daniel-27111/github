package ejerciciosExtra;
import java.util.Scanner;
public class cadena7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Introduce un nombre: ");
        String nombre = teclado.nextLine();

        int longitud = nombre.length();
        char penultimaLetra = nombre.charAt(longitud - 2);
        char ultimaLetra = nombre.charAt(longitud - 1);

        System.out.println("Las dos últimas letras son: '" + penultimaLetra + "' y '" + ultimaLetra + "'");

}
}