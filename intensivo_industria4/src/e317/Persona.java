package e317;
import java.util.Scanner;

public class Persona {
	
	public static void main(String[] args){
		
		PerfilMedico persona = new PerfilMedico("Carlos", "Ortega", 'M', 21, 6, 2002, 1.87, 65.5);
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("PACIENTE 1");
			System.out.printf("Nombre: %s %s", persona.getName(), persona.getLastName());
			System.out.printf("%nSexo: %c", persona.getSex());
			System.out.println("");
			persona.edadPersona();
			System.out.println("");
			persona.frecCardMax();
			System.out.println("");
			persona.frecCardProm();
			System.out.println("");
			persona.iMC();
			
			System.out.println("\n\nINGRESE DATOS DE NUEVO PACIENTE");
			System.out.print("Nombre: ");
			String name = input.nextLine();
			System.out.print("Apellido: ");
			String lastName = input.nextLine();
			System.out.print("Sexo (M o F): ");
			char sex = input.next().charAt(0);
			System.out.println("Fecha de Nacimiento (DD/MM/YYYY)");
			System.out.print("Dia: ");
			int day = input.nextInt();
			System.out.print("Mes: ");
			int month = input.nextInt();
			System.out.print("Agno: ");
			int year = input.nextInt();
			System.out.print("Altura (Metros): ");
			double height = input.nextDouble();
			System.out.print("Peso (Kg): ");
			double weight = input.nextDouble();
			
			persona.setName(name);
			persona.setLastName(lastName);
			persona.setSex(sex);
			persona.setDay(day);
			persona.setMonth(month);
			persona.setYear(year);
			persona.setHeight(height);
			persona.setWeight(weight);
		}
		
		System.out.println("\nPACIENTE 2");
		System.out.printf("Nombre: %s %s", persona.getName(), persona.getLastName());
		System.out.printf("%nSexo: %c", persona.getSex());
		System.out.println("");
		persona.edadPersona();
		System.out.println("");
		persona.frecCardMax();
		System.out.println("");
		persona.frecCardProm();
		System.out.println("");
		persona.iMC();
		
		
	}

}