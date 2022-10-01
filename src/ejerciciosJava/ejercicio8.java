package ejerciciosJava;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		try (Scanner values = new Scanner(System.in)) {
			int base;
			int altura;
			
			System.out.println("Ingrese el valor de la base: ");
			base = values.nextInt();
			
			System.out.println("Ingrese el valor de la altura: ");
			altura = values.nextInt();
			
			final double area = (base*altura)/2;
			
			System.out.println("El area es: "+ area);
		}
	}
}