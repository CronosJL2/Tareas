package e317;
import java.time.LocalDate;
import java.time.Period;

public class PerfilMedico {
	
	private String name;
	private String lastName;
	private char sex;
	private int day;
	private int month;
	private int year;
	private double height;
	private double weight;
	
	public PerfilMedico(String name, String lastName, char sex, int day, 
											int month, int year, double height, double weight){
		
		this.setName(name);
		this.setLastName(lastName);
		this.setSex(sex);
		this.setDay(day);
		this.setMonth(month);
		this.setYear(year);
		this.setHeight(height);
		this.setWeight(weight);
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void edadPersona(){
		
		LocalDate fechaNac = LocalDate.of(year, month, day);
		LocalDate ahora = LocalDate.now();
		Period periodo = Period.between(fechaNac, ahora);
		
		System.out.printf("Edad: %d", periodo.getYears());
		
	}
	
	public void frecCardMax(){
		
		LocalDate fechaNac = LocalDate.of(year, month, day);
		LocalDate ahora = LocalDate.now();
		Period periodo = Period.between(fechaNac, ahora);
		
		System.out.printf("Frecuencia Cardiaca Maxima: %d", 220 - periodo.getYears());
		
	}
	
	public void frecCardProm(){
		
		LocalDate fechaNac = LocalDate.of(year, month, day);
		LocalDate ahora = LocalDate.now();
		Period periodo = Period.between(fechaNac, ahora);
		
		System.out.printf("Rango de Frecuencia Cardiaca Promedio: %.0f y %.0f",
																				(220 - periodo.getYears())*0.5, 
																				(220 - periodo.getYears())*0.85);
		
	}
	
	public void iMC(){
		
		double imc;
		
		imc = weight/(height*height);
		
		if(imc < 18.5){
			System.out.printf("IMC es: %.2f **BAJO DE PESO**", imc);
		}
		else if(imc >= 18.5 && imc <= 24.9){
			System.out.printf("IMC es: %.2f **NORMAL**", imc);
		}
		else if(imc >= 25 && imc <= 29.9){
			System.out.printf("IMC es: %.2f **SOBREPESO**", imc);
		}
		else{
			System.out.printf("IMC es: %.2f **OBESIDAD**", imc);
		}
		
	}}