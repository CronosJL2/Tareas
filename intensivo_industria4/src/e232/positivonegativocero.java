package e232;
import java.util.Scanner;
public class positivonegativocero {
public static void main(String[]args) {
	Scanner entrada = new Scanner(System.in);
	int numero,contador=0,positivos=0,negativos=0,ceros=0;
	while(contador<5) {
		System.out.println("Ingresa un numero entero");
		numero=entrada.nextInt();
		if(numero<0) {
			negativos+=1;
		}
		if(numero==0) {
			ceros+=1;
		}
		if(numero>0) {
			positivos+=1;
		}
		contador +=1;
	}
	System.out.println("La cantidad de postivos ingresados es: "+positivos);
	System.out.println("La cantidad de negativos ingresados es: "+negativos);
	System.out.println("La cantidad de ceros ingresados es: "+ceros);
	entrada.close();
}
}
