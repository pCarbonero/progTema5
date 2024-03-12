package tema5crud.ejercicio01;

/**
 * Clase que almacena infomacion de alumnos
 * @author pcarbonero
 */
public class Alumno {
	/**
	 * Atributo que almacena el nombre
	 */
	private String nombre = "";
	/**
	 * Atributo que almacena la nota media del alumno
	 */
	private double notaMedia = 0;
	
	/**
	 * Constructor sin parametros
	 */
	public Alumno() {
		
	}
	
	/**
	 * Constructor con parametros
	 * @param nombre nombre del alumno
	 * @param notaMedia nota media del alumno
	 */
	public Alumno(String nombre, double notaMedia) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (notaMedia > 0) {
			this.notaMedia = notaMedia;
		}
	}
	
	//GET Y SET
	
	/**
	 * Metodo que devuelve el nombre del alumno
	 */
	public String getNombre() {
		return this.nombre;
	}
	/**
	 * Metodo que modifica el nombre del alumno
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}
	/**
	 * Metodo que devuelve la nota media del alumno
	 */
	public double getNotaMedia() {
		return this.notaMedia;
	}
	/**
	 * Metodo que modifica la nota media del alumno
	 */
	public void setNotaMedia(double notaMedia) {
		if (notaMedia > 0) {
			this.notaMedia = notaMedia;
		}
	}
	
	// MÉTODOS
	
	
	// toString
	/**
	 * Metodo que devuelve la informacion del al clae en una cadena
	 */
	public String toString() {
		return this.nombre + ": " + this.notaMedia;	
	}
	
}// class
