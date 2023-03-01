package AyP_FigurasGeometricas;

public class Triángulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double p;
    private double a;

    public Triángulo (double ladoA, double ladoB, double ladoC) {
       
    if (ladoA > 0 && ladoB > 0 && ladoC > 0) {
            this.ladoA = ladoA;
            this.ladoB = ladoB;
            this.ladoC = ladoC;
        } else {
            System.out.println("Error: los lados deben ser positivos. Se asignará el valor 1.");
            this.ladoA = 1;
            this.ladoB = 1;
            this.ladoC = 1;
        }
    }

    public double getladoC() {
        return ladoC;
    }

    public void setladoC(double ladoC) {
        if (ladoC > 0) {
            this.ladoC = ladoC;
        } else {
            System.out.println("Error: el lado debe ser positivo. No se asignará el valor.");
        }
    }
    public double getladoB() {
        return ladoB;
    }

    public void setladoB(double ladoB) {
        if (ladoB > 0) {
            this.ladoB = ladoB;
        } else {
            System.out.println("Error: el lado debe ser positivo. No se asignará el valor.");
        }
    }
    public double getladoA() {
        return ladoA;
    }

    public void setladoA(double ladoA) {
        if (ladoA > 0) {
            this.ladoA = ladoA;
        } else {
            System.out.println("Error: el lado debe ser positivo. No se asignará el valor.");
        }
    }
    public double getPerimetro() {
    	p = ladoA + ladoB + ladoC;
    	return p;
    }

    public double getArea() {
      a = getPerimetro() / 2;
      Math.sqrt(a * (a - ladoA) * (a - ladoB) * (a - ladoC));
        return a;
    }

    public String getTipo() {
        if (ladoA == ladoB && ladoB == ladoC) {
            return "Equilatero";
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            return "Isóseles";
        } else {
            return "Escaleno";
        }

    }
   
    public boolean isRectangulo() {
        double m = ladoA * ladoA;
        double n = ladoB * ladoB;
        double ñ = ladoC * ladoC;
        boolean r = (m == n + ñ) || (n == m + ñ) || (ñ == m + n);
        System.out.print("Triangulo Rectangulo: ");

        return r;
    }
}
