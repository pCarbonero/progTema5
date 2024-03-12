package tema5crud.ejercicio02;

/**
 * Clase que almacena array de objetos de la clase articulo
 */
public class ListaArticulos {
	static Articulo[] articulos = new Articulo[20];
	
	//
	static boolean alta(Articulo nuevoArticulo) {
		int i = 0;
		boolean anyadido = false;
		boolean encontrado = buscaArt(nuevoArticulo);
		
		// si no hay el articulo en la lista lo añadims en el primer hueco disponible
		if (!encontrado) {
			while(i < articulos.length && !anyadido) {
				if (articulos[i] == null) {
					articulos[i] = nuevoArticulo;
					anyadido = true;
				}
				
				i++;
			}
		}
		return anyadido;
	}// fin alta
	
	//
	static void baja(Articulo selecArticulo) {
		int i = 0;
		boolean borrado = false;
		
		while(i < articulos.length && !borrado) {
			if (articulos[i].equals(selecArticulo)) {
				articulos[i] = null;
				borrado = true;
			}
			
			i++;
		}
	}// fin baja
	
	//
	static boolean buscaArt(Articulo art) {
		boolean encontrado = false;
		int i = 0;
		
		while(i < articulos.length && !encontrado) {
			if (articulos[i] != null && articulos[i].equals(art)) {
				encontrado = true;
			}
			
			i++;
		}
		
		return encontrado;
	}
	
	
	//
	static boolean entradaM(int cod) {
		boolean anyadida = false;
		int i = 0;
		
		while(i < articulos.length && !anyadida) {
			
			if (articulos[i] != null && articulos[i].getCodigo() == cod) {
				articulos[i].entradaMercancia(i);
				anyadida = true;
			}

			
			i++;
		}
		
		return anyadida;
	}
	
	//MOdi
	static boolean modificacion(int cod, Articulo art) {
		boolean modif = false;
		int i = 0;
		
		while(i < articulos.length && !modif) {
			
			if (articulos[i] != null && articulos[i].getCodigo() == cod) {
				articulos[i] = art;
				modif = true;
			}			
			i++;
		}
		
		return modif;
	}
	
	
}// calse
