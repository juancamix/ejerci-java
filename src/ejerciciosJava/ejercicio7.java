package ejerciciosJava;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		try (Scanner values = new Scanner(System.in)) {
			int tratamiento;
			int diasHospitalizacion;
			int medicamentos;
			int dia = 100000;
			
			System.out.println("Ingrese el costo del tratamiento: ");
			tratamiento = values.nextInt();
			
			System.out.println("Ingrese los dias en que estuvo hospitalizado: ");
			diasHospitalizacion = values.nextInt();
			
			System.out.println("Ingrese el costo de sus medicamentos: ");
			medicamentos = values.nextInt();
			
			int valor = (diasHospitalizacion*dia);
			int persona = (tratamiento + diasHospitalizacion + medicamentos + valor);
			System.out.println("Su valor a pagar es: "+ persona);
		}
	}

}
