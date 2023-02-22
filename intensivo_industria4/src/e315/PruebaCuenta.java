package e315;
import java.util.Scanner;
public class PruebaCuenta {
public static void main(String[] args){
		
		double deposito;
		
		Cuenta cuenta1 = new Cuenta("Maria conchita", 900.00);
		Cuenta cuenta2 = new Cuenta("El kevin", 45);
		try (Scanner input = new Scanner(System.in)) {
			PruebaCuenta.mostrarCuenta(cuenta1);
			PruebaCuenta.mostrarCuenta(cuenta2);
			
			System.out.print("\nIngrese cantidad a depositar para la primera cuenta: ");
			deposito = input.nextDouble();
			System.out.printf("%nSumado %.2f al saldo de cuenta 1%n%n", deposito);
			cuenta1.depositar(deposito);
			
			PruebaCuenta.mostrarCuenta(cuenta1);
			PruebaCuenta.mostrarCuenta(cuenta2);
			
			System.out.print("\nIngrese cantidad a depositar para la segunda cuenta: ");
			deposito = input.nextDouble();
			System.out.printf("%nSumado %.2f al saldo de cuenta 2%n%n", deposito);
			cuenta2.depositar(deposito);
			
			PruebaCuenta.mostrarCuenta(cuenta1);
			PruebaCuenta.mostrarCuenta(cuenta2);
			
			System.out.print("\nIngrese la cantidad a retirar de la primera cuenta: ");
			double montoRetiro = input.nextDouble();
			System.out.printf("%nRestado %.2f al saldo de cuenta 1%n%n", montoRetiro);
			cuenta1.retirar(montoRetiro);
			
			PruebaCuenta.mostrarCuenta(cuenta1);
			PruebaCuenta.mostrarCuenta(cuenta2);
			
			System.out.print("\nIngrese la cantidad a retirar de la segunda cuenta: ");
			montoRetiro = input.nextDouble();
			System.out.printf("%nRestado %.2f al saldo de cuenta 2%n%n", montoRetiro);
			cuenta2.retirar(montoRetiro);
		
		
		PruebaCuenta.mostrarCuenta(cuenta1);
		PruebaCuenta.mostrarCuenta(cuenta2);
		}
	}
	
	public static void mostrarCuenta(Cuenta cuentaAMostrar){
		
		System.out.printf("Saldo de %s: $%.2f%n", 
				cuentaAMostrar.obtenerNombre(), cuentaAMostrar.obtenerSaldo());
		
	}
}
