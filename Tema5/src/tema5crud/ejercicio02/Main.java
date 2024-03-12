package tema5crud.ejercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// scaner
		Scanner sc = new Scanner(System.in);
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
				break;
				}
			case 3: {
				// Baja
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
				
				if(ListaArticulos.entradaM(codigo)) {
					System.out.println("Cantidad añadida ");
				}
				else {
					System.out.println("Hubo un error. Operación interrumpida");
				}
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
