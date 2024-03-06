package tema5parte1.ejercicio02;

public class Main {

	public static void main(String[] args) {
		// creamos objeto de la clase libro
		Libro lb = new Libro("La Palabra", "Irving Wallace", 15, 5);
		
		System.out.println("Hay " + lb.getNumEjemplares() + " en total");
		System.out.println("Hay " + lb.getEjemplaresPrestados() + " prestados");
		
		// comrprobamos si se puede prestar el libro
		if (lb.prestamo()) {		
			System.out.println("Se puede realizar el préstamo");
		}else {
			System.out.println("No se puede realaizar el préstamo");
		}
		
		// comprobamos que se puede realizar la devolución
		if (lb.devolucion()) {			
			System.out.println("Se puede realizar la devolución");
		}else {
			System.out.println("No se puede realaizar la devolución");
		}
		
		System.out.println("Hay " + lb.getNumEjemplares() + " en total");
		System.out.println("Hay " + lb.getEjemplaresPrestados() + " prestados");

	}

}
