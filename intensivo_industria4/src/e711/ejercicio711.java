package e711;

public class ejercicio711 {
	  public static void main(String[] args) {

	    	
	        int[] cuentas = new int[10]; 
	        int[] bono = new int[15]; 
	        int[] mejoresPuntuaciones = {10, 20, 30, 40, 50}; 

	        for(int i = 0; i < 10; i++) {
	            cuentas[i] = 0;
	        }

	        
	        for(int i = 0; i <= 14; i++) {
	            bono[i]++;
	        }

	        
	        
	        for(int i = 0; i < 5; i++) {
	            System.out.printf("%-5d", mejoresPuntuaciones[i]); // Imprime el valor en una columna de ancho 5
	        }

	    }
}
