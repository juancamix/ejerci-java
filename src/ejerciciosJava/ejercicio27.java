package ejerciciosJava;

import java.util.Scanner;

public class ejercicio27 {

	public static void main(String[] args) {
		try (Scanner values = new Scanner(System.in)) {
			int nota1 = 0;
			int nota2 = 0;
			int notaTrabajo = 0;
			int examen = 0;
			double notaDefinitiva = 0;
			
			double porcentajeA = 0;
			double porcentajeB = 0;
			double porcentajeC = 0;
			double porcentajeD = 0;
			
			System.out.println("Ingrese la primera nota: ");
			nota1 = values.nextInt();
			
			System.out.println("Ingrese la segunda nota: ");
			nota2 = values.nextInt();
			
			System.out.println("Ingrese la nota del trabajo: ");
			notaTrabajo = values.nextInt();
			
			System.out.println("Ingrese la nota del examen: ");
			examen = values.nextInt();
			
			porcentajeA = nota1*0.2;
			porcentajeB = nota2*0.2;
			porcentajeC = notaTrabajo*0.3;
			porcentajeD = examen*0.3;
			
			notaDefinitiva = porcentajeA + porcentajeB + porcentajeC + porcentajeD;
			
			System.out.println("Su nota definitiva es: "+notaDefinitiva);
		}
	}

}
