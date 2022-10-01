package ejerciciosJava;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		try (Scanner values = new Scanner(System.in)) {
			double salarioActual;
			double salarioAnterior;
			
			System.out.println("Ingrese su saldo anterior: ");
			salarioAnterior = values.nextDouble();
			
			salarioActual = (salarioAnterior +(salarioAnterior * 0.25));
			System.out.println("Su nuevo sueldo es: "+ salarioActual);
		}
	}
}