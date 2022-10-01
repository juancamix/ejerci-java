package ejerciciosJava;

import javax.swing.JOptionPane;

public class ejercicio16 {

	public static void main(String[] args) {
		double precio = 0,cuenta=0,devuelta=0,valorPagado=0;
        int cantidad=0;
        int codigo=0;
       
       
        String menu="MENU OPCIONES\n\n";
        menu+="1. Balon\n";
        menu+="2. Muñeco\n";
        menu+="3. Gorra\n";
        menu+="4. Tennis\n";
        menu+="5. Salir\n\n";
        menu+="Ingrese una opción\n";
       
        do {
            ///
            int noExiste=0;
            codigo=Integer.parseInt(JOptionPane.
                    showInputDialog(menu));
           
            switch (codigo) {
            case 1:System.out.println("Balon");
                precio=100;
                break;
            case 2:System.out.println("Muñeco");
                precio=200;
                break;
            case 3:System.out.println("Gorra");
                precio=50;
                break;
            case 4:System.out.println("Tennis");
                precio=250;
                break;
            case 5:System.out.println("Salir");
                noExiste=1;
                break;
            default:System.out.println("No existe el producto");
                noExiste=1;
                break;
            }
           
            if(noExiste==0) {
                cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de articulos"));
                cuenta=cantidad*precio;
               
                valorPagado=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor a pagar"));
                devuelta=valorPagado-cuenta;
               
                System.out.println("Cuenta: "+cuenta);
                System.out.println("Valor pagado: "+valorPagado);
               
                if (devuelta<0) {
                    System.out.println("Hace falta $"+(devuelta*-1));
                }else {
                    System.out.println("Devuelta: "+devuelta);
                }
               
            }
           
            ///            

        }while(codigo!=5);
	}
	
}


