package e915;

public class pruebaempleadoporhoras {
public static void main(String[] args) {
		
		empleadoporhoras915 empleado1=new empleadoporhoras915("Samuel", "Novelo", "032023", 110, 45);
		
		
		System.out.print("Empleado por comision.\n"
        		+          "Nombre:                    "+empleado1.obtenerPrimerNombre()+"\n"
        				 + "Primer apellido:           "+empleado1.obtenerApellidoPaterno()+"\n"
        				 + "Numero Socuial:            "+empleado1.obtenerNumeroSeguroSocial()+"\n"
                         + "Sueldo Por Hora:           "+empleado1.obtenerSueldo()+"\n"
                         + "Horas Trabajadas:          "+empleado1.obtenerHoras()+"\n"
                         + "Sueldo Total:              "+empleado1.ingresos());
		
		empleado1.establecerHoras(85); 
		empleado1.establecerSueldo(599);
		System.out.printf("%n%s:%n%n%s%n", "Información actualizada del empleado obtenida por toString", empleado1.toString());
		System.out.printf("Los ingresos son: $%,.2f%n", empleado1.ingresos());

	}
}
