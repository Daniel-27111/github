import java.util.Scanner;

public class cadenaDoble {
    
    public static void main(String[] args) {
        //
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes


        // Variables de entrada
        
                        
        // Variables de salida
        

        // Variables auxiliares
        String cadena1;
        String cadena2;
        String cadenaGrande;
        // Clase Scanner para petición de datos de entrada
        Scanner teclado= new Scanner (System.in);
        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("PLANTILLA DE PROGRAMA ");
        System.out.println("----------------------");
        System.out.println("");
        System.out.print("Introduce una cadena de caracteres ");
        cadena1=teclado.nextLine();
        System.out.print("Introduce otra cadena de caracteres ");
        cadena2=teclado.nextLine();          
        //----------------------------------------------
        //                 Procesamiento 
        //---------------------------------------------
        StringBuilder resultado = new StringBuilder();
        int longitudMinima = Math.min(cadena1.length(), cadena2.length());
        if(longitudMinima==cadena1.length()){
             cadenaGrande=cadena2;
        }
        else{
              cadenaGrande=cadena1;
        }
        for(int i=0;i<longitudMinima;i++) {
            resultado.append(cadena1.charAt(i));
            resultado.append(cadena2.charAt(i));
        }
        
        for(int i=longitudMinima;i<cadenaGrande.length();i++) {
            resultado.append(cadenaGrande.charAt(i));
            
        }
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println ();
        System.out.println ("RESULTADO");
        System.out.println ("---------");
        System.out.println(resultado);
      
        System.out.println ();
        System.out.println ("Fin del programa.");
    }
    
    
}