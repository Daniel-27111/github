import java.util.Scanner;
public class letraDNI {
    
    public static void main(String[] args) {
        //Ejercicio 1: Programa que reciba un número de 
        //DNI y calcule su letra (mediante un "super-switch" 
        //con 23 case). Recuerda, la clave está en el módulo 23.
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes


        // Variables de entrada
        
        // Variables de salida
        

        // Variables auxiliares
        char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 
                            'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 
                            'C', 'K', 'E'};
        

        // Clase Scanner para petición de datos de entrada
        Scanner teclado= new Scanner (System.in);
        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("PLANTILLA DE PROGRAMA ");
        System.out.println("----------------------");
        System.out.println("");
        System.out.print("Introduce el numero de tu DNI: ");
        int numeroDNI = teclado.nextInt();
        String cadenaDni =
        Integer.toString(numeroDNI);
        int resto = numeroDNI % 23;
        char letraDNI;

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        switch (resto) {
            case 0: letraDNI= letrasDNI[0]; break;
            case 1: letraDNI = letrasDNI[1]; break;
            case 2: letraDNI = letrasDNI[2]; break;
            case 3: letraDNI = letrasDNI[3]; break;
            case 4: letraDNI = letrasDNI[4]; break;
            case 5: letraDNI = letrasDNI[5]; break;
            case 6: letraDNI = letrasDNI[6]; break;
            case 7: letraDNI = letrasDNI[7]; break;
            case 8: letraDNI = letrasDNI[8]; break;
            case 9: letraDNI = letrasDNI[9]; break;
            case 10: letraDNI = letrasDNI[10]; break;
            case 11: letraDNI = letrasDNI[11]; break;
            case 12: letraDNI = letrasDNI[12]; break;
            case 13: letraDNI = letrasDNI[13]; break;
            case 14: letraDNI = letrasDNI[14]; break;
            case 15: letraDNI = letrasDNI[15]; break;
            case 16: letraDNI = letrasDNI[16]; break;
            case 17: letraDNI = letrasDNI[17]; break;
            case 18: letraDNI = letrasDNI[18]; break;
            case 19: letraDNI = letrasDNI[19]; break;
            case 20: letraDNI = letrasDNI[20]; break;
            case 21: letraDNI = letrasDNI[21]; break;
            case 22: letraDNI = letrasDNI[22]; break;
            default: letraDNI = ' '; 
        }

        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println ();
        System.out.println ("RESULTADO");
        System.out.println ("---------");
        System.out.println("La letra de tu DNI es: " + letraDNI);
        System.out.println("Por tanto tu DNI es: " + cadenaDni + letraDNI);
        
        
        System.out.println ();
        System.out.println ("Fin del programa.");
    }
    
    
}