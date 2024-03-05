package ejercicio01;

public class Main {

	public static void main(String[] args) {
		// creamos un objeto de la clase
		CuentaCorriente cc = new CuentaCorriente("29587038E", "Pablo Carbonero Almellones", 200);
		// boolean para saber si se peude sacar dinero
		boolean puedeSacar;

		cc.mostrarInfo();
		
		// CAMBIOS
		System.out.println("-------");
		System.out.println("CAMBIOS");
		System.out.println("-------");
		
		// llamada al metodo para ingresar dinero
		cc.ingresarDinero(400);
		
		puedeSacar = cc.sacarDinero(100);
		if (!puedeSacar) {
			System.out.println("No hay dinero suficente para esa operación");
		}
		else {
			System.out.println("Operación realizada con éxito ");
		}
		
		cc.mostrarInfo();
	}

}
