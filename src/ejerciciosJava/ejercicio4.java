package ejerciciosJava;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		try (Scanner values = new Scanner(System.in)) {
			final double valor;
			double porcentaje=15;
			
			System.out.println("Ingresa un valor: ");       
			valor = values.nextInt();
			
			do {
			  double calculo = (valor * porcentaje)/100;
			  System.out.println("El porcentaje es: " + calculo);
			}
			while (valor <= 0);
		}
	}
}