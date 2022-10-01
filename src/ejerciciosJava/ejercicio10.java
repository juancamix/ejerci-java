package ejerciciosJava;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		try (Scanner values = new Scanner(System.in)) {
			int num1 = 0;
			int num2 = 0;
			int num3 = 0;
			int resultado;
			
			System.out.println("Ingrese un valor: ");
			num1 = values.nextInt();
			
			System.out.println("Ingrese un valor: ");
			num2 = values.nextInt();

			System.out.println("Ingrese un valor: ");
			num3 = values.nextInt();
			
			resultado = num1 + num2 + num3;
			
			
			while (resultado > 1) {
				System.out.println("El resultado es: " + resultado);
			}
		}
	}
}