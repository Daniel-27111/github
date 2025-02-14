import java.util.Scanner;

public class cadenaCaracter {
    
	public static void main(String[] args) {
    	//
    	//----------------------------------------------
    	//      	Declaración de variables
    	//----------------------------------------------

    	// Constantes


    	// Variables de entrada
   	 
                   	 
    	// Variables de salida
   	 

    	// Variables auxiliares
    	String cadena ;
   	 
    	// Clase Scanner para petición de datos de entrada
    	Scanner teclado= new Scanner (System.in);
   	 
   	 
    	//----------------------------------------------
    	//            	Entrada de datos
    	//----------------------------------------------
    	System.out.println("PLANTILLA DE PROGRAMA ");
    	System.out.println("----------------------");
    	System.out.println("");
    	System.out.print("Introduce una cadena de caracteres ");
    	cadena=teclado.nextLine();
             	 
    	//----------------------------------------------
    	//             	Procesamiento
    	//----------------------------------------------
  	 

   	 
    	//----------------------------------------------
    	//          	Salida de resultados
    	//----------------------------------------------
    	System.out.println ();
    	System.out.println ("RESULTADO");
    	System.out.println ("---------");
    	System.out.println();
     	 
    	for(int i=cadena.length() -1;i>=0;i--){
          	System.out.print(cadena.charAt(i));
    	}
    
    	System.out.println ();
    	System.out.println ("Fin del programa.");
	}
    
    
}