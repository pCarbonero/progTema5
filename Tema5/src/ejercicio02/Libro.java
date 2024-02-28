package ejercicio02;
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
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemplares = numEjemplares;
		this.ejemplaresPrestados = ejemplaresPrestados;
	}
	
	/**
	 * metodod que comprueba si se puede realizar el prestamo ede un libro
	 * @return si se puede realizar el prestamo
	 */
	public boolean prestamo() {
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
	public boolean devolucion() {
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
