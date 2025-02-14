package ejerciciosExtra;
import java.util.Scanner;
public class numerosOrden {
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes


        // Variables de entrada
        int[] numero = new int[50000];
        long tiempoEnMilisegundos = System.currentTimeMillis();
        // Variables de salida
        int numMayor = 0;
        int numMenor = 0;
        int promedio= 0;
        int suma = 0;
        // Variables auxiliares


        // Clase Scanner para petición de datos de entrada
        Scanner teclado= new Scanner (System.in);
        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("PLANTILLA DE PROGRAMA ");
        System.out.println("----------------------");
        for(int i = 0;i<50000;i++){    
       // System.out.println("Introduce un numero ");
        //numero[i] = teclado.nextInt();
        numero[i] = (int) (Math.random() * 51);
        suma = suma +  numero[i];
        if(i == 0){
            numMayor = numero[i];
            numMenor = numero[i];
        }
        if(numMayor<numero[i]){
            numMayor= numero[i];


        }
        if (numMenor>numero[i]){
            numMenor= numero[i];
        }
        }
            
       
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        
        promedio = suma / 5;
        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println ();
        System.out.println ("RESULTADO");
        System.out.println ("---------");
        
        
        System.out.println ("Mayor " + numMayor);
        
        System.out.println ("Menor " + numMenor);
        
        System.out.println ("Promedio " + promedio);
        System.out.println ("Fin del programa.");       
        long tiempo = System.currentTimeMillis()-tiempoEnMilisegundos;
        System.out.println("tiempo transcurrido: " + tiempo); 
    }    
}