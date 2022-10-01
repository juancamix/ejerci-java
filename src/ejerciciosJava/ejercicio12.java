package ejerciciosJava;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		try (Scanner values = new Scanner(System.in)) {
			double nota1;
			double nota2;
			double nota3;
			double promedio;
			
			for (int i = 0; i < 2; i++) {
				System.out.println("Ingrese la nota 1: ");
				nota1 = values.nextInt();
				
				System.out.println("Ingrese la nota 2: ");
				nota2 = values.nextInt();
				
				System.out.println("Ingrese la nota 3: ");
				nota3 = values.nextInt();
				
				promedio = (nota1 + nota2 + nota3)/3;
				
				System.out.println("Su promedio es: "+ promedio);
			}
		}
	}

}
