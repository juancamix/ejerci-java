package ejerciciosJava;

import java.util.Scanner;

public class ejercicio25 {

	public static void main(String[] args) {
		try (Scanner values = new Scanner(System.in)) {
			double salarioTotal = 0;
			int salario = 0;
			double descuentoN = 0;
			double descuento = 0;
			
			System.out.println("Ingrese el salario: ");
			salario = values.nextInt();
			
			System.out.println("Ingrese el incremento: ");
			descuentoN = values.nextInt();
			
			
			descuento = descuentoN/100;
			descuentoN = salario*descuento;
			salarioTotal = (salario + descuentoN);
			
			System.out.println("Este es su salario final: "+salarioTotal);
		}
	}

}
