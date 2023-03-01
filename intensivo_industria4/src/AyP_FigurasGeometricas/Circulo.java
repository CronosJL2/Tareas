package AyP_FigurasGeometricas;

public class Circulo {
    double r;
    double a;
    double p;
    
    public Circulo(double r) {
  	  this.r=r;	}


	public double getR() {
		if(r<=0) {
			r=0.0;
			System.out.println("Error ");
		}else {
			System.out.print("");
		}
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public double getA() {
      a = 3.1416*(r*r);
		
		if (r<=0) {
			a = 0.0;
			System.out.print("Error ");
		}else {
			System.out.print("El área es: ");
		}
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getP() {
		p = 3.1416*2*r;
		if(p<=0){
			p = 0.0;
		System.out.print("Error ");	
		}else {
			System.out.print("El perímetro es: ");
		}
		return p;
	}

	public void setP(double p) {
		this.p = p;
	}
}