package tema5parte1.ejercicio03;
/**
 * clase que contiene la psociion de u punto en un plano
 * @author pcarbonero
 */
public class Punto {
	/**
	 * atributo para la posicion en el eje x
	 */
	private int x = 0;
	/**
	 * atributo para la posicion en el eje y
	 */
	private int y = 0;
	
	/**
	 * Constructor con lso parametros del todos los atributos
	 * @param x
	 * @param y
	 */
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * 
	 */
	void imprime() {
		System.out.println("Coordenada x: " + x);
		System.out.println("Coordenada y: " + y);
	}
	
	/**
	 * @param x
	 * @param y
	 */
	void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * 
	 * @param dx
	 * @param dy
	 */
	void desplaza(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
	
	/**
	 * 
	 * @param p
	 * @return
	 */
	double distancia(Punto p) {	
		return Math.sqrt(Math.pow((p.x-this.x), 2)) + (Math.pow((p.y-this.y), 2));
	}
	
	
	
	
}
