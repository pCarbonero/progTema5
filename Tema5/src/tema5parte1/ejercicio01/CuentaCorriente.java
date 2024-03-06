package tema5parte1.ejercicio01;

/**
 * Clase que define la cuenta corriente de un cliente
 * @author pcarbonero
 */
public class CuentaCorriente {
	/**
	 * Atributo para el dni del titular
	 */
	String dni;
	/**
	 * atributo para el nombre del titular
	 */
	String nombre;
	/**
	 * atributo para almacenar el saldo de la cuenta
	 */
	double saldo;
	
	/**
	 * 
	 * @param dni
	 * @param saldo
	 */
	public CuentaCorriente(String dni, double saldo) {
		// igualamos el atributo dni al valor del parámetro si no es nulo y no es una cadena vacia
		if (dni != null && !dni.equals("")) {
			this.dni = dni;
		}
		// igualamos el valor del atributo saldo al del parámetro de entrada si no es un valor negativo
		if (saldo >= 0) {
			this.saldo = saldo;
		}
		
	}
	
	/**
	 * 
	 * @param dni
	 * @param nombre
	 * @param saldo
	 */
	public CuentaCorriente(String dni, String nombre, double saldo) {
		// igualamos el atributo dni al valor del parámetro si no es nulo y no es una cadena vacia
		if (dni != null && !dni.equals("")) {
			this.dni = dni;
		}
		
		// igualamos el valor del atributo saldo al del parámetro de entrada si no es un valor negativo
		if (saldo >= 0) {
			this.saldo = saldo;
		}
		
		// igualamos el atributo nombre al valor del parámetro si no es nulo y no es una cadena vacia
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}
	
	/**
	 * Metodo que se encarga de realizar una operacion apra sacar dinero
	 * @param solicitudRetirada indica la cantidad de dinero que se quiere retirar
	 * @return devuelve true si puede sacar dinero y false si no
	 */
	public boolean sacarDinero(double solicitudRetirada) {
		boolean puede = false;
		
		if (solicitudRetirada <= saldo) {
			puede = true;
			saldo -= solicitudRetirada;
		}
		
		return puede;
	}
	
	/**
	 * Metodo para realizar una operacion de igreso de dinero
	 * @param ingreso cantidad de dinero qeu se quiere ingresar
	 */
	public void ingresarDinero(double ingreso) {
		saldo += ingreso;
	}

	/**
	 * metodo que muestra la informacion de la cuenta
	 */
	public void mostrarInfo() {
		System.out.println("DNI TITULAR: " + dni);
		System.out.println("NOMBRE TITULAR: " + nombre);
		System.out.println("SALDO CUENTA: " + saldo);
	}
}
