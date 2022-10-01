package ejerciciosJava;

import java.util.Scanner;

public class ejercicio26 {

	public static void main(String[] args) {
		try (Scanner values = new Scanner(System.in)) {
			int n = 0;
			int suma = 0;
			int sumaN = 0;
			
			System.out.println("Ingrese el valor de n: ");
			n = values.nextInt();
			
			suma = (n+1)*n;
			sumaN = suma/2;
			
			System.out.println("El resultado de la suma es: "+sumaN);
		}
	}

}
