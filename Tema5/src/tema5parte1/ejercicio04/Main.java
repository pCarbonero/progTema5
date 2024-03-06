package tema5parte1.ejercicio04;

public class Main {

	public static void main(String[] args) {
		// creamos un objeto de la clas 
		Articulo art1 = new Articulo("Cort G260SE", 387, 5);
		
		//funcion imprime
		art1.imprimeInfo();
		
		// precio con descuento
		System.out.println("Precio con descuento: " + art1.getPVPDescuento(10));
		
		// vender
		art1.vender(1);
		
		//funcion imprime
		art1.imprimeInfo();
		
		// almacenar
		art1.almacenar(3);
		
		//funcion imprime
		art1.imprimeInfo();

	}

}
