package ejerciciosExtra;
import java.util.Scanner;
public class fecha {
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes


        // Variables de entrada
        
        
        // Variables de salida


        // Variables auxiliares


        // Clase Scanner para petición de datos de entrada
        Scanner teclado= new Scanner (System.in);
        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("PLANTILLA DE PROGRAMA ");
        System.out.println("----------------------");
        System.out.println(" ");
        System.out.print("Ingrese el día: ");
        int dia = teclado.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = teclado.nextInt();
        System.out.print("Ingrese el año: ");
        int anio = teclado.nextInt();
        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);

        int diasDelMes;
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                diasDelMes = 31;
                break;
            case 4: case 6: case 9: case 11:
                diasDelMes = 30;
                break;
            case 2:
                diasDelMes = esBisiesto ? 29 : 28;
                break;
            default:
                diasDelMes = 0; 
        }

        boolean fechaValida = (mes >= 1 && mes <= 12) && (dia >= 1 && dia <= diasDelMes);


        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println ();
        System.out.println ("RESULTADO");
        System.out.println ("---------");
        if (fechaValida) {
            System.out.println("La fecha ingresada es valida.");
        } else {
            System.out.println("La fecha ingresada no es valida.");
        }

        
        System.out.println ();
        System.out.println ("Fin del programa.");        
    }    
}