package tema5crud.ejercicio02;

/**
 * Clase que almacena info de los articulos en un almacen
 * @author Propietario
 * @version 1.0
 */
public class Articulo {
	/**
	 * Atr que alamcena el id del articulo
	 */
	private int codigo;
	/**
	 * Atr que almacenaa la desc del articulo
	 */
	private String descripcion;
	/**
	 * 
	 */
	private double precioCompra;
	/**
	 * 
	 */
	private double precioVenta;
	/**
	 * 
	 */
	private int stock;
	
	//CONSTRUCTORES
	/**
	 * Constructor sin parámetros
	 */
	public Articulo() {
	}
	
	/**
	 * Constructor con parámetros
	 * @param codigo Código del artículo
	 * @param descripcion Descripción del artículo
	 * @param precioCompra El precio al que se ha comprado el artículo
	 * @param precioVenta El precio al que se vende el artículo
	 * @param stock Número de existencias disponibles del artículo
	 */
	public Articulo(int codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
		if(codigo>0) {
			this.codigo = codigo;
		}
		
		if(descripcion != null && !descripcion.equals("")) {
			this.descripcion = descripcion;
		}
		
		if(precioCompra>0) {
			this.precioCompra = precioCompra;
		}
		
		if(precioVenta>0) {
			this.precioVenta = precioVenta;
		}
		
		if(stock>=0){
			this.stock = stock;
		}
		
	} // fin constructor
	
	
	//GETTERS ANF SETTERS
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(int precioCompra) {
		this.precioCompra = precioCompra;
	}
	public double getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(int precioVenta) {
		this.precioVenta = precioVenta;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	//METODOS
	/**
	 * metodo que añade mercancia
	 * @param cantidad cantidad qeu se le añade a stock
	 */
	public void entradaMercancia(int cantidad) {
		this.stock += cantidad;
	}
	
	/**
	 * Metodo que reduce stock
	 * @param cantidad cantidad qeu se le quita a stock
	 * @return si es posible o no realizar la retirada
	 */
	public boolean salidaMercancia(int cantidad) {
		boolean esPosible = true;
		
		if (this.stock >= cantidad) {
			this.stock -= cantidad;
		}
		else {
			esPosible = false;
		}
		
		return esPosible;
	}
	
	// TO STRING
	@Override
	public String toString() {
		String cadena = "";
		
		cadena += "Código: " + this.codigo + "\n";
		cadena += "Descripción: " + this.descripcion + "\n";
		cadena += "Precio compra: " + this.precioCompra + "\n";
		cadena += "Precio venta: " + this.precioVenta + "\n";
		cadena += "Stock: " + this.stock + "\n";

		return cadena;
	}
	
	// EQUALS
	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;
		
		Articulo art2 = (Articulo) obj;
		
		if(this.codigo == art2.codigo) {
			iguales = true;
		}
		
		return iguales;
	}
	
}
