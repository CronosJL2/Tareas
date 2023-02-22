package e313;

public class Empleado {
	 
    private String nombre; 
    private String apellido; 
    private double salarioMensual; 
   
    public Empleado( String pNombre , String pApellido , double pSalarioMensual )
    {
        nombre = pNombre;
        apellido = pApellido;
		if( pSalarioMensual > 0.0)
        {
            salarioMensual = pSalarioMensual;
        }
    } 

    public void establecerNombre( String pNombre )
    {
        nombre = pNombre;
    }
   
    public String obtenerNombre()
    {
        return nombre;
    }
   
    public void establecerApellido( String pApellido )
    {
        apellido = pApellido;
    }
   
    public String obtenerApellido()
    {
        return apellido;
    }

    public void establecerSalarioMensual( double salario )
    {
        if( salario < 0.0 )
        {
            System.out.print( "\nEl salario escrito no es válido." );
            return;
        }
        salarioMensual = salario;
    }
   
    public double obtenerSalarioMensual()
    {
        return salarioMensual;
    }

    public double obtenerSalarioAnual()
    {
        return obtenerSalarioMensual() * 12;
    }

    public double obtenerAumento()
    {
        return obtenerSalarioAnual() * 1.10;
    }

    public void mostrarResumen()
    {
        System.out.printf( "\nSu nombre es: %s" , obtenerNombre() );
        System.out.printf( "\nSu apellido es: %s" , obtenerApellido() );
        System.out.printf( "\nSu salario mensual es: %f" , obtenerSalarioMensual() );
        System.out.printf( "\nSu salario anual sin incremento es: %f" , obtenerSalarioAnual() );
        System.out.printf( "\nSu salario anual con incremento es: %f" , obtenerAumento() );
    } 
}
