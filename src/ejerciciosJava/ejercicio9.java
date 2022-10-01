package ejerciciosJava;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		try (Scanner values = new Scanner(System.in)) {
			int x = 0;
			int a = 0;
			int b = 0;
			
			System.out.println("Ingrese el valor de a: ");
			a = values.nextInt();
			
			System.out.println("Ingrese el valor de b: ");
			b = values.nextInt();
			
			x = a+(b*2*a);
			System.out.println("El resultado de x es: "+x);
		}
	}

}
