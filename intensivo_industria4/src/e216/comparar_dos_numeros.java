package e216;
import java.util.Scanner;

public class comparar_dos_numeros {
public static void main(String[]atgs){
	int a;
	int b;
	System.out.println("Compararemos 2 números\nEscribe el primer número:");
	try (Scanner entrada = new Scanner(System.in)) {
		a=entrada.nextInt();
		System.out.println("\nEscribe el segundo número:\n");
		b=entrada.nextInt();
	
	if(a<b) {
		System.out.println("\nEl segundo número es más grande");
	}
	if(b<a) {
		System.out.println("\nEl primer número es más grande");
	}
	if(a==b) {
		System.out.println("Los dos números son iguales");
	}
	}
}
}
