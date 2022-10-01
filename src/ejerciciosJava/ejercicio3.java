package ejerciciosJava;

public class ejercicio3 {

	public static void main(String[] args) {
		final double valor = 55;
	    double porcentaje = 15;

	    do {
	      double calculo = (valor * porcentaje)/100;
	      System.out.println("El porcentaje es:" + calculo);
	    } 
	    while (valor <= 0);
	}
}