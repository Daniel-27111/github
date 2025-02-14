package ejerciciosExtra;

import java.util.Scanner;

public class letraMayus_asc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una letra minuscula: ");
        char letra = scanner.next().charAt(0);
        long tiempo=System.currentTimeMillis();
for(int i = 1;i<1000000;i++){
        if ((int) letra > 96) {

            char j= (char) ((int) letra - 32);
        } else {
            //System.out.println("ingrese una letra minuscula válida.");
        }
    }
    System.out.println("Tiempo transcurrido = " + (System.currentTimeMillis() - tiempo));

    }
}