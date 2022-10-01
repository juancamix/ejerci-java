package ejerciciosJava;

import java.util.Scanner;

public class ejercicio28 {

	public static void main(String[] args) {
		try (Scanner values = new Scanner(System.in)) {
			int rendimiento = 0;
			int monto = 0;
			int interes = 0;
			int plazo = 0;
			int valor = 0;
			
			System.out.println("Ingrese el monto: ");
			monto = values.nextInt();
			
			System.out.println("Ingrese el interes: ");
			interes = values.nextInt();
			
			System.out.println("Ingrese el plazo: ");
			plazo = values.nextInt();
			
			rendimiento = monto * interes * plazo;
			valor = rendimiento/360;
			
			System.out.println("Este es el valor del rendimiento: "+(valor*-1));
		}
	}

}
