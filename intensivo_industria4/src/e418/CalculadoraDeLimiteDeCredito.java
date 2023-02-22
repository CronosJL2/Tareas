package e418;
import java.util.Scanner;
public class CalculadoraDeLimiteDeCredito {
	  public static void main(String[] args) {
	        int numcuen = 0;
	        int saldi = 0;
	        int cargos = 0;
	        int pagos = 0;
	        int lim = 0;
	        int saldo = 0;
	        char centinela = 's';
	        
	        try (Scanner entrada = new Scanner(System.in)) {
				while(centinela == 's'){
				    System.out.println("Ingrese el numero de cuenta: ");
				    numcuen = entrada.nextInt();
				    
				    System.out.println("Ingrese el saldo inicial del mes: ");
				    saldi = entrada.nextInt();
				    
				    System.out.println("Ingrese los cargos del mes: ");
				    cargos = entrada.nextInt();
				    
				    System.out.println("Ingrese los pagos realizados del mes: ");
				    pagos = entrada.nextInt();
				    
				    System.out.println("Ingrese el limite de credito de la cuenta: ");
				    lim = entrada.nextInt();
				    
				    saldo = saldi + cargos - pagos;
				    
				    if (saldo <= lim) {
				        System.out.println("El saldo actual de la cuenta " + numcuen + " es de: " + saldo);
				    } else {
				        System.out.println("El saldo actual de la cuenta " + numcuen + " es de: " + saldo);
				        System.out.println("Se excedio el limite de su credito");
				    } 
				    
				    System.out.println("¿Dese ingresar otra cuenta? s/n");
				    centinela = entrada.next().charAt(0);
				}
			}
	    }
}
