package ejerciciosJava;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		try (Scanner values = new Scanner(System.in)) {
			int saldo;
			int horas;
			int extras=3000;
			
			for (int i = 0; i < 3; i++) {
				System.out.println("Ingrese su sueldo: ");
				saldo = values.nextInt();
				
				System.out.println("Ingrese las cantidad de las horas extras en que trabajo: ");
				horas = values.nextInt();
				
				double valor = (horas*extras);
				final double calculo = saldo + valor;
				
				System.out.println("Su saldo final es: "+ calculo);              
	        }			
		}
	}
}