package e914;

public class pruebaempleadobasemascomision914 {
	public static void main(String[] args)
	{
		
    empleadobasemascomision914 empleado1=new empleadobasemascomision914("Jonathan", "Laguna", "032023", 5, 10, 270);
    		
  
        System.out.print("Empleado por comision.\n"
        		+          "Nombre:                    "+empleado1.obtenerPrimerNombre()+"\n"
        				 + "Primer apellido:           "+empleado1.obtenerApellidoPaterno()+"\n"
        				 + "Numero Socuial:            "+empleado1.obtenerNumeroSeguroSocial()+"\n"
                         + "Sueldo Base Mas Comision:  "+empleado1.ingresos());
	
	}
}
