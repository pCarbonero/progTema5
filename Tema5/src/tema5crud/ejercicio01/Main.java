package tema5crud.ejercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// creamos escaner
		Scanner sc = new Scanner(System.in);
		// option
		int opc = 0;
		// nombre
		String nombre = "";
		int nota = 0;
		
		

		
		do {
			// OPCIONES
			menu();
			opc = sc.nextInt();
			sc.nextLine();
			//Switch
			switch(opc){
			case 1: {
					GestorAlumno.listaAlumnos();
					System.out.println();
					break;
				}
			case 2:{
				System.out.println("Nombre del alumno ");
				nombre = sc.nextLine();
				System.out.println("Nota del alumno ");
				nota = sc.nextInt();
				sc.nextLine();
				System.out.println();
				
				if (GestorAlumno.nuevoAlumno(nombre, nota)) {
					System.out.println("Añadido good");
				}else {
					System.out.println("Llenu :c");
				}
				System.out.println();
				break;
			}
			
			case 3: {
				
			}
			}// fin switch
		} while (opc != 5);

		
		
	}
	
	static void menu() {
		System.out.println("ALUMNOS/AS\r\n" + "===================\r\n" + "1. Listado.\r\n" + "2. Nuevo Alumno.\r\n"
				+ "3. Modificar.\r\n" + "4. Borrar.\r\n" + "5. Salir.\r\n" + "");
	}

}
