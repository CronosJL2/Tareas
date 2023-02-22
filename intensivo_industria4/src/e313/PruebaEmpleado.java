package e313;
import java.util.Scanner;
public class PruebaEmpleado {
	   
    public static void main( String args[] )
    {
        String nombre;
        String apellido;
        double salario;
       
        
        Empleado empleado1 = new Empleado( "a" , "a" ,800);
        Empleado empleado2 = new Empleado(" ", "b" ,-900);
       
        try (Scanner entrada = new Scanner( System.in )) {
			System.out.print( "\nSolicitud y recepción de los datos del empleado 1" );

			System.out.print( "\nEscriba su nombre: " );
			nombre = entrada.nextLine();
			empleado1.establecerNombre( nombre );
 
			System.out.print( "\nEscriba su apellido: " );
			apellido = entrada.nextLine();
			empleado1.establecerApellido( apellido );
 
			System.out.print( "\nEscriba su salario mensual: " );
			salario = entrada.nextDouble();
			empleado1.establecerSalarioMensual( salario );

			System.out.print( "\nResumen para empleado 1: " );
			empleado1.mostrarResumen();
			nombre = entrada.nextLine();
			
			System.out.println( "\n\nSolicitud y recepción de los datos del empleado 2" );
			empleado2.establecerNombre( nombre );
			System.out.print( "\nEscriba su nombre: " );
			nombre = entrada.nextLine();
			empleado2.establecerNombre( nombre );
			System.out.print( "\nEscriba su apellido: " );
			apellido = entrada.nextLine();
			empleado2.establecerApellido( apellido );

			System.out.print( "\nEscriba su salario mensual: " );
			salario = entrada.nextDouble();
			 
	        empleado2.establecerSalarioMensual( salario );
	        System.out.print( "\nResumen para empleado2: " );
	        empleado2.mostrarResumen();
		}
      

    
       
        System.out.println();
}
}