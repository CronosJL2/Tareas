package e438;
import java.util.Scanner;
//Programa descifrador
public class Cripto2 {
	 public static void main(String[] args) {
	        System.out.println("Programa descifrador ");
	        
	        try (Scanner entrada = new Scanner(System.in)) {
				int num;
				int v1;
				int v2;
				int v3;
				int v4;
			
				
				System.out.print("Ingrese el entero de 4 digitos a descifrar: ");
				num = entrada.nextInt();
				
				if(num > 999 && num <10000){
				    v3 = num % 10;
				    num /= 10;
				    v4 = num % 10;
				    num /= 10;
				    v1 = num % 10;
				    num /= 10;
				    v2 = num % 10;
				    
				    v1 += 3;
				    v2 += 3;
				    v3 += 3;
				    v4 += 3;
				    
				    v1 %= 10;
				    v2 %= 10;
				    v3 %= 10;
				    v4 %= 10;
				    
				    System.out.println("Salida: " + v4 + v3 + v2 + v1);
				}
			}
	        
	    }
}
