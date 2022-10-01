package ejerciciosJava;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		try (Scanner values = new Scanner(System.in)) {
			String respuesta;
			String valido = "Este identificador es valido o invalido??\n\n";
			valido+="numero\n";
			valido+="IVA\n";
			valido+="1x\n";
			valido+="recibido_hoy\n";
			valido+="valor 1\n";
			valido+="punto1.2\n";
			valido+="f(x,y)\n";
			valido+="fxy\n";
			valido+="funcion\n";
			valido+="recursion\n";
			
			System.out.println("Son validos?:" + valido);
			respuesta = values.next();
			
			
			if (respuesta == "no") {
				System.out.println("Es correcto");
			} else {
				System.out.println("Es incorrecto");
			}
			
		}
	}

}
