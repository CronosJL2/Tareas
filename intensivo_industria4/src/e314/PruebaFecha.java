package e314;
import java.util.Scanner;

public class PruebaFecha {
    public static void main( String args[] )
    {
        
        int dia; 
        int mes; 
        int annio;
       
        Fecha fecha = new Fecha( 2 , 21 , 2023 );
       
        
        fecha.mostrarFecha();
       
        try (Scanner entrada = new Scanner( System.in )) {
			System.out.print( "\nEscriba el número del mes: " );
			mes = entrada.nextInt();
			fecha.establecerMes( mes );
      
			
			System.out.print( "\nEscriba el número del día: " );
			dia = entrada.nextInt();
			fecha.establecerDia( dia );
      
		
			System.out.print( "\nEscriba el año: " );
			annio = entrada.nextInt();
		}
       
        
        fecha.establecerAnnio( annio );
       
       
        fecha.mostrarFecha();
       
        System.out.println();
        System.out.println();
    }
}
