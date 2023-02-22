package e421;
import java.util.Scanner;

public class EncontrarNumeroMasGrande {
	 public static void main(String[] args) {
	        int contador = 1;
	        int numero = 0;
	        int mayor = 0;
	        int temp = 0;
	        
	        try (Scanner entrada = new Scanner(System.in)) {
				while(contador <= 10){
				    System.out.println("Ingrese un numero entero:");
				    numero = entrada.nextInt();
				    
				    if (numero > temp) {
				        if (numero > mayor) {
				            mayor = numero;
				            temp = numero;
				        } else {
				            temp = numero;
				        }
				    } else {
				        temp = numero;
				    }
				    contador++;
				}
			}
	        
	        System.out.println("El numero mas grande es: " + mayor);
	    }
}
