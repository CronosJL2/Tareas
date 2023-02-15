package e217;
import java.util.Scanner;

public class solicitar_3_numeros {
	public static void main(String[]atgs){
		int a;
		int b;
		int c;

		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("\nEscribe primer número:\n");
			a=entrada.nextInt();
			System.out.println("\nEscribe el segundo número:\n");
			b=entrada.nextInt();
			System.out.println("\nEscribe el tercer número:\n");
			c=entrada.nextInt();
		int suma=a+b+c;
		int promedio=(a+b+c)/3;
		int producto=a*b*c;
		System.out.println("\nLa suma de estos numeros es:"+suma+"\nEl promedio de estos numeros es:"+promedio+"\nEl producto de estos numeros es:"+producto);
	if(a<b) {
		if(b<c) {
			System.out.println("\nEL primer número es el menor");
		}}
		if(b<a) {
			if(a<c) {
				System.out.println("\nEL segundo número es el menor");
			}
		}
		if(c<b) {
			if(b<a) {
				System.out.println("\nEL tercer número es el menor");
			}}
			
			if(a>b) {
				if(b>c) {
					System.out.println("\nEL primer número es el mayor");
				}}
				if(b>a) {
					if(a>c) {
						System.out.println("\nEL segundo número es el mayor");
					}
				}
				if(c>b) {
					if(b>a) {
						System.out.println("\nEL tercer número es el mayor");
					}}
					
					if(a==b) {
						if(b<c) {
							System.out.println("\nEL primer y segundo numero son los menores\nEl tercer numero es el mayor");
						}}
						if(b==c) {
							if(c<a) {
								System.out.println("\nEL segundo y tercer numero son los menores\nEl primer numero es el mayor");
							}
						}
						if(a==c) {
							if(c<b) {
								System.out.println("\nEL primer y tercer numero son los menores\nEl segundo numero es el mayor");
							}}
							if(a==b) {
								if(b>c) {
									System.out.println("\nEL primer y segundo numero son los mayores\nEl tercer numero es el menor");
								}}
								if(b==c) {
									if(c>a) {
										System.out.println("\nEL segundo y tercer numero son los mayores\nEl primer numero es el menor");
									}
								}
								if(a==c) {
									if(c>b) {
										System.out.println("\nEL primer y tercer numero son los mayores\nEl segundo numero es el menor");
									}}
								if(a==b&b==c) {
									System.out.println("\nLos tres son el mismo numero");
								}
								}}}