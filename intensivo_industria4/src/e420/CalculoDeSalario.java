package e420;
import java.util.Scanner;

public class CalculoDeSalario {
	  public static void main(String[] args) {
	        int empleados = 0;
	        int contador = 1;
	        
	        try (Scanner entrada = new Scanner(System.in)) {
				System.out.println("Ingrese la cantidad de empleados a calcular su salario");
				empleados = entrada.nextInt();
				
				while (contador <= empleados) {            
				    double horas = 0;
				    double salarioPorHora = 0;
				    double salarioTotal = 0;
				    
				    System.out.println("Ingrese las horas trabajadas por el empleado #" + contador);
				    horas = entrada.nextDouble();
				    
				    System.out.println("Ingrese el salario por hora del empleado #" + contador);
				    salarioPorHora = entrada.nextDouble();
				    
				    if (horas > 40) {
				        double horasExtras = 0;
				        double pagoExtra = 0;
				        horasExtras = horas - 40;
				        pagoExtra = (salarioPorHora * 1.5) * horasExtras;
				        salarioTotal = (40 * salarioPorHora) + pagoExtra;
				        System.out.println("El empleado #" + contador + " trabajo un total de " + horas + " hrs. con un pago de $" + salarioPorHora + " por hora, de manera que trabajo " + horasExtras + " hrs. extra y su salario debe ser de: $" + salarioTotal);
				    } else {
				        salarioTotal = 40 * salarioPorHora;
				        System.out.println("El empleado #" + contador + " trabajo un total de " + horas + " hrs. con un pago de $" + salarioPorHora + " por hora, de manera que su salario es: $" + salarioTotal);
				    }
				    
				    contador++;
				}
			}
	    }
}
