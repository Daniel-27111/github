package ejerciciosExtra;
import java.util.Scanner;
public class hora2 {

    
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes


        // Variables de entrada
        int horas;
        int minutos;
        int segundos;
        
        // Variables de salida


        // Variables auxiliares


        // Clase Scanner para petición de datos de entrada
        Scanner teclado= new Scanner (System.in);
        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("PLANTILLA DE PROGRAMA ");
        System.out.println("----------------------");
        System.out.println("Introduce la hora ");
        horas=teclado.nextInt();
        System.out.println("Introduce los minutos");
        minutos=teclado.nextInt();
        System.out.println("Introduce los segundos ");
        segundos=teclado.nextInt();
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        boolean horaValida = (horas >= 0 && horas <= 23) &&
                     (minutos >= 0 && minutos <= 59) &&
                     (segundos >= 0 && segundos <= 59);

        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println ();
        System.out.println ("RESULTADO");
        System.out.println ("---------");
        if (horaValida) { 
            segundos++;

            if (segundos == 60) {
                segundos = 0;
                minutos++;

                if (minutos == 60) {
                    minutos = 0;
                    horas++;

                    if (horas == 24) {
                        horas = 0;
                    }
                }
            }


            System.out.printf("El siguiente segundo es: %02d:%02d:%02d\n", horas, minutos, segundos);
        } else {
            System.out.println("La hora ingresada NO es valida.");
        }
        
        System.out.println ();
        System.out.println ("Fin del programa.");        
    }    
}