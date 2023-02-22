package e314;

public class Fecha {
	
	   
	    private int dia; 
	    private int mes; 
	    private int annio; 
	   
	   
	    public Fecha( int pMes , int pDia , int pAnnio )
	    {
	        
	        if( pMes > 0 )
	        {
	            if( pMes <= 12 )
	            {
	                mes = pMes;
	            }
	        }
     
	        if( pDia > 0 )
	        {
	            if( pDia <= 31 )
	            {
	                dia = pDia;
	            }
	        }
	       
	        
	        if( pAnnio >= 1929 )
	        {
	            if( pAnnio <= 2029 )
	            {
	                annio = pAnnio;
	            }
	        }
	    } 
    
	    public void establecerMes( int pMes )
	    {
	        if( pMes > 0 )
	        {
	            if( pMes <=31 )
	            {
	                mes = pMes;
	            }
	        }
	    }

	    public int obtenerMes()
	    {
	        return mes;
	    }

	    public void establecerDia( int pDia )
	    {
	        if( pDia > 0)
	        {
	            if( pDia <= 31 )
	            {
	                dia = pDia;
	            }
	        }
	    }

	    public int obtenerDia()
	    {
	        return dia;
	    }

	    public void establecerAnnio( int pAnnio )
	    {
	        if( pAnnio >= 1929 )
	        {
	            if ( pAnnio <= 2029 )
	            {
	                annio = pAnnio;
	            }
	        }
	    }

	    public int obtenerAnnio()
	    {
	        return annio;
	    }
	    public void mostrarFecha()
	    {
	        System.out.print( "\nFecha seleccionada: " );
	        System.out.printf( "\n %d / %d / %d " , obtenerMes() , obtenerDia() , obtenerAnnio() );
	    } 
}
