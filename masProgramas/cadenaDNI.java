import java.util.Scanner;

public class cadenaDNI {
    
    public static void main(String[] args) {
        //
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes


        // Variables de entrada
        
                        
        // Variables de salida
        

        // Variables auxiliares
        String letrasDNI ="TRWAGMYFPDXBNJZSQVHLCKE" ;
        
        // Clase Scanner para petición de datos de entrada
        Scanner teclado= new Scanner (System.in);
        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("PLANTILLA DE PROGRAMA ");
        System.out.println("----------------------");
        System.out.println("");
        System.out.print("Introduce el numero de tu DNI: ");
        int numeroDni=teclado.nextInt();
        int resto = numeroDni % 23;                 
        char charletra= letrasDNI.charAt(resto);
        String letra = Character.toString(charletra);
        String numero = Integer.toString(numeroDni);               
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
         
        

        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println ();
        System.out.println ("RESULTADO");
        System.out.println ("---------");
        System.out.println("Tu DNI es: " + numero + letra);
        System.out.println();
        
        
        System.out.println ();
        System.out.println ("Fin del programa.");
    }
    
    
}