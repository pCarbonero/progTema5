package ejercicio02;

import java.io.ObjectInputStream.GetField;

/**
 * Clase que uarda info de cada uno de los libros en uan biblioteca
 * @author pcarbonero
 */
public class Libro {
	String titulo;
	String autor;
	int numEjemplares;
	int ejemplaresPrestados;
	
	/**
	 * Constructor sin parametros
	 */
	public Libro() {
		
	}
	
	/**
	 * Constructor con parametros para todos los atributos de la clase
	 * @param titulo
	 * @param autor
	 * @param numEjemplares
	 * @param ejemplaresPrestados
	 */
	public Libro(String titulo, String autor, int numEjemplares, int ejemplaresPrestados) {
		// si el titulo no es nulo y no es cadena vacia
		if (titulo != null && !titulo.equals("")) {
			this.titulo = titulo;
		}
		
		// si el autor no es nulo ni cadena vacia
		if (autor != null && !autor.equals("")) {
			this.autor = autor;
		}

		// sin el valor es positivo o 0
		if (numEjemplares >= 0) {
			this.numEjemplares = numEjemplares;
		}
		
		// sin el valor es positivo o 0
		if (ejemplaresPrestados >= 0) {
			this.ejemplaresPrestados = ejemplaresPrestados;
		}
	}
	
	/**
	 * Get
	 */
	public int getNumEjemplares() {
		return numEjemplares;
	}
	public int getEjemplaresPrestados() {
		return ejemplaresPrestados;
	}
	
	/**
	 * metodod que comprueba si se puede realizar el prestamo ede un libro
	 * @return si se puede realizar el prestamo
	 */
	boolean prestamo() {
		boolean sePuede = true;
		
		if (numEjemplares > ejemplaresPrestados) {
			ejemplaresPrestados++;
		}
		else {
			sePuede = false;
		}
		
		return sePuede;
	}
	
	/**
	 * Metodo que comprueba si se puede realizar la devolucion de un libro
	 * @return si se puede devolver el libro
	 */
	boolean devolucion() {
		boolean sePuede = true;
		if (ejemplaresPrestados > 0) {
			ejemplaresPrestados--;
		}
		else{
			sePuede = false;
		}
		return sePuede;
	}
}
