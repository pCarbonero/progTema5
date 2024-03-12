package tema5crud.ejercicio01;

public class GestorAlumno {
	static Alumno[] alumnos = new Alumno[30];

	static void listaAlumnos() {
		for (Alumno nombre : alumnos) {
			if (nombre != null) {
				System.out.println(nombre);
			}
		}
	}

	public static boolean nuevoAlumno(String nombre, double nota) {
		Alumno alumn = new Alumno(nombre, nota);
		int i = 0;
		boolean anyadido = false;

		while (i < alumnos.length && alumnos[i] != null) {
			i++;
		}

		if (i < alumnos.length) {
			alumnos[i] = alumn;
			anyadido = true;
		}

		return anyadido;
	}
	
	public static boolean modi(String nombre, double nota) {		
		int i = 0;
		boolean mod = false;


		if (i < alumnos.length) {
			alumnos[i].setNotaMedia(nota);
		}

		return mod;
	}
}
