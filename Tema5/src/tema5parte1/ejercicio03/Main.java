package tema5parte1.ejercicio03;

public class Main {

	public static void main(String[] args) {
		// creamos primer objeto de la clase
		Punto p1 = new Punto(1,3);
		// creamos otro objeto de la clase
		Punto p2 = new Punto(7, 11);
		
		// probamos función imprime
		p1.imprime();
		
		p1.setXY(4, 3);
		System.out.println();
		p1.imprime();
		System.out.println();
		p1.desplaza(1, 1);
		p1.imprime();
		
		System.out.println(p1.distancia(p2));

	}

}
