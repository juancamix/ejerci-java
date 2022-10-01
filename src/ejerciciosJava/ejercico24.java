package ejerciciosJava;

import java.util.Scanner;

public class ejercico24 {

	public static void main(String[] args) {
		try (Scanner values = new Scanner(System.in)) {
			double salarioTotal = 0;
			int salario = 0;
			double descuento = 0;
			
			System.out.println("Ingrese el salario: ");
			salario = values.nextInt();
			
			descuento = salario*0.25;
			salarioTotal = (salario + descuento);
			
			System.out.println("Este es su salario final: "+salarioTotal);
		}
	}
}