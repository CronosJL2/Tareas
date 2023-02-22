package e316;
import java.time.LocalDate;
import java.time.Period;

public class FrecuenciasCardiacas {


	private String name;
	private String lastName;
	private int day;
	private int month;
	private int year;
	
	public FrecuenciasCardiacas(String name, String lastName, int day, int month, int year){
		
		this.name = name;
		this.lastName = lastName;
		this.day = day;
		this.month = month;
		this.year = year;
		
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



	public void edadPersona(){
		
		LocalDate fechaNac = LocalDate.of(year, month, day);
		LocalDate ahora = LocalDate.now();
		
		Period periodo = Period.between(fechaNac, ahora);
		System.out.printf("%nEdad: %d annios", periodo.getYears());
		
	}
	
	public void frecMaxPersona(){

		LocalDate fechaNac = LocalDate.of(year, month, day);
		LocalDate ahora = LocalDate.now();
		Period periodo = Period.between(fechaNac, ahora);
		
		System.out.printf("%nFrecuencia cardiaca maxima: %d", 220 - periodo.getYears());
		
	}
	
	public void frecEspPersona(){

		LocalDate fechaNac = LocalDate.of(year, month, day);
		LocalDate ahora = LocalDate.now();
		Period periodo = Period.between(fechaNac, ahora);
		
		System.out.printf("%nRango de frecuencia cardiaca esperada: entre %.0f y %.0f", 
																			   (220 - periodo.getYears())*0.5, 
																		       (220 - periodo.getYears())*0.85);
		
	}
}
