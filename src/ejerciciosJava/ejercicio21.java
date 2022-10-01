package ejerciciosJava;

import javax.swing.JOptionPane;

public class ejercicio21 {

	public static void main(String[] args) {
		
		 double salarioBase=0, salarioTotal=0;
	        final int VALOR_HORA=40000;
	        int cantHoras=0;
	        double descuento=0;
	       
	       
	       
	            cantHoras=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la "
	                    + "cantidad de horas trabajadas"));
	           
	            salarioBase=cantHoras*VALOR_HORA;
	            descuento=salarioBase*0.1;
	            salarioTotal=salarioBase-descuento;
	           
	           
	            String mensaje="RESULTADO CALCULO\n";
	            mensaje+="Su salario base es: "+salarioBase+"\n";
	            mensaje+="Su salario total con descuento es: "+salarioTotal;
	           
	            System.out.println(mensaje);
	           
	            System.out.println("---------------------------------------");
	           
	        
		
	}

}
