package AyP_FigurasGeometricas;
import java.util.Scanner;
public class PruebaFiguras {

	public static void main(String[] args) {
		double radio;
		double base;
		double altura;
		double ladoA;
		double ladoB;
		double ladoC;
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Círculo");
		 System.out.print("Introduzca el radio: ");
	     radio = scanner.nextDouble();
	     Circulo prue = new Circulo (radio);
	     
	     System.out.println("Radio: " + prue.getR());
	     System.out.println(prue.getP());
		 System.out.println(prue.getA());


		 System.out.println("");
		 System.out.println("Rectángulo");
			 System.out.print("Introduzca la base: ");
		     base = scanner.nextDouble();
		     
		     System.out.print("Introduzca la altura: ");
		     altura = scanner.nextDouble();
		     
		     Rectangulo rec = new Rectangulo (base, altura);	     
		     System.out.println("Base: " + rec.getB());
		     System.out.println("Altura: " + rec.getH());
		     System.out.println(rec.getP());
			 System.out.print(rec.getA());
			 System.out.print(rec.getC());

		 System.out.println("");
	   System.out.println("Triángulo");
				 
				 System.out.print("Introduzca el lado 1: ");
			     ladoA = scanner.nextDouble();
			     
			     System.out.print("Introduzca el lado 2: ");
			     ladoB = scanner.nextDouble();
			     
			     System.out.print("Introduzca el lado 3: ");
			     ladoC = scanner.nextDouble();
			     
			     Triángulo tri = new Triángulo (ladoA,ladoB,ladoC);
			     
			     System.out.println("Lado 1: " + tri.getladoA());
			     System.out.println("Lado 2: " + tri.getladoB());
			     System.out.println("Lado 3: " + tri.getladoC());
			     System.out.println("Perimetro: " + tri.getPerimetro());
				 System.out.println("Area: " + tri.getArea());
		         System.out.println("Tipo de triangulo: " + tri.getTipo());
		         System.out.println(tri.isRectangulo());
				 
				 
			 scanner.close();
			}
	}