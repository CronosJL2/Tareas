package e516;
import java.util.Scanner;
public class ImprimirBarra {
	public void imprimir(int numeroAsteriscos) {
        for (int contador = 1; contador <= numeroAsteriscos; contador++) {
            System.out.print('*');
        }
        System.out.println();
    }

   
    public static void main(String[] args) {
      
        ImprimirBarra barras = new ImprimirBarra();

        try (Scanner entrada = new Scanner(System.in)) {
			int contador = 1;
     
			int numeroAsteriscos = 0;

			do {
			    System.out.print("Deme el primer numero: ");
			    numeroAsteriscos = entrada.nextInt();

			    if (numeroAsteriscos > 0 && numeroAsteriscos < 30) {
			        barras.imprimir(numeroAsteriscos);
			        contador++;
			    } else {
			        System.out.println("Ingrese un numero entre 1 y 30");
			    }
			} while (contador <= 5);
		}

    }
}
