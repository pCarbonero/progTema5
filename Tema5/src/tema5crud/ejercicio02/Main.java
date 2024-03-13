package tema5crud.ejercicio02;

import java.util.Scanner;

public class Main {
	// scaner
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		//obj articulo
		Articulo art;
		//  variables para los atributos de la clase articulo
		int codigo;
		String descripcion;
		double precioCompra;
		double precioVenta;
		int stock;
		int cantidad;
		
		int opc = 0;
		
		// bucle do while para pedir opciones
		do {
			// mostramos el menu
			menu();
			opc = sc.nextInt();
			// vaciamos escaner
			sc.nextLine();
			
			// switch para la opcion elegida
			switch (opc) {
			case 1: {
				// LISTADO
				break;
				}
			case 2: {
				altaArticulo();
				break;
				}
			case 3: {
				bajaArticulo();
				break;
				}
			case 4: {
				System.out.println("Dime el codigo del articulo que quieres añadir mercancia ");
				codigo = sc.nextInt();
				sc.nextLine();
				System.out.println();
				System.out.println("Dime la cantidad a añadir ");
				cantidad = sc.nextInt();
				sc.nextLine();
				System.out.println();
				art = new Articulo(codigo);

				
				System.out.println();
				break;
				}
			case 5: {
				// Entrada de mercancia
				break;
				}
			case 6: {
				// Salida de mercancia
				break;
				}
			case 7: {
				// Salir
				break;
				}
			}
		} while (opc != 7);
		
		
		
	}

	/**
	 * Metodo qeu realiza la segunda opcion del switch case
	 */
	private static void altaArticulo() {
		Articulo art;
		int codigo;
		String descripcion;
		double precioCompra;
		double precioVenta;
		int stock;
		System.out.println("Introduzca el código");
		codigo = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Introduzca la descripción");
		descripcion = sc.nextLine();
		
		System.out.println("Introduzca el precio compra");
		precioCompra = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Introduzca el precio venta");
		precioVenta = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Introduzca el stock");
		stock = sc.nextInt();
		sc.nextLine();
		
		art = new Articulo(codigo, descripcion, precioCompra, precioVenta, stock);

		if(ListaArticulos.alta(art)) {
			System.out.println("Artículo añadido correctamente");
		} else {
			System.out.println("No se ha podido añadir el artículo");
		}
	}
	
	/**
	 * Metodo qeu realiza la tercera opcion del switch case
	 */
	private static void bajaArticulo() {
		Articulo art;
		int codigo;

		System.out.println("Introduzca el código");
		codigo = sc.nextInt();
		sc.nextLine();
		
		
		art = new Articulo(codigo);

		if(ListaArticulos.baja(art)) {
			System.out.println("Artículo borrado correctamente");
		} else {
			System.out.println("No se ha podido borrar el artículo");
		}
	}
	
	/**
	 * Metodo que se encarga de imprimir el menu
	 */
	static void menu() {
		System.out.println("----MENU----");
		System.out.println("ELIGE UNA OPCION:\n");
		System.out.println("1. Listado\r\n"
				+ "2. Alta\r\n"
				+ "3. Baja\r\n"
				+ "4. Modificación\r\n"
				+ "5. Entrada de mercancía\r\n"
				+ "6. Salida de mercancía\r\n"
				+ "7. Salir\r\n");
	}

}
